package id_6884f0fdd5ae152b4e5838f18e1c8124;

import br.usp.icmc.ssc01032015.Competitor;

//caracter?sticas do jogador 0 (Dog)
//possui vetor de doacoes, onde ele guarda a media de doacao de cada tipo de competidor
public class Dog extends MainCompetitor implements Competitor {
	public Donations[] dogDonations;
	private int playerNumber;
	
	Dog(int x) {
		int i;
		totalCash = 0;
		playerNumber = x;
		dogDonations = new Donations[5];
		for(i = 0; i < 5; i++)
			dogDonations[i] = new Donations();
	}
	
	//sempre doa a media do que recebeu do competidor nas rodadas passadas
	public double declareDonationTo(Competitor c){
		return dogDonations[c.getType()].getAverageDonation();
	}
	
	public void informDonationFrom(Competitor c, double amount){
		dogDonations[c.getType()].incrementMatchup();
		dogDonations[c.getType()].setAverageDonation(amount);
	}

	public String toString(){
		return "Dog " + "(" + playerNumber + ")";
	}
	
	public int getType(){
		return 0;
	}
}