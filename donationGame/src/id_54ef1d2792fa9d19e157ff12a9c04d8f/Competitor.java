package id_54ef1d2792fa9d19e157ff12a9c04d8f;

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
