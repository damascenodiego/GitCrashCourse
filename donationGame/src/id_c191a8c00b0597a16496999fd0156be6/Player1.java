package id_c191a8c00b0597a16496999fd0156be6;

import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

/**
 * Subclasse de Player
 */
public class Player1 extends Player {

	/**
	 * T??tica 1: o limite da minha doa????o sempre vai ser entre a subtra????o do que eu recebi e o que eu doei
	 * tendo o limite superior a raiz da doa????o recebida
	 */
	public double declareDonationTo(Competitor c) {

		double donation = 0.0;

		if (donationLastTurn >= donationReceived) {
			if (donationReceived == 10)
				donation = 1.0002;
			else if (donationLastTurn - donationReceived > 0 && donationLastTurn - donationReceived < Math.sqrt(donationReceived))
				donation = Math.sqrt(donationReceived) + 0.0009;
			else if (donationReceived - donationLastTurn > 0 && donationReceived - donationLastTurn < Math.sqrt(donationReceived))
				donation = Math.sqrt(donationLastTurn) + 0.0009;
			else
				donation = donationLastTurn + 0.00009;

		} else if (donationLastTurn - 1.0009 > 0) {
			donation = donationLastTurn + 0.0009;

		} else if (donationLastTurn == 0 || donationReceived == 0) { // alguem 'traiu'
			donation += 0.009;
		} else
			donation = 3.00;

		if (donation > 10) {
			donation = Double.MIN_VALUE;
		}
		// sejamos mais honestos
		if (donation > 0 && donation < 1) {
			donation *= 1 + (donation * 2);
		}

		addHistoricListGived(donation);
		donationLastTurn = donation;
		if (DEBUG) {
			System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
		}
		return donation;
	}
}