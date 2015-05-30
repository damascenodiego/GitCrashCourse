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

		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType1.class,	10);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType2.class,	10);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType3.class, 	10);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType4.class, 	10);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType5.class, 	10);
		System.out.println(id_14026e1ac253425e79df1d8a3090871f.PlayerType1.class.getPackage().toString());
		Tournament.getInstance().runTournament(rounds,competitors);
	}


}
