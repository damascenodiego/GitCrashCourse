import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.usp.icmc.ssc01032015.Competitor;
import br.usp.icmc.ssc01032015.competitors.AbstractCompetitor;
import br.usp.icmc.ssc01032015.competitors.CompetitorCalcMean;
import br.usp.icmc.ssc01032015.competitors.CompetitorGimmeFive;
import br.usp.icmc.ssc01032015.competitors.CompetitorGiveNothing;
import br.usp.icmc.ssc01032015.competitors.CompetitorRandom;
import br.usp.icmc.ssc01032015.competitors.CompetitorPlus10Percent;


public class Tournament {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<AbstractCompetitor> competitors = new ArrayList<AbstractCompetitor>();
		
		try {
			int rounds = Integer.parseInt(br.readLine());
			int comp1  = Integer.parseInt(br.readLine());
			int comp2  = Integer.parseInt(br.readLine());
			int comp3  = Integer.parseInt(br.readLine());
			int comp4  = Integer.parseInt(br.readLine());
			int comp5  = Integer.parseInt(br.readLine());

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
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("Competitors ranking");
		Collections.sort(competitors);
		print(competitors,competitors.size());
	}

	private static void print(List<AbstractCompetitor> competitors, int i) {
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
