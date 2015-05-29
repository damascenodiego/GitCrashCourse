
/*
* 
* Thu Apr  2 19:09:50 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import java.util.Random;

public class AlanTuring extends MyCompetitor {

	public AlanTuring() {
		super();
		this.name = new String("Alan Turing");
	}

	public double declareDonationTo(Competitor c) {
		double donation = SolveEnigma(c);

		History h = this.historyTable.get(c);
		h.getDonationHistory().add(donation);

		return donation;
	}

	public double SolveEnigma(Competitor c) {
		long seed = this.GenerateSeed(c);
		if(seed == 0L) return 0.0;
		Random random = new Random(seed);
		double rand = random.nextDouble();
		double scaled = rand * 10.0;

		return scaled;
	}

	public long GenerateSeed(Competitor c) {
		History h = this.historyTable.get(c);

		double average = 0;
		for(int i = 0 ; i < h.getReceiptHistory().size() ; i++) {
			average += h.getReceiptHistory().get(i);
		}
		if(h.getReceiptHistory().size() != 0) average = average / h.getReceiptHistory().size();

		if(average < 5.0) return 0L;

		double seed = average * 1000000000;
		return (long) seed;
	}
}
