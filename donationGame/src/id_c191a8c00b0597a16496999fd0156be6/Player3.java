package id_c191a8c00b0597a16496999fd0156be6;

import br.usp.icmc.ssc01032015.Competitor;

public class Player3 extends Player {

	private boolean equilibrio = false;

	/**
	 * T??tica 3: simplifica????o do 'equilibro de Nash'
	 * consideramos equilibrio quando um jogador n??o aumenta sua doa????o (s?? diminui ou mantem)
	 * enquanto esse equilibrio for mantido, mandamos continuamos com o mesmo valor.
	 * caso o equilibrio tenha quebrado, mandamos o minimo valor possivel
	 * @param c competidor que ir?? receber a doa????o
	 * @return doa????o
	 */
	public double declareDonationTo(Competitor c) {

		double donation = 0.0;
		if (equilibrio ) { //na?? h?? equilibrio, logo vou ser o pior poss??vel
			donation = Double.MIN_VALUE;
		} else if (donationLastTurn > donationReceived && equilibrio) {
			equilibrio = true;
			donation = donationLastTurn;
		}else if (donationLastTurn == donationReceived && equilibrio) {
			equilibrio = true;
			donation = donationLastTurn;
		} else  if (donationLastTurn < donationReceived && equilibrio) {
			equilibrio = false;
			donation = donationLastTurn % donationReceived;
		}

		if(donation == 0 || (donation * 2) > 10 ) {
			donation = 0.5;
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
			return Double.MIN_VALUE;
		}
	}
}

