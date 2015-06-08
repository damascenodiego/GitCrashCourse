package id_c191a8c00b0597a16496999fd0156be6;

import br.usp.icmc.ssc01032015.Competitor;
public class Player2 extends Player {

	/**
	 * T??tica 2: m??dia de todas as doa????es feitas pelo player
	 * doamos a parte decimal dessa m??dia
	 * @param c competidor que ir?? receber a doa????o
	 * @return valor da doa????o
	 */
	public double declareDonationTo(Competitor c) {

		double media = 0.0;
		double j = 1;
		double donation = 0.0;
		long imedia;

		for (int i = 0; i < historicListReceived.size(); i++) {
			if (historicListReceived.get(i) > 0) {
				media += historicListReceived.get(i) / j;

				media = media - (long) media;
			}

			j++;
		}
		if (media <= 10 && media >= 0)
			donation = media;

		if (DEBUG) {
			System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
		}
		// sejamos mais honestos
		if (donation > 0 && donation < 1) {
			donation *= 1 + (donation * 2);
		}

		return donation;
	}
}
