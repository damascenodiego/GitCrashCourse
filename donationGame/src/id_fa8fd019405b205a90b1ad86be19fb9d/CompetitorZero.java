package id_fa8fd019405b205a90b1ad86be19fb9d;

public class CompetitorZero implements Competitor{
	
	private double totalCash = 0.0;
	
	@Override
	public double declareDonationTo(Competitor c) {
		return 0.0;
	}

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		
	}
	
	@Override
	public void addCash(double amount) {
		totalCash += amount;
	}

	@Override
	public double getTotalCash() {
		return totalCash;
	}

}
