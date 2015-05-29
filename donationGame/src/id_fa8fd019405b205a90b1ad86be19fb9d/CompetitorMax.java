package id_fa8fd019405b205a90b1ad86be19fb9d;

import br.usp.icmc.ssc01032015.Competitor;

public class CompetitorMax extends BasicCompetitor{
	
	public double declareDonationTo(Competitor c) {
		return 10.0;
	}

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		
	}

}