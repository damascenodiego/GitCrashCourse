/*	
	Mateus Abrahao Cardoso 		NUSP: 8658332
	Sabrina Faceroli Tridico	NUSP: 9066452
*/
package id_14026e1ac253425e79df1d8a3090871f;

import br.usp.icmc.ssc01032015.Competitor;

public class PlayerType1 extends SimpleCompetitor{


	public String ID = "14026e1ac253425e79df1d8a3090871f";

	
	PlayerType1(int type){
		this.type = type;
		this.setTotalCash(0);
	}

	public double declareDonationTo(Competitor c){
		return 0;
	}

	public String toString(){
		return "PlayerType: 1     ID: " + this.type + "     Cash: " + String.format("%.2f", this.getTotalCash());
		//Cada Player implementa seu toString
	}
}
