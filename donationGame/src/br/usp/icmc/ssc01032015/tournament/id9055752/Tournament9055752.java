package br.usp.icmc.ssc01032015.tournament.id9055752;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.competitors.id9055752.CompetitorType01;
import br.usp.icmc.ssc01032015.competitors.id9055752.CompetitorType02;
import br.usp.icmc.ssc01032015.competitors.id9055752.CompetitorType03;
import br.usp.icmc.ssc01032015.competitors.id9055752.CompetitorType04;
import br.usp.icmc.ssc01032015.competitors.id9055752.CompetitorType05;
import br.usp.icmc.ssc01032015.tournament.Tournament;

public class Tournament9055752 {

	public static void main(String[] args) {
		
		run10round();
		run10rounds10competEach();
		run10rounds1competEach();

	}
	
	private static final void run10rounds10competEach() {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;
		competitors.put(CompetitorType01.class,		10);
		competitors.put(CompetitorType02.class,		10);
		competitors.put(CompetitorType03.class, 	10);
		competitors.put(CompetitorType04.class, 	10);
		competitors.put(CompetitorType05.class,		10);
		Tournament.getInstance().runTournament(rounds,competitors);
	}

	private static final void run10rounds1competEach() {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;
		competitors.put(CompetitorType01.class,		1);
		competitors.put(CompetitorType02.class,		1);
		competitors.put(CompetitorType03.class, 	1);
		competitors.put(CompetitorType04.class, 	1);
		competitors.put(CompetitorType05.class,		1);
		Tournament.getInstance().runTournament(rounds,competitors);
	}

	private static final void run10round() {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;
		competitors.put(CompetitorType01.class,		1);
		competitors.put(CompetitorType02.class,		2);
		competitors.put(CompetitorType03.class, 	3);
		competitors.put(CompetitorType04.class, 	4);
		competitors.put(CompetitorType05.class,		5);
		Tournament.getInstance().runTournament(rounds,competitors);
	}

}
