package br.usp.icmc.ssc01032015.competitors;

import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;


public class CompetitorRandom extends AbstractCompetitor {

	Random rnd;
	
	public CompetitorRandom() {
		rnd = new Random();
	}
	
	@Override
	public double declareDonationTo(Competitor s) {
		return rnd.nextDouble()*10;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {

	}

}
