/*	
	Mateus Abrahao Cardoso 		NUSP: 8658332
	Sabrina Faceroli Tridico	NUSP: 9066452
*/
package id_14026e1ac253425e79df1d8a3090871f;

import br.usp.icmc.ssc01032015.Competitor;
	
public class SimpleCompetitor implements Competitor, Comparable<SimpleCompetitor>{
	private double totalCash;
	protected double cashReceived;
	protected int type;

	public double declareDonationTo(Competitor c){
		
		return 0;
	}
	public void informDonationFrom(Competitor c, double donation){
		this.cashReceived = donation;
	}
	public void addCash(double amount){
		this.totalCash += amount;
	}
	public double getTotalCash(){
		return this.totalCash;
	}

	public void setTotalCash(double totalCash){
		this.totalCash = totalCash;
	}

	@Override
   	public int compareTo(SimpleCompetitor c) {
        if(c.getTotalCash() > this.getTotalCash())
        	return 1;
        if(c.getTotalCash() < this.getTotalCash())
        	return -1;
        return 0;
	}

}
