package id_54899ba8e5646e372a5203d15e56af0a;

public class Strategy_1 extends Player{

	public Strategy_1(int name){
		this.totalCash = 0;
		this.name = name;
		this.strategy = 1;
	}

	public double declareDonationTo(Competitor c){
		return 10;
	}
}