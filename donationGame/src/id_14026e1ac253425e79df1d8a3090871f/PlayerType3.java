/*	
	Mateus Abrahao Cardoso 		NUSP: 8658332
	Sabrina Faceroli Tridico	NUSP: 9066452
*/
package id_14026e1ac253425e79df1d8a3090871f;

public class PlayerType3 extends SimpleCompetitor{

	public String ID = "14026e1ac253425e79df1d8a3090871f";
	
	private double donationMemory;

	PlayerType3(int type){
		this.type = type;
		this.donationMemory = -1;
		this.setTotalCash(0);
	}


	public double declareDonationTo(Competitor c){
		if(this.donationMemory == -1)
			return 0;
	
		return this.donationMemory;
	}

	public void informDonationFrom(Competitor c, double donation){	
		this.donationMemory = donation;
	}

	public String toString(){
		return "PlayerType: 3     ID: " + this.type + "     Cash: " + String.format("%.2f", this.getTotalCash());
		//Cada Player implementa seu toString
	}
}
