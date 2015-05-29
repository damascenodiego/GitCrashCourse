package id_5dc983122d11fea8280626234a25789f;

public interface Competitor {
	double declareDonationTo(Competitor c);
	void informDonationFrom(Competitor c, double donation);

	void addCash(double amount);
	double getTotalCash();
}
