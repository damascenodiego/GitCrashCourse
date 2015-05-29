package id_54899ba8e5646e372a5203d15e56af0a;

public interface Competitor {
	double declareDonationTo(Competitor c);
	void informDonationFrom(Competitor c, double donation);
	void addCash(double amount);
	double getTotalCash();
}