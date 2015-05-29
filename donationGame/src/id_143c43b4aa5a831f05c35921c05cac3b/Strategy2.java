package id_143c43b4aa5a831f05c35921c05cac3b;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy2 implements Competitor {

	public String ID = "143c43b4aa5a831f05c35921c05cac3b";
	
	private double total=0;
	private double donated;
	private double decision;

	public double declareDonationTo(Competitor x) {
		if(donated > 0 && donated < 5) {
			decision = donated/2;
		} else {
			decision = 5;
		}
		return decision;
	}
	public void informDonationFrom(Competitor x, double donation) {
		donated = donation;
	}
	public void addCash(double amount) {
		total += amount;
	}
	public double getTotalCash() {
		return total;
	}
}
