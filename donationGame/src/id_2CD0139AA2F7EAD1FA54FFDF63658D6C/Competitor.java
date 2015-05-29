
package id_2CD0139AA2F7EAD1FA54FFDF63658D6C;

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
