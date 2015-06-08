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

		////id_1371da62d1a33762ef96541d44c551f4
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy1_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy2_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy3_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy4_player.class,	10);
		//		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy5_player.class,	10);
		
		//// id_14026e1ac253425e79df1d8a3090871f
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType1.class,	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType2.class,	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType3.class, 	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType4.class, 	10);
		//		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType5.class, 	10);
				
		//// id_143c43b4aa5a831f05c35921c05cac3b
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy1.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy2.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy3.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy4.class, 	10);
		//		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy5.class, 	10);

		//// id_2CD0139AA2F7EAD1FA54FFDF63658D6C
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S1.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S2.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S3.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S4.class, 	10);
		//		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S5.class, 	10);

		//// id_2d5b283e0854cdf7f4da7d990a0023d8
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy0.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy1.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy2.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy3.class, 	10);
		//		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy4.class, 	10);

		//// id_30b6dcd03224af8e51e052f6ba08a21e
		//		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador1.class, 	10);
		//		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador2.class, 	10);
		//		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador3.class, 	10);
		//		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador4.class, 	10);
		//		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador5.class, 	10);

		//// id_46aebc04b97509660337c196208e7ab1
		//		competitors.put(id_46aebc04b97509660337c196208e7ab1.BadGuy.class, 	10);
		//		competitors.put(id_46aebc04b97509660337c196208e7ab1.GoodGuy.class, 	10);
		//		competitors.put(id_46aebc04b97509660337c196208e7ab1.MediaGuy.class, 	10);
		//		competitors.put(id_46aebc04b97509660337c196208e7ab1.RandomGuy.class, 	10);
		//		competitors.put(id_46aebc04b97509660337c196208e7ab1.guy.class, 	10);

		//// id_4b4ef5b808a257d43d9fab537e427945
		//		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type1.class, 	10);
		//		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type2.class, 	10);
		//		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type3.class, 	10);
		//		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type4.class, 	10);
		//		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type5.class, 	10);

		//// id_504355f05234412085c8fc11044d3af6
		//		competitors.put(id_504355f05234412085c8fc11044d3af6.Greedy.class,	10);
		//		competitors.put(id_504355f05234412085c8fc11044d3af6.ExponentialDonator.class,	10);
		//		competitors.put(id_504355f05234412085c8fc11044d3af6.Generous.class,	10);
		//		competitors.put(id_504355f05234412085c8fc11044d3af6.IACompetitor.class,	10);
		//		competitors.put(id_504355f05234412085c8fc11044d3af6.RandomDonator.class,	10);

		//// id_50d05aa2a02d88bc375bcbe98e807516
		//		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador1.class,	10);
		//		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador2.class,	10);
		//		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador3.class,	10);
		//		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador4.class,	10);
		//		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador5.class,	10);

		//// id_54899ba8e5646e372a5203d15e56af0a
		//		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_1.class,	10);
		//		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_2.class,	10);
		//		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_3.class,	10);
		//		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_4.class,	10);
		//		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_5.class,	10);

		//// id_54ef1d2792fa9d19e157ff12a9c04d8f (NOT WORKING)
		//		competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	10);
		//		competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	10);
		//		competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	10);
		//		competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	10);
		//		competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	10);

		//// id_58ee9001476ff8fafc38bcc109556764
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy1.class,	10);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy2.class,	10);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy3.class,	10);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy4.class,	10);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy5.class,	10);
		
		//// id_5dc983122d11fea8280626234a25789f
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player1.class, 10);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player2.class, 10);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player3.class, 10);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player4.class, 10);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player5.class, 10);
		
		Tournament.getInstance().runTournament(rounds,competitors);
	}


}
