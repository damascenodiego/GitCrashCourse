package br.usp.icmc.ssc01032015.competitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;


public class CompetitorCalcMean implements Competitor {
	
	double money;

	Map<Competitor,List <Double>> donationsFrom;

	public CompetitorCalcMean() {
		donationsFrom = new HashMap<Competitor, List<Double>>();
	}

	@Override
	public double declareDonationTo(Competitor s) {
		double donation = 0.0;
		if (donationsFrom.containsKey(s) && (donationsFrom.get(s).size()!=0)) {
			List<Double> array = donationsFrom.get(s);
			for (int i = 0; i < array.size(); i++) {
				donation+=array.get(i);
			}
			return donation/array.size();
		}
		return donation;
	}

	@Override
	public void informDonationFrom(Competitor s, double donation) {
		if (donationsFrom.containsKey(s)) {
			donationsFrom.get(s).add(donation);
		}else{
			donationsFrom.put(s,new ArrayList<Double>());
			donationsFrom.get(s).add(donation);
		}

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
