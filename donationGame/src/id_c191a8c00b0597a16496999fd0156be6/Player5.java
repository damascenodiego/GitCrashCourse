package id_c191a8c00b0597a16496999fd0156be6;

import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

public class Player5 extends Player {

	public double declareDonationTo(Competitor c) {
		// implementa????o de m??dia
		double donation;
		double min = 0.0000001;
		double max = 9.9999999;
		Random rn = new Random();

		donation = rn.nextDouble() + min;

		if (donation >= donationLastTurn) {
			if (Math.log(donationLastTurn) > 0 && Math.exp(donationLastTurn) < 10)
				donation = donationLastTurn - Math.log(donationLastTurn);
			else if ( (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)))) <= 10 && donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)))  >= 0)
				donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));
		} else if (donation >= donationReceived) {
			if (Math.log(donationReceived) > 0 && Math.log(donationReceived) <= 10)
				donation = donationReceived * Math.log(donationReceived);
			else if (Math.tan(Math.log(Math.sqrt(donationReceived))) * donationReceived <= 10 && Math.tan(Math.log(Math.sqrt(donationReceived))) * donationReceived <= 0)
				donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));
		} else if (donation >= (donationReceived % donationLastTurn)) {
			if (Math.log(donationReceived % donationLastTurn) >= 0 && Math.log(donationReceived % donationLastTurn) <= 10)
				donation = donationReceived * Math.log(donationReceived % donationLastTurn);
			else if (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) <= 10 && donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) >= 0)
				donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));

		} else if (donation >= (Math.sqrt(donationReceived) + donationLastTurn)) {
			if (Math.log(Math.sqrt(donationReceived)) >= 0 && Math.log(Math.sqrt(donationReceived)) <= 10)
				donation = Math.log(Math.sqrt(donationReceived));
			else if (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) <= 10)
				donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));
		} else if (donation >= (Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn))) {
			if ((Math.log(Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn))) >= 0 && Math.log(Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn)) <= 10)
				donation = Math.log(Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn));
			else if (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) > 0)
				donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));


		} else if (donation <= donationReceived)
			donation = donation * 0.0002;



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
			System.out.println("(((((((((((((((((((((((DOACAO MAIOR QUE DEZ OU MENOR QUE ZERO =>" + donation);
			donation = Double.MIN_VALUE;
			addHistoricListGived(donation);
			return donation;
		}
	}
}
