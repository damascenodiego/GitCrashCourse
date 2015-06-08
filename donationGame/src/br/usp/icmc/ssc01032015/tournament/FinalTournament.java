package br.usp.icmc.ssc01032015.tournament;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.competitors.CompetitorCalcMean;
import br.usp.icmc.ssc01032015.competitors.CompetitorGimmeFive;
import br.usp.icmc.ssc01032015.competitors.CompetitorGiveNothing;
import br.usp.icmc.ssc01032015.competitors.CompetitorPlus10Percent;
import br.usp.icmc.ssc01032015.competitors.CompetitorRandom;

public class FinalTournament {

	private static final Integer CONSTANT = 10;

	public static void main(String[] args) {
		Map<Class,Integer> competitors = new HashMap<Class,Integer>();
		int rounds = 10;

		//id_1371da62d1a33762ef96541d44c551f4
		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy1_player.class,	CONSTANT);
		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy2_player.class,	CONSTANT);
		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy3_player.class,	CONSTANT);
		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy4_player.class,	CONSTANT);
		competitors.put(id_1371da62d1a33762ef96541d44c551f4.Strategy5_player.class,	CONSTANT);
		// id_14026e1ac253425e79df1d8a3090871f
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType1.class,	CONSTANT);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType2.class,	CONSTANT);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType3.class, 	CONSTANT);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType4.class, 	CONSTANT);
		competitors.put(id_14026e1ac253425e79df1d8a3090871f.PlayerType5.class, 	CONSTANT);
		// id_143c43b4aa5a831f05c35921c05cac3b
		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy1.class, 	CONSTANT);
		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy2.class, 	CONSTANT);
		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy3.class, 	CONSTANT);
		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy4.class, 	CONSTANT);
		competitors.put(id_143c43b4aa5a831f05c35921c05cac3b.Strategy5.class, 	CONSTANT);
		// id_2CD0139AA2F7EAD1FA54FFDF63658D6C
		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S1.class, 	CONSTANT);
		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S2.class, 	CONSTANT);
		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S3.class, 	CONSTANT);
		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S4.class, 	CONSTANT);
		competitors.put(id_2CD0139AA2F7EAD1FA54FFDF63658D6C.S5.class, 	CONSTANT);
		// id_2d5b283e0854cdf7f4da7d990a0023d8
		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy0.class, 	CONSTANT);
		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy1.class, 	CONSTANT);
		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy2.class, 	CONSTANT);
		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy3.class, 	CONSTANT);
		competitors.put(id_2d5b283e0854cdf7f4da7d990a0023d8.Strategy4.class, 	CONSTANT);
		// id_30b6dcd03224af8e51e052f6ba08a21e
		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador1.class, 	CONSTANT);
		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador2.class, 	CONSTANT);
		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador3.class, 	CONSTANT);
		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador4.class, 	CONSTANT);
		competitors.put(id_30b6dcd03224af8e51e052f6ba08a21e.Jogador5.class, 	CONSTANT);
		// id_46aebc04b97509660337c196208e7ab1
		competitors.put(id_46aebc04b97509660337c196208e7ab1.BadGuy.class, 	CONSTANT);
		competitors.put(id_46aebc04b97509660337c196208e7ab1.GoodGuy.class, 	CONSTANT);
		competitors.put(id_46aebc04b97509660337c196208e7ab1.MediaGuy.class, 	CONSTANT);
		competitors.put(id_46aebc04b97509660337c196208e7ab1.RandomGuy.class, 	CONSTANT);
		competitors.put(id_46aebc04b97509660337c196208e7ab1.guy.class, 	CONSTANT);
		// id_4b4ef5b808a257d43d9fab537e427945
		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type1.class, 	CONSTANT);
		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type2.class, 	CONSTANT);
		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type3.class, 	CONSTANT);
		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type4.class, 	CONSTANT);
		competitors.put(id_4b4ef5b808a257d43d9fab537e427945.Type5.class, 	CONSTANT);
		// id_504355f05234412085c8fc11044d3af6
		competitors.put(id_504355f05234412085c8fc11044d3af6.Greedy.class,	CONSTANT);
		competitors.put(id_504355f05234412085c8fc11044d3af6.ExponentialDonator.class,	CONSTANT);
		competitors.put(id_504355f05234412085c8fc11044d3af6.Generous.class,	CONSTANT);
		competitors.put(id_504355f05234412085c8fc11044d3af6.IACompetitor.class,	CONSTANT);
		competitors.put(id_504355f05234412085c8fc11044d3af6.RandomDonator.class,	CONSTANT);
		// id_50d05aa2a02d88bc375bcbe98e807516
		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador1.class,	CONSTANT);
		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador2.class,	CONSTANT);
		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador3.class,	CONSTANT);
		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador4.class,	CONSTANT);
		competitors.put(id_50d05aa2a02d88bc375bcbe98e807516.Jogador5.class,	CONSTANT);
		// id_54899ba8e5646e372a5203d15e56af0a
		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_1.class,	CONSTANT);
		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_2.class,	CONSTANT);
		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_3.class,	CONSTANT);
		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_4.class,	CONSTANT);
		competitors.put(id_54899ba8e5646e372a5203d15e56af0a.Strategy_5.class,	CONSTANT);
		//// id_54ef1d2792fa9d19e157ff12a9c04d8f (NOT WORKING)
		//// competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	CONSTANT);
		//// competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	CONSTANT);
		//// competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	CONSTANT);
		//// competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	CONSTANT);
		//// competitors.put(id_54ef1d2792fa9d19e157ff12a9c04d8f...class,	CONSTANT);
		// id_58ee9001476ff8fafc38bcc109556764
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy1.class,	CONSTANT);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy2.class,	CONSTANT);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy3.class,	CONSTANT);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy4.class,	CONSTANT);
		competitors.put(id_58ee9001476ff8fafc38bcc109556764.Strategy5.class,	CONSTANT);
		// id_5dc983122d11fea8280626234a25789f
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player1.class, CONSTANT);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player2.class, CONSTANT);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player3.class, CONSTANT);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player4.class, CONSTANT);
		competitors.put(id_5dc983122d11fea8280626234a25789f.Player5.class, CONSTANT);
		// id_5F69C25389D743BC2322F8BEB1A3D718
		competitors.put(id_5F69C25389D743BC2322F8BEB1A3D718.PlayerType0.class, CONSTANT);
		competitors.put(id_5F69C25389D743BC2322F8BEB1A3D718.PlayerType1.class, CONSTANT);
		competitors.put(id_5F69C25389D743BC2322F8BEB1A3D718.PlayerType2.class, CONSTANT);
		competitors.put(id_5F69C25389D743BC2322F8BEB1A3D718.PlayerType3.class, CONSTANT);
		competitors.put(id_5F69C25389D743BC2322F8BEB1A3D718.PlayerType4.class, CONSTANT);
		// id_66e71d91899a69c022ba81568188c206
		competitors.put(id_66e71d91899a69c022ba81568188c206.AlanTuring.class, CONSTANT);
		competitors.put(id_66e71d91899a69c022ba81568188c206.JohnvonNeumann.class, CONSTANT);
		competitors.put(id_66e71d91899a69c022ba81568188c206.LarryPage.class, CONSTANT);
		competitors.put(id_66e71d91899a69c022ba81568188c206.LinusTorvalds.class, CONSTANT);
		competitors.put(id_66e71d91899a69c022ba81568188c206.MarkZuckerberg.class, CONSTANT);
		// id_6884f0fdd5ae152b4e5838f18e1c8124
		competitors.put(id_6884f0fdd5ae152b4e5838f18e1c8124.Dog.class, CONSTANT);
		competitors.put(id_6884f0fdd5ae152b4e5838f18e1c8124.Jorgao.class, CONSTANT);
		competitors.put(id_6884f0fdd5ae152b4e5838f18e1c8124.Keijo.class, CONSTANT);
		competitors.put(id_6884f0fdd5ae152b4e5838f18e1c8124.Mineiro.class, CONSTANT);
		competitors.put(id_6884f0fdd5ae152b4e5838f18e1c8124.Murilol.class, CONSTANT);
		// id_6c7865d7e47c20ed146eed0b9216118d
		competitors.put(id_6c7865d7e47c20ed146eed0b9216118d.players.Dummy.class, CONSTANT);
		competitors.put(id_6c7865d7e47c20ed146eed0b9216118d.players.CopyCat.class, CONSTANT);
		competitors.put(id_6c7865d7e47c20ed146eed0b9216118d.players.TitTat.class, CONSTANT);
		competitors.put(id_6c7865d7e47c20ed146eed0b9216118d.players.MeanTitTat.class, CONSTANT);
		competitors.put(id_6c7865d7e47c20ed146eed0b9216118d.players.Crazy.class, CONSTANT);
		// id_7fe6515401ffafcde31d3afe0bfefd08
		competitors.put(id_7fe6515401ffafcde31d3afe0bfefd08.CompetitorDonate23.class, CONSTANT);
		competitors.put(id_7fe6515401ffafcde31d3afe0bfefd08.CompetitorDonateAll.class, CONSTANT);
		competitors.put(id_7fe6515401ffafcde31d3afe0bfefd08.CompetitorDonateFormula.class, CONSTANT);
		competitors.put(id_7fe6515401ffafcde31d3afe0bfefd08.CompetitorDonateLastRecieved.class, CONSTANT);
		competitors.put(id_7fe6515401ffafcde31d3afe0bfefd08.CompetitorDonateNothing.class, CONSTANT);
		// id_823f8912a4d502ff866453d2c1bf00fa
		competitors.put(id_823f8912a4d502ff866453d2c1bf00fa.Competitor1.class, CONSTANT);
		competitors.put(id_823f8912a4d502ff866453d2c1bf00fa.Competitor2.class, CONSTANT);
		competitors.put(id_823f8912a4d502ff866453d2c1bf00fa.Competitor3.class, CONSTANT);
		competitors.put(id_823f8912a4d502ff866453d2c1bf00fa.Competitor4.class, CONSTANT);
		competitors.put(id_823f8912a4d502ff866453d2c1bf00fa.Competitor5.class, CONSTANT);
		// id_8aec469d1a37f92fd3a569303442935f
		competitors.put(id_8aec469d1a37f92fd3a569303442935f.Bob.class, CONSTANT);
		competitors.put(id_8aec469d1a37f92fd3a569303442935f.Cafu.class, CONSTANT);
		competitors.put(id_8aec469d1a37f92fd3a569303442935f.JohnTravolta.class, CONSTANT);
		competitors.put(id_8aec469d1a37f92fd3a569303442935f.LeeSin.class, CONSTANT);
		competitors.put(id_8aec469d1a37f92fd3a569303442935f.Sion.class, CONSTANT);
		// id_90ae014bd2408ecfab890ca6cafcdd1c
		competitors.put(id_90ae014bd2408ecfab890ca6cafcdd1c.Strategy_1.class, CONSTANT);
		competitors.put(id_90ae014bd2408ecfab890ca6cafcdd1c.Strategy_2.class, CONSTANT);
		competitors.put(id_90ae014bd2408ecfab890ca6cafcdd1c.Strategy_3.class, CONSTANT);
		competitors.put(id_90ae014bd2408ecfab890ca6cafcdd1c.Strategy_4.class, CONSTANT);
		competitors.put(id_90ae014bd2408ecfab890ca6cafcdd1c.Strategy_5.class, CONSTANT);
		// id_9455a0c737e7256d2e3fc975c2a7cb06
		competitors.put(id_9455a0c737e7256d2e3fc975c2a7cb06.Strategist1.class, CONSTANT);
		competitors.put(id_9455a0c737e7256d2e3fc975c2a7cb06.Strategist2.class, CONSTANT);
		competitors.put(id_9455a0c737e7256d2e3fc975c2a7cb06.Strategist3.class, CONSTANT);
		competitors.put(id_9455a0c737e7256d2e3fc975c2a7cb06.Strategist4.class, CONSTANT);
		competitors.put(id_9455a0c737e7256d2e3fc975c2a7cb06.Strategist5.class, CONSTANT);
		// id_a55503a13323afae84ea77e3c49b077b
		competitors.put(id_a55503a13323afae84ea77e3c49b077b.Strategy0.class, CONSTANT);
		competitors.put(id_a55503a13323afae84ea77e3c49b077b.Strategy1.class, CONSTANT);
		competitors.put(id_a55503a13323afae84ea77e3c49b077b.Strategy2.class, CONSTANT);
		competitors.put(id_a55503a13323afae84ea77e3c49b077b.Strategy3.class, CONSTANT);
		competitors.put(id_a55503a13323afae84ea77e3c49b077b.Strategy4.class, CONSTANT);
		// id_afd29ea84776a187e29706c4df0b957b
		competitors.put(id_afd29ea84776a187e29706c4df0b957b.PlayerWinner.class, CONSTANT);
		competitors.put(id_afd29ea84776a187e29706c4df0b957b.PlayerCollabA.class, CONSTANT);
		competitors.put(id_afd29ea84776a187e29706c4df0b957b.PlayerCollabB.class, CONSTANT);
		competitors.put(id_afd29ea84776a187e29706c4df0b957b.PlayerCollabC.class, CONSTANT);
		competitors.put(id_afd29ea84776a187e29706c4df0b957b.PlayerCollabD.class, CONSTANT);
		competitors.put(id_afd29ea84776a187e29706c4df0b957b.PlayerCollab.class, CONSTANT);
		// id_c191a8c00b0597a16496999fd0156be6
		competitors.put(id_c191a8c00b0597a16496999fd0156be6.Player1.class, CONSTANT);
		competitors.put(id_c191a8c00b0597a16496999fd0156be6.Player2.class, CONSTANT);
		competitors.put(id_c191a8c00b0597a16496999fd0156be6.Player3.class, CONSTANT);
		competitors.put(id_c191a8c00b0597a16496999fd0156be6.Player4.class, CONSTANT);
		competitors.put(id_c191a8c00b0597a16496999fd0156be6.Player5.class, CONSTANT);
		// id_c5b7ce60bf5c77af02586d7614010e80
		competitors.put(id_c5b7ce60bf5c77af02586d7614010e80.AlternateCompetitor.class, CONSTANT);
		competitors.put(id_c5b7ce60bf5c77af02586d7614010e80.AlwaysMaxCompetitor.class, CONSTANT);
		competitors.put(id_c5b7ce60bf5c77af02586d7614010e80.AlwaysMinCompetitor.class, CONSTANT);
		competitors.put(id_c5b7ce60bf5c77af02586d7614010e80.RandomCompetitor.class, CONSTANT);
		competitors.put(id_c5b7ce60bf5c77af02586d7614010e80.TitForTatCompetitor.class, CONSTANT);
		// id_f0a8b5160d64da3473414b6ea1247ba6
		competitors.put(id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S1Player.class, CONSTANT);
		competitors.put(id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S2Player.class, CONSTANT);
		competitors.put(id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S3Player.class, CONSTANT);
		competitors.put(id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S4Player.class, CONSTANT);
		competitors.put(id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S5Player.class, CONSTANT);
		// id_f41a1eaa6653ca96864dfaa783d17bcc
		competitors.put(id_f41a1eaa6653ca96864dfaa783d17bcc.JogadorA.class, CONSTANT);
		competitors.put(id_f41a1eaa6653ca96864dfaa783d17bcc.JogadorB.class, CONSTANT);
		competitors.put(id_f41a1eaa6653ca96864dfaa783d17bcc.JogadorC.class, CONSTANT);
		competitors.put(id_f41a1eaa6653ca96864dfaa783d17bcc.JogadorD.class, CONSTANT);
		competitors.put(id_f41a1eaa6653ca96864dfaa783d17bcc.JogadorE.class, CONSTANT);
		// id_f48e66ad4d196743b49e55a7fd991109
		competitors.put(id_f48e66ad4d196743b49e55a7fd991109.ScroogeS.class, CONSTANT);
		competitors.put(id_f48e66ad4d196743b49e55a7fd991109.HalfdifferenceS.class, CONSTANT);
		competitors.put(id_f48e66ad4d196743b49e55a7fd991109.HalfreflectionS.class, CONSTANT);
		competitors.put(id_f48e66ad4d196743b49e55a7fd991109.HalfsumS.class, CONSTANT);
		competitors.put(id_f48e66ad4d196743b49e55a7fd991109.CrazyM.class, CONSTANT);
		// id_fa8fd019405b205a90b1ad86be19fb9d
		competitors.put(id_fa8fd019405b205a90b1ad86be19fb9d.CompetitorMax.class, CONSTANT);
		competitors.put(id_fa8fd019405b205a90b1ad86be19fb9d.CompetitorTitForTat.class, CONSTANT);
		competitors.put(id_fa8fd019405b205a90b1ad86be19fb9d.CompetitorZero.class, CONSTANT);
		competitors.put(id_fa8fd019405b205a90b1ad86be19fb9d.PlayerHalf.class, CONSTANT);
		competitors.put(id_fa8fd019405b205a90b1ad86be19fb9d.PlayerJustice.class, CONSTANT);
		// id_FEE658BF27C454C9A70AB5080116CFD8
		competitors.put(id_FEE658BF27C454C9A70AB5080116CFD8.Echoer.class, CONSTANT);
		competitors.put(id_FEE658BF27C454C9A70AB5080116CFD8.Mirror.class, CONSTANT);
		competitors.put(id_FEE658BF27C454C9A70AB5080116CFD8.Rand.class, CONSTANT);
		competitors.put(id_FEE658BF27C454C9A70AB5080116CFD8.Tracker.class, CONSTANT);
		competitors.put(id_FEE658BF27C454C9A70AB5080116CFD8.Traitor.class, CONSTANT);

		Tournament.getInstance().runTournament(rounds,competitors);
	}


}
