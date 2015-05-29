/*	
	Mateus Abrahao Cardoso 		NUSP: 8658332
	Sabrina Faceroli Tridico	NUSP: 9066452
*/

package id_14026e1ac253425e79df1d8a3090871f;

public interface Competitor{

	public double declareDonationTo(Competitor c);
	public void informDonationFrom(Competitor c, double donation);
	public void addCash(double amount);
	public double getTotalCash();
	
}