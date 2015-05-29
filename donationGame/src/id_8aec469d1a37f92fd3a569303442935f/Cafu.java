package id_8aec469d1a37f92fd3a569303442935f;
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

/* Esse competidor doa um n??mero aleat??rio toda rodada
 */

public class Cafu extends Player implements Comparable<Player> {
	private double TotalCash;
	Random random_generator = new Random();
	
	public Cafu() {
		TotalCash = 0;
		strategy_number = 5;
	}

	public double declareDonationTo(Competitor c) {
		return random_generator.nextInt(11);
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

