package id_afd29ea84776a187e29706c4df0b957b;

import java.util.ArrayList;

import br.usp.icmc.ssc01032015.Competitor;

public class Player implements Competitor{

	double cash;
	ArrayList<Double> ammounts;
	
	public Player (){
		
		this.cash = 0;
		ammounts = new ArrayList<Double>();
		
	}
	
	@Override
	public double declareDonationTo(Competitor c) {
		return 10;
	}

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		return;		
	}

	@Override
	public void addCash(double amount) {
		ammounts.add(this.cash);
		this.cash += amount;
	}

	@Override
	public double getTotalCash() {
		return this.cash;
	}

}
