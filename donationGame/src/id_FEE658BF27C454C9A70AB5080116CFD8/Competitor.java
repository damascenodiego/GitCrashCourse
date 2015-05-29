package id_FEE658BF27C454C9A70AB5080116CFD8;

public interface Competitor extends Comparable<Competitor>{
	// Indicates how much to donate to Competitor c
	double declareDonationTo(Competitor c);
	// Indicates how much was donated from Competitor c
	void informDonationFrom(Competitor c, double donation);
	// Adds the amount of cash
	void addCash(double amount);
	// Get the amount of cash this competitor has
	double getTotalCash();
	
	int getStrategyId(); //Maneira usada para identificar as estrat??gias
};
