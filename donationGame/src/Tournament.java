import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.usp.icmc.ssc01032015.Competitor;
import br.usp.icmc.ssc01032015.competitors.CompetitorCalcMean;
import br.usp.icmc.ssc01032015.competitors.CompetitorGimmeFive;
import br.usp.icmc.ssc01032015.competitors.CompetitorGiveNothing;
import br.usp.icmc.ssc01032015.competitors.CompetitorRandom;
import br.usp.icmc.ssc01032015.competitors.CompetitorPlus10Percent;


public class Tournament {
	public static void main(String[] arg) {
		String[] args ={"10","20","20","20","20","20"};
		if (args.length!=6)	{
			System.out.println("usage: java Tournament <no. of rounds> <competitor 1> <competitor 2> <competitor 3> <competitor 4> <competitor 5>");
			System.exit(1);
		}

		int rounds = Integer.parseInt(args[0]);
		int comp1  = Integer.parseInt(args[1]);
		int comp2  = Integer.parseInt(args[2]);
		int comp3  = Integer.parseInt(args[3]);
		int comp4  = Integer.parseInt(args[4]);
		int comp5  = Integer.parseInt(args[5]);

		List<Competitor> competitors = new ArrayList<Competitor>();
		for (int i = 0; i < comp1; i++) competitors.add(new CompetitorCalcMean());
		for (int i = 0; i < comp2; i++) competitors.add(new CompetitorGimmeFive());
		for (int i = 0; i < comp3; i++) competitors.add(new CompetitorGiveNothing());
		for (int i = 0; i < comp4; i++) competitors.add(new CompetitorPlus10Percent());
		for (int i = 0; i < comp5; i++) competitors.add(new CompetitorRandom());

		for (int i = 0; i < rounds; i++) {
			for (int j = 0; j < competitors.size(); j++) {
				for (int j2 = j+1; j2 < competitors.size(); j2++) {
					Competitor one = competitors.get(j);
					Competitor two = competitors.get(j2);
					encounter(one, two);
				}
			}
		}
		Collections.sort(competitors, new Comparator<Competitor>() {
			@Override
			public int compare(Competitor o1, Competitor o2) {
				return Double.compare(o2.getCash(), o1.getCash());
			}
		});

		print(competitors,3);
	}

	private static void print(List<Competitor> competitors, int i) {

		for (int j = 0; j < competitors.size() && j < i ; j++) {
			System.out.println(competitors.get(j));
		}

	}

	public static void encounter(Competitor one, Competitor two){
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

}
