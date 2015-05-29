package id_fa8fd019405b205a90b1ad86be19fb9d;

import java.util.Vector;

import br.usp.icmc.ssc01032015.Competitor;

public abstract class LastDonationListingCompetitor extends BasicCompetitor{

	protected Vector<Competitor> competidores = new Vector<Competitor>();
	protected Vector<Double> lastDonation = new Vector<Double>();

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		for (int i = 0; i < competidores.size(); i++) {
			if (competidores.elementAt(i) == c) {
				lastDonation.setElementAt(donation, i);
				return;
			}
		}
		competidores.add(c);
		lastDonation.add(donation);
	}
}
