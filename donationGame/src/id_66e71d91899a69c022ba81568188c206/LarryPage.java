
/*
* 
* Sat Apr  4 12:19:11 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import br.usp.icmc.ssc01032015.Competitor;

public class LarryPage extends MyCompetitor {

	public LarryPage() {
		super();
		this.name = new String("Larry Page");
	}

	public double declareDonationTo(Competitor c) {
		double donation = this.Search(c);
		donation = donation/2;

		History h = this.historyTable.get(c);
		h.getDonationHistory().add(donation);

		return donation;
	}

	public double Search(Competitor c) {
		History h = this.historyTable.get(c);

		double average = 0.0;
		for(int i = 0 ; i < h.getReceiptHistory().size() ; i++) average += h.getReceiptHistory().get(i);

		if(h.getReceiptHistory().size() != 0) average = average / h.getReceiptHistory().size();

		return average;
	}
}
