
/*
* 
* Sat Apr  4 12:19:02 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import br.usp.icmc.ssc01032015.Competitor;

public class LinusTorvalds extends MyCompetitor {

	private final double donation = 10.0;

	public LinusTorvalds() {
		super();
		this.name = new String("Linus Torvalds");
	}

	public double declareDonationTo(Competitor c) {
		History h = this.historyTable.get(c);
		h.getDonationHistory().add(this.donation);

		return this.donation;
	}
}
