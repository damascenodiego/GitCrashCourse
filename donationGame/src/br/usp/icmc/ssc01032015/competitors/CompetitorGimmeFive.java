package br.usp.icmc.ssc01032015.competitors;

import br.usp.icmc.ssc01032015.Competitor;


public class CompetitorGimmeFive implements Competitor {

	double money;

	@Override
	public double declareDonationTo(Competitor s) {
		return 5.0;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
	}

	@Override
	public void addCash(double amount) {
		money+=amount;

	}

	@Override
	public double getCash() {
		return money;
	}
}
