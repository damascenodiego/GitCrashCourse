
/*
* 
* Sun Apr  5 23:37:03 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import java.util.ArrayList;

public class History {

	private ArrayList<Double> donationHistory;
	private ArrayList<Double> receiptHistory;

	public History() {
		this.donationHistory = new ArrayList<Double>();
		this.receiptHistory = new ArrayList<Double>();
	}

	public ArrayList<Double> getDonationHistory() { return this.donationHistory; }

	public ArrayList<Double> getReceiptHistory() { return this.receiptHistory; }
}
