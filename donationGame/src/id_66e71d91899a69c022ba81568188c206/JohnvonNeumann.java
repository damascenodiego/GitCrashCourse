
/*
* 
* Sat Apr  4 12:18:43 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import br.usp.icmc.ssc01032015.Competitor;

public class JohnvonNeumann extends MyCompetitor {

	private final double donation = 0.61803398874989;

	public JohnvonNeumann() {
		super();
		this.name = new String("John von Neumann");
	}

	public double declareDonationTo(Competitor c) {
		History h = this.historyTable.get(c);
		h.getDonationHistory().add(this.donation);

		return this.donation;
	}
}
