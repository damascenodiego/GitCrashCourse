package id_6884f0fdd5ae152b4e5838f18e1c8124;

import br.usp.icmc.ssc01032015.Competitor;

//caracter?sticas do jogador 4 (Jorgao)
public class Jorgao extends MainCompetitor implements Competitor {
	private int rounds;
	private int playerNumber;
	
	Jorgao(int x) {
		playerNumber = x;
		totalCash = 0;
		rounds = 0;
	}
	
	//doa porcentagem do que ele nao tem (mantem o que tem e arrisca o que ja nao ia ganhar provavelmente)
	public double declareDonationTo(Competitor c){
		double percentage = totalCash/(rounds * 20);
		percentage = 1 - percentage;

		return percentage * 10;	
	}
    
	public void addCash(double amount){
		rounds++;
		totalCash += amount;
	}
	
	public String toString(){
		return "Jorg?o " + "(" + playerNumber + ")";
	}
	
	public int getType(){
		return 4;
	}
}