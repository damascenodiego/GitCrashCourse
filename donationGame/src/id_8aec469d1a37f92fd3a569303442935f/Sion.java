package id_8aec469d1a37f92fd3a569303442935f;

import br.usp.icmc.ssc01032015.Competitor;

/* Esse competidor doa 0 todas as rodadas
 */

public class Sion extends Player implements Comparable<Player> {
	private double TotalCash;
	
	public Sion() {
		TotalCash = 0;
		strategy_number = 2;
	}

	public double declareDonationTo(Competitor c) {
		return 0;
	}

	public void informDonationFom(Competitor c, double donation) {
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
