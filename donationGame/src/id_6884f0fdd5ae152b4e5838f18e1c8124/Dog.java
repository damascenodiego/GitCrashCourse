package id_6884f0fdd5ae152b4e5838f18e1c8124;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

//caracter?sticas do jogador 0 (Dog)
//possui vetor de doacoes, onde ele guarda a media de doacao de cada tipo de competidor
public class Dog extends MainCompetitor implements Competitor {
	public Map<Class,Donations> dogDonations;
	private int playerNumber;
	
	public Dog() {
		int i;
		totalCash = 0;
		this.playerNumber = hashCode();
		dogDonations = new HashMap<Class,Donations>();
//		for(i = 0; i < 5; i++)
//			dogDonations[i] = new Donations();
	}
	
	//sempre doa a media do que recebeu do competidor nas rodadas passadas
	public double declareDonationTo(Competitor c){
		testCompetitor(c);
		return dogDonations.get(c.getClass()).getAverageDonation();
	}
	
	public void informDonationFrom(Competitor c, double amount){
		testCompetitor(c);
		dogDonations.get(c.getClass()).incrementMatchup();
		dogDonations.get(c.getClass()).setAverageDonation(amount);
	}

	private void testCompetitor(Competitor c) {
		if(dogDonations.get(c.getClass()) == null){
			dogDonations.put(c.getClass(),new Donations());
		}
	}
	public String toString(){
		return "Dog " + "(" + playerNumber + ")";
	}
	
	public int getType(){
		return 0;
	}
}