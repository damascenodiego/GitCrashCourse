package br.usp.icmc.ssc01032015;

public interface Competitor {
	// Indicates how much to donate to this competitor
	double declareDonationTo(Competitor s);
	// Indicates how much was donated from this competitor
	void informDonationFrom(Competitor s, double donation);
	// Adds the amount of cash
	void addCash(double amount);
	// Get the amount of cash this competitor has
	double getCash();
}