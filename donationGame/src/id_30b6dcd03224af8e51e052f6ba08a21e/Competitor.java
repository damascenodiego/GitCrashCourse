
package id_30b6dcd03224af8e51e052f6ba08a21e;

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
