package id_afd29ea84776a187e29706c4df0b957b;

public interface Competitor {

	double declareDonationTo(Competitor c);
	void informDonationFrom(Competitor c, double donation);
	void addCash(double amount);
	double getTotalCash();
	
}
