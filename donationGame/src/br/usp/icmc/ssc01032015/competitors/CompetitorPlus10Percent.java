package br.usp.icmc.ssc01032015.competitors;

import br.usp.icmc.ssc01032015.Competitor;


public class CompetitorPlus10Percent extends AbstractCompetitor {

	double lastDonation;

	public CompetitorPlus10Percent() {
		lastDonation = 0.0;
	}

	@Override
	public double declareDonationTo(Competitor s) {
		double donation = 1.1*lastDonation;
		if (donation>10){
			return 10;
		}else{
			return 1.1*lastDonation;
		}
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
		lastDonation = donation;
	}
}
