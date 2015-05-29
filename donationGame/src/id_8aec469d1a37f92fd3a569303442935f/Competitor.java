package id_8aec469d1a37f92fd3a569303442935f;

public interface Competitor {
	//indicates how much to donate to competitor c
	double declareDonationTo(Competitor c);
	
	//indicates how much was donated from competitor c
	void informDonationFom(Competitor c, double donation);
	
	//adds the amount of cash
	void addCash(double amount);
	
	//get the amount of cash this competitor has
	double getTotalCash();
}
