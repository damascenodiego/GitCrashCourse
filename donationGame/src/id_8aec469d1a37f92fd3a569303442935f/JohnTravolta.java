package id_8aec469d1a37f92fd3a569303442935f;
import java.util.ArrayList;

/* Esse competidor doa 5 na primeira rodada e depois doa o que lhe foi doado na ??ltima rodada pelo
 * competidor em quest??o
 */

public class JohnTravolta extends Player implements Comparable<Player> {
	private double TotalCash;
	ArrayList<Double> received_cash = new ArrayList<Double>();
	ArrayList<Competitor> competitors = new ArrayList<Competitor>();
	
	public JohnTravolta() {
		TotalCash = 0;
		strategy_number = 3;
	}

	public double declareDonationTo(Competitor c) {
		int i;
		boolean flag = false;
		
		for(i=0; i<competitors.size(); i++) {
			if(competitors.get(i).equals(c)) {
				flag = true;
				break;
			}
		}
		
		if(flag) { //se n??o ?? a primeira vez que doo pro competidor
			
			return received_cash.get(i);
			
		} else {  //se ?? a primeira vez que doo pro competidor
			
			return 5;
			
		}
		
	}

	public void informDonationFom(Competitor c, double donation) {
		boolean flag = false;
		int i;
		
		//vendo se o competidor c j?? doou antes
		//caso tenha doado, isso significa que j?? estamos em outra rodada
		for(i=0; i<competitors.size(); i++) {
			if(competitors.get(i).equals(c)) {
				flag = true;
				break;
			}
		}
		
		
		if(flag) {     //se n??o estamos mais no primeiro round
			
			received_cash.set(i, received_cash.get(i));
			
		} else {       //se estamos no primeiro round
			
			//adicionando o competitor no caso de ainda estarmos na primeira rodada
			competitors.add(c);
			received_cash.add(donation);
			
		}
	}

	public void addCash(double amount) {
		this.TotalCash += amount;
	}

	public double getTotalCash() {
		return TotalCash;
	}
	
	public int compareTo(Player p) {
		 
		double compareQuantity = ((Player) p).getTotalCash(); 

		//descending order
		if(compareQuantity - this.TotalCash == 0)
			return 0;
		else
			return ((int) (compareQuantity - this.TotalCash));
 
	}
}
