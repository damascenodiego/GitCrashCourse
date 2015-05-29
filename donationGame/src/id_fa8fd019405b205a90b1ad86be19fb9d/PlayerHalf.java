package id_fa8fd019405b205a90b1ad86be19fb9d;

// No primeiro turno, doa 0
// Nos seguintes, doa metade do que o outro competidor doou na ultima rodada
public class PlayerHalf extends LastDonationListingCompetitor {
	
	public double declareDonationTo (Competitor c) {
		try{
			return lastDonation.elementAt(competidores.indexOf(c))/2.0;
		}catch(ArrayIndexOutOfBoundsException ioobe){
			return 0.0;
		}
	}
}