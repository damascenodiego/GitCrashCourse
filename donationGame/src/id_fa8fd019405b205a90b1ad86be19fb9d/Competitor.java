package id_fa8fd019405b205a90b1ad86be19fb9d;

public interface Competitor {

	// Indicates how much to donate to Competitor c
	double declareDonationTo(Competitor c);

	// Indicates how much was donated from Competitor c
	void informDonationFrom(Competitor c, double donation);

	// Adds the amount of cash
	void addCash(double amount); 

	// Get the amount of cash this competitor has
	double getTotalCash();

}
