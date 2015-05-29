/*	
	Mateus Abrahao Cardoso 		NUSP: 8658332
	Sabrina Faceroli Tridico	NUSP: 9066452
*/
package id_14026e1ac253425e79df1d8a3090871f;

import br.usp.icmc.ssc01032015.Competitor;

public class PlayerType4 extends SimpleCompetitor{
	
	public String ID = "14026e1ac253425e79df1d8a3090871f";
	
	private int[] cashDispersion;

	PlayerType4(int type){
		this.type = type;
		this.setTotalCash(0);
		this.cashDispersion = new int[11];
	}


	public double declareDonationTo(Competitor c){
		return avarageDonation(cashDispersion);	
	}
	
	public void informDonationFrom(Competitor c, double donation){	
		int aux;
		aux = (int) donation;
		if(donation - aux > 0.5)
			aux++;

		for (int i=0;i < cashDispersion.length ;i++ ) {
			if(i == aux)
				cashDispersion[i]++;
		}
	}

	private int avarageDonation(int[] donation){
		int larger, flagRet=0;
		larger = donation[0];
		for (int i=1;i < donation.length ;i++ ) {
			if(donation[i] > larger){
				larger = donation[i];
				flagRet = i;
			}
		}
		return flagRet;
	}
	

	public String toString(){
		return "PlayerType: 4     ID: " + this.type + "     Cash: " + String.format("%.2f", this.getTotalCash());
		//Cada Player implementa seu toString
	}
}
