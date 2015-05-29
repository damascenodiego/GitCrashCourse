package id_6884f0fdd5ae152b4e5838f18e1c8124;

//caracter?sticas do jogador 3 (Mineiro)
public class Mineiro extends MainCompetitor implements Competitor {
	private int matchups;
	//usado para diferenciar jogadores do mesmo tipo
	private int playerNumber;
	public Donations[] mineiroDonations;
	
	Mineiro(int x) {
		playerNumber = x;
		totalCash = 0;
		matchups = 0;
		mineiroDonations = new Donations[5];
		for(int i = 0; i < 5; i++)
			mineiroDonations[i] = new Donations();
	}
	
	//se average donation ~~ 10 e percentage ~~ 1 -> doa ~~ 10
	//se average donation ~~ 0 e percentage ~~ 1 -> doa ~~ 10
	//se percentage ~~ 0 mas averageDonation ~~ 10, tenta investir com esse jogador doa ~~ 10
	//se percentage ~~ 0 e averagedonation ~~ 0 n?o doa nada 
	public double declareDonationTo(Competitor c){
		double finalDonation = 0;
		double percentage = totalCash/(matchups * 20);

		return (((10 - (((percentage * 10) - (10 - mineiroDonations[c.getType()].getAverageDonation())) / 2)) * percentage) + (finalDonation * mineiroDonations[c.getType()].getAverageDonation())) % 10;	
	}
	
	public void informDonationFrom(Competitor c, double amount){
		mineiroDonations[c.getType()].incrementMatchup();
		mineiroDonations[c.getType()].setAverageDonation(amount);
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