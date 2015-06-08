package br.usp.icmc.ssc01032015.tournament;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.competitors.CompetitorCalcMean;
import br.usp.icmc.ssc01032015.competitors.CompetitorGimmeFive;
import br.usp.icmc.ssc01032015.competitors.CompetitorGiveNothing;
import br.usp.icmc.ssc01032015.competitors.CompetitorPlus10Percent;
import br.usp.icmc.ssc01032015.competitors.CompetitorRandom;

public class FinalTournament {

	public static void main(String[] args) {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;

		//		//id_1371da62d1a33762ef96541d44c551f4
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy1_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy2_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy3_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy4_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy5_player.class,	10);
		//
		//		// id_14026e1ac253425e79df1d8a3090871f
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType1.class,	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType2.class,	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType3.class, 	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType4.class, 	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType5.class, 	10);
		//		
		//		// id_143c43b4aa5a831f05c35921c05cac3b
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy1.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy2.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy3.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy4.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy5.class, 	10);

		//		// id_2CD0139AA2F7EAD1FA54FFDF63658D6C
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S1.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S2.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S3.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S4.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S5.class, 	10);

		//		// id_2d5b283e0854cdf7f4da7d990a0023d8
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy0.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy1.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy2.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy3.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy4.class, 	10);

		Tournament.getInstance().runTournament(rounds,competitors);
	}


}
