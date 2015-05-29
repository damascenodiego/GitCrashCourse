package id_a55503a13323afae84ea77e3c49b077b;

import br.usp.icmc.ssc01032015.Competitor;

public class Player implements Competitor {
	double total;
	double received;
	int strategy;
	
	public double declareDonationTo(Competitor c) {
		return 0;
	}
	
	public void informDonationFrom(Competitor c, double donation) {
		received = donation;
	}
	
	public void addCash(double amount) {
		total += amount;
	}
	
	public double getTotalCash() {
		return total;
	}
}
