package id_6884f0fdd5ae152b4e5838f18e1c8124;


//caracteresticas do jogador 2 (Murilol)
public class Murilol extends MainCompetitor implements Competitor {
	double lastDonation;
	private int playerNumber;
	
	Murilol(int x) {
		playerNumber = x;
		totalCash = 0;
		lastDonation = 0;
	}
	
	//doa sempre o que recebeu
	public double declareDonationTo(Competitor c){
		return lastDonation;
	}
    
	//metodo que sobrescreve o do MainCompetitor. Nesse o jogador guarda a ultima doacao
    public void addCash(double amount){
    	lastDonation = amount/2;
    	totalCash += amount;
    }
    
	public String toString(){
		return "Murilol " + "(" + playerNumber + ")";
	}
	
	public int getType(){
		return 2;
	}
}