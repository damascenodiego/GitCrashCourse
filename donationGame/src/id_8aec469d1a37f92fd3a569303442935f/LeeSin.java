package id_8aec469d1a37f92fd3a569303442935f;
import java.util.ArrayList;

import br.usp.icmc.ssc01032015.Competitor;

/* Esse competidor doa 5 na primeira rodada e a partir da segunda doa a m??dia aritim??tica das doa????es 
 * anteriores do competidor com quem est?? participando nessa rodada.
 */

public class LeeSin extends Player implements Comparable<Player> {
	private double TotalCash;
	private int n_encounters, n_competitors, n_rounds;
	ArrayList<Double> received_cash = new ArrayList<Double>();
	ArrayList<Competitor> competitors = new ArrayList<Competitor>();

	public LeeSin() {
		TotalCash = 0;
		n_encounters = 0;
		n_competitors = 0;
		strategy_number = 1;
	}

	public double declareDonationTo(Competitor c) {
		int i;
		boolean flag = false;
		
		for(i=0; i<competitors.size(); i++) {
			if(competitors.get(i).equals(c)) {
				flag = true;
				break;
			}
		}
		
		if(flag) { //se n??o ?? a primeira vez que doo pro competidor
			
			n_rounds = ((int) n_encounters/n_competitors);
			return received_cash.get(i)/(n_rounds);
			
		} else {  //se ?? a primeira vez que doo pro competidor
			
			return 5;
			
		}
		
	}

	public void informDonationFom(Competitor c, double donation) {
		boolean flag = false;
		int i;
		
		//vendo se o competidor c j?? doou antes
		//caso tenha doado, isso significa que j?? estamos em outra rodada
		for(i=0; i<competitors.size(); i++) {
			if(competitors.get(i).equals(c)) {
				flag = true;
				break;
			}
		}
		
		
		if(flag) {     //se n??o estamos mais no primeiro round
			
			received_cash.set(i, received_cash.get(i)+donation);
			
		} else {       //se estamos no primeiro round
			
			//adicionando o competitor no caso de ainda estarmos na primeira rodada
			competitors.add(c);
			received_cash.add(donation);
			n_competitors++;
			
		}
		
		n_encounters++;
	}

	public void addCash(double amount) {
		this.TotalCash += amount;
	}

	public double getTotalCash() {
		return TotalCash;
	}
	
	public int compareTo(Player p) {
		 
		double compareQuantity = ((Player) p).getTotalCash(); 

		//descending order
		if(compareQuantity - this.TotalCash == 0)
			return 0;
		else
			return ((int) (compareQuantity - this.TotalCash));
 
	}
	
}
