
package id_30b6dcd03224af8e51e052f6ba08a21e;

import br.usp.icmc.ssc01032015.Competitor;

public class Jogador3 extends Jogador implements Competitor {
    public Jogador3(){
    }
    
	public String toString () {
		return super.toString() +" Paula-Tadashi tipo 3";	
	}
    
    @Override
    // Indicates how much to donate to Competitor c, quanto doou para c
    public double declareDonationTo(Competitor c) {
        return Torneio.valorBanca/3;
    }
}
