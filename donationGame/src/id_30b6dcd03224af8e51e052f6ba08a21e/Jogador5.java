
package id_30b6dcd03224af8e51e052f6ba08a21e;

public class Jogador5 extends Jogador implements Competitor{    
    public Jogador5(){
    }
    
	public String toString () {
		return super.toString() +" Paula-Tadashi tipo 5";	
	}
    
    @Override
    // Indicates how much to donate to Competitor c, quanto doou para c
    public double declareDonationTo(Competitor c) {
        return Torneio.valorBanca/1;
    }
}
