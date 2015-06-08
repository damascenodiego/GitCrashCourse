package id_c191a8c00b0597a16496999fd0156be6;

import br.usp.icmc.ssc01032015.Competitor;

public class Player4 extends Player {


	/**
	 * T??tica 4: manda o menor valor poss??vel caso o player que iremos doar tenha um montante maior que o nosso
	 * caso n??o, doamos um valor constante.
	 * @param c competidor que ir?? receber a doa????o
	 * @return doa????o
	 */
	public double declareDonationTo(Competitor c) {

		double donation;
		if (c.getTotalCash() > getTotalCash()) {
			donation = Double.MIN_VALUE;
		} else {
			donation = Math.log(Math.PI);
		}

		if (DEBUG) {
			System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
		}
		// sejamos mais honestos
		if (donation > 0 && donation < 1) {
			donation *= 1 + (donation * 2);
		}
		if (donation >= 0 && donation <= 10) {
			addHistoricListGived(donation);
			return donation;
		} else {
			addHistoricListGived(donation);
			donation = Double.MIN_VALUE;
			return donation;
		}
	}

}

