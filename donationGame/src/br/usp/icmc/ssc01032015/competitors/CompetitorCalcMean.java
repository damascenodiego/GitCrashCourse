package br.usp.icmc.ssc01032015.competitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;


public class CompetitorCalcMean extends AbstractCompetitor {

	private static final Map<Class,List <Double>> donationsFrom = new HashMap<Class, List<Double>>();

	public CompetitorCalcMean() {
	}

	@Override
	public double declareDonationTo(Competitor s) {
		double donation = 0.0;
		if (donationsFrom.containsKey(s.getClass()) && (donationsFrom.get(s.getClass()).size()!=0)) {
			List<Double> array = donationsFrom.get(s.getClass());
			for (int i = 0; i < array.size(); i++) {
				donation+=array.get(i);
			}
			return donation/array.size();
		}
		return donation;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
		if (donationsFrom.containsKey(s.getClass())) {
			donationsFrom.get(s.getClass()).add(donation);
		}else{
			donationsFrom.put(s.getClass(),new ArrayList<Double>());
			donationsFrom.get(s.getClass()).add(donation);
		}

	}

}
