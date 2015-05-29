
/*
* 
* Thu Apr  2 18:53:15 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

public interface Competitor {

	public double declareDonationTo(Competitor c); //Indicates how much to donate to Competitor c

	public void informDonationFrom(Competitor c, double donation); //Indicates how much was donated from Competitor c

	public void addCash(double amount); //Adds the amount of cash

	public double getTotalCash(); //Get the amount of cash this Competitor has
}
