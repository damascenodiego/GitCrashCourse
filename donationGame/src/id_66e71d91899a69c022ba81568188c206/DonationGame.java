
/*
* 
* Thu Apr  2 18:59:13 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import java.util.ArrayList;
import java.util.Scanner;

public class DonationGame {

	private Championship championship;

	private ArrayList<Integer> registrations;

	private ArrayList<MyCompetitor> competitors;

	public DonationGame(ArrayList<Integer> registrations) {
		this.championship = null;
		this.registrations = registrations;
		this.competitors = new ArrayList<MyCompetitor>();
	}

	public void DoRegistrations() {
		for(int i = 0 ; i < this.registrations.size() ; i++) {
			for(int j = 0 ; j < this.registrations.get(i).intValue() ; j++) {
				if(i == 0) this.competitors.add(new AlanTuring());
				if(i == 1) this.competitors.add(new JohnvonNeumann());
				if(i == 2) this.competitors.add(new LinusTorvalds());
				if(i == 3) this.competitors.add(new LarryPage());
				if(i == 4) this.competitors.add(new MarkZuckerberg());
			}
		}
	}

	public void StartChampionship(int rounds) {
		this.DoRegistrations();
		this.championship = new Championship(rounds, this.competitors);
		this.championship.Start();
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int rounds = Integer.parseInt(s.next());
		ArrayList<Integer> registrations = new ArrayList<Integer>();

		while(s.hasNext()) registrations.add(new Integer(Integer.parseInt(s.next())));

		DonationGame dg = new DonationGame(registrations);
		dg.StartChampionship(rounds);
	}
}
