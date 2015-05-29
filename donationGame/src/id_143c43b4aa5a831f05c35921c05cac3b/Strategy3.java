package id_143c43b4aa5a831f05c35921c05cac3b;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy3 implements Competitor {

	public String ID = "143c43b4aa5a831f05c35921c05cac3b";

	private double total=0;
	private double donated;
	private double decision;

	public double declareDonationTo(Competitor x) {
		decision = donated;
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
