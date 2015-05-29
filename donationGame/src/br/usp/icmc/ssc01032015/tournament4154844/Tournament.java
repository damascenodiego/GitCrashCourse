package br.usp.icmc.ssc01032015.tournament4154844;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;


public class Tournament {

	private static Tournament instance;
	
	private Tournament() {
	}
	
	public static Tournament getInstance(){
		if (instance == null){
			instance = new Tournament();
		}
		return instance;
	}

	private static void print(List<Competitor> competitors, int i) {
		for (int j = 0; j < competitors.size() && j < i ; j++) {
			System.out.println(competitors.get(j));
		}

	}

	private static void encounter(Competitor one, Competitor two){
		double donation = 0;
		double donation2 = 0;

		// get donation from one to two
		donation = one.declareDonationTo(two);
		two.informDonationFrom(one, donation);
		// get donation from two to one
		donation2 = two.declareDonationTo(one);
		one.informDonationFrom(two, donation2);
		// calculates donations
		one.addCash(((10 - donation) + (donation2 * 2))/2);
		two.addCash(((10 - donation2) + (donation * 2))/2);
	}


	@SuppressWarnings("unchecked")
	public void runTournament(int rounds, Map<Class,Integer> competitorSetup) {
		// edit here with your classes
		List<Competitor> competitors = new ArrayList<Competitor>();
		try {
			for (Class competitorClass : competitorSetup.keySet()) {
				if (Competitor.class.isAssignableFrom(competitorClass)){
					for (int i = 0; i < competitorSetup.get(competitorClass); i++) {
						competitors.add((Competitor)competitorClass.newInstance());
					}
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < rounds; i++) {
			for (int j = 0; j < competitors.size(); j++) {
				for (int j2 = j+1; j2 < competitors.size(); j2++) {
					Competitor one = competitors.get(j);
					Competitor two = competitors.get(j2);
					encounter(one, two);
				}
			}
		}
		Collections.sort(competitors, (Competitor o1, Competitor o2) -> {
			return Double.compare(o1.getTotalCash(), o2.getTotalCash());
		});

		print(competitors,competitors.size());
	}
}
