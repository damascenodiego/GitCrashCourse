package br.usp.icmc.ssc01032015.competitors;

import br.usp.icmc.ssc01032015.Competitor;


public class CompetitorGimmeFive extends AbstractCompetitor {

	@Override
	public double declareDonationTo(Competitor s) {
		return 5.0;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
	}
}
