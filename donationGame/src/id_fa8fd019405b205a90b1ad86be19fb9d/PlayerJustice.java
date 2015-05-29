package id_fa8fd019405b205a90b1ad86be19fb9d;

// No primeiro turno, doa 5
// Nas proximas rodadas:
// * Doa 3 se o outro competidor doou uma quantia menor que 5 na ?ltima rodada 
// ou a quantia menos 0.5 se a quantia recebida for menor que 3
// * Doa 7 se o outro competidor doou uma quantia maior ou iqual a 5 na ?ltima rodada 
// ou a quantia mais 0.5 se a quantia recebida foi maior ou igual a 7

public class PlayerJustice extends LastDonationListingCompetitor {
	
	public double declareDonationTo(Competitor c) {
		try{
			Double donation = lastDonation.elementAt(competidores.indexOf(c));
			
			if (donation < 3.0)
				return Math.max(donation - 0.5, 0.0);
			
			if (donation < 5.0)
				return 3.0;

			if (donation < 7.0)
				return 7.0;

			return Math.min(donation + 0.5, 10.0);

		}catch(ArrayIndexOutOfBoundsException ioobe){
			return 5.0;
		}
	}
}
