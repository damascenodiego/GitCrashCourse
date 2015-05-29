package id_54899ba8e5646e372a5203d15e56af0a;

public class Player implements Competitor{

	double totalCash;
	int name;
	int strategy;

	public double declareDonationTo(Competitor c){
		return 0;
	}
	
	public void informDonationFrom(Competitor c, double donation){
		addCash(donation);
	}
	
	public void addCash(double amount){
		totalCash+=amount;
	}
	
	public double getTotalCash(){
		return totalCash;
	}
}