
/*
* 
* Thu Apr  2 23:43:19 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import java.util.ArrayList;
import java.util.Collections;

public class Championship {

	private int rounds;

	private int registrations;

	private ArrayList<MyCompetitor> competitors;

	private ArrayList<Match> matches;

	public Championship(int rounds, ArrayList<MyCompetitor> competitors) {
		this.rounds = rounds;
		this.registrations = competitors.size();
		this.competitors = competitors;
		this.matches = new ArrayList<Match>();
	}

	public void Start() {
		this.OrganizeMatches();
		this.RunChampionship();
	}

	public void Finish() {
		this.SortByCash();
		this.ListAllCompetitors();
	}

	public void OrganizeMatches() {
		for(int i = 0 ; i < (this.registrations - 1) ; i++)
			for(int j = (i + 1) ; j < this.registrations ; j++)
				this.matches.add(new Match(this.competitors.get(i), this.competitors.get(j)));
	}

	public void RunChampionship() {
		for(int i = 0 ; i < this.rounds ; i++) this.Round(i);
		this.Finish();
	}

	public void Round(int round) {
		for(int i = 0 ; i < this.matches.size() ; i++) this.Match(i);
	}

	public void Match(int match) {
		this.matches.get(match).DoMatch();
	}

	public void SortByCash() {
		Collections.sort(this.competitors, new MyCompetitorComparator());
	}

	public void ListAllCompetitors() {
		for(int i = 0 ; i < this.competitors.size() ; i++)
			System.out.println((i+1)+"??\t:\t"+this.competitors.get(i).getName()+"\t-\t$"+this.competitors.get(i).getTotalCash());
	}
}
