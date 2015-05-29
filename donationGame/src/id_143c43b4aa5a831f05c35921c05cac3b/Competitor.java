package id_143c43b4aa5a831f05c35921c05cac3b;
public interface Competitor {
	//Indicates how much to donate
	double declareDonationTo(Competitor x);
	//Indicates how much was donated
	void informDonationFrom(Competitor x, double donation);
	//Adds the amount of cash
	void addCash(double amount);
	//Get the amount of cash
	double getCash();
}
