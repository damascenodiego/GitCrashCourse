package br.usp.icmc.ssc01032015.tournament;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.competitors.CompetitorCalcMean;
import br.usp.icmc.ssc01032015.competitors.CompetitorGimmeFive;
import br.usp.icmc.ssc01032015.competitors.CompetitorGiveNothing;
import br.usp.icmc.ssc01032015.competitors.CompetitorPlus10Percent;
import br.usp.icmc.ssc01032015.competitors.CompetitorRandom;

public class TournamentExample {

	public static void main(String[] args) {
		
		run10round0compet();
		run10rounds10competEach();
		run10rounds1competEach();

	}
	
	private static final void run10rounds10competEach() {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;
		competitors.put(CompetitorCalcMean.class, 		10);
		competitors.put(CompetitorGimmeFive.class, 		10);
		competitors.put(CompetitorGiveNothing.class, 	10);
		competitors.put(CompetitorPlus10Percent.class, 	10);
		competitors.put(CompetitorRandom.class, 		10);
		Tournament.getInstance().runTournament(rounds,competitors);
	}

	private static final void run10rounds1competEach() {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;
		competitors.put(CompetitorCalcMean.class, 		1);
		competitors.put(CompetitorGimmeFive.class, 		1);
		competitors.put(CompetitorGiveNothing.class, 	1);
		competitors.put(CompetitorPlus10Percent.class, 	1);
		competitors.put(CompetitorRandom.class, 		1);
		Tournament.getInstance().runTournament(rounds,competitors);
	}

	private static final void run10round0compet() {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;
		competitors.put(CompetitorCalcMean.class, 		0);
		competitors.put(CompetitorGimmeFive.class, 		0);
		competitors.put(CompetitorGiveNothing.class, 	0);
		competitors.put(CompetitorPlus10Percent.class, 	0);
		competitors.put(CompetitorRandom.class, 		0);
		Tournament.getInstance().runTournament(rounds,competitors);
	}

}
