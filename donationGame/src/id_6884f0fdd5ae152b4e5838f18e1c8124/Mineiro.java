package id_6884f0fdd5ae152b4e5838f18e1c8124;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

//caracter?sticas do jogador 3 (Mineiro)
public class Mineiro extends MainCompetitor implements Competitor {
	private int matchups;
	//usado para diferenciar jogadores do mesmo tipo
	private int playerNumber;
	public Map<Class,Donations> mineiroDonations;
	
	Mineiro(int x) {
		playerNumber = x;
		totalCash = 0;
		matchups = 0;
		mineiroDonations = new HashMap<Class,Donations>();
	}
	
	//se average donation ~~ 10 e percentage ~~ 1 -> doa ~~ 10
	//se average donation ~~ 0 e percentage ~~ 1 -> doa ~~ 10
	//se percentage ~~ 0 mas averageDonation ~~ 10, tenta investir com esse jogador doa ~~ 10
	//se percentage ~~ 0 e averagedonation ~~ 0 n?o doa nada 
	public double declareDonationTo(Competitor c){
		testCompetitor(c);
		double finalDonation = 0;
		double percentage = totalCash/(matchups * 20);
		return (((10 - (((percentage * 10) - (10 - mineiroDonations.get(c.getClass()).getAverageDonation())) / 2)) * percentage) + (finalDonation * mineiroDonations.get(c.getClass()).getAverageDonation())) % 10;	
	}
	
	public void informDonationFrom(Competitor c, double amount){
		testCompetitor(c);
		mineiroDonations.get(c.getClass()).incrementMatchup();
		mineiroDonations.get(c.getClass()).setAverageDonation(amount);
	}

	private void testCompetitor(Competitor c) {
		if(!mineiroDonations.containsKey(c.getClass())){
			mineiroDonations.put(c.getClass(),new Donations());
		}
	}

	public void addCash(double amount){
		matchups++;
		totalCash += amount;
	}
	
	public String toString(){
		return "Mineiro " + "(" + playerNumber + ")";
	}
	
	public int getType(){
		return 3;
	}
}