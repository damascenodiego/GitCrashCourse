package id_6884f0fdd5ae152b4e5838f18e1c8124;

import br.usp.icmc.ssc01032015.Competitor;


//caracteresticas do jogador 1 (Keijo)
public class Keijo extends MainCompetitor implements Competitor {
	private int playerNumber;
	
	public Keijo() {
		this.playerNumber = hashCode();
		totalCash = 0;
	}
	
	//estrategia basica, nunca doa nada
	public double declareDonationTo(Competitor c){
			return 0;
	}

	public String toString(){
		return "Keijo " + "(" + playerNumber + ")";
	}
	
	public int getType(){
		return 1;
	}
}