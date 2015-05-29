package id_504355f05234412085c8fc11044d3af6;

public interface Competitor
{
	//Indicates how much to donate to Competitor c
	double declareDonationTo(Competitor c);
	
	//Indicates how much was donated from Competitor c
	void informDonationFrom(Competitor c, double donation);
	
	//Adds the amount of cash
	void addCash(double amount);
	
	//Get the amount of cash this Competitor has
	double getTotalCash();
}