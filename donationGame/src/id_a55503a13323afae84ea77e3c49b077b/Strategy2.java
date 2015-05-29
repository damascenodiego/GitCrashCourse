package id_a55503a13323afae84ea77e3c49b077b;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy2 extends Player {

	public Strategy2() {
		this.strategy = 2;
	}

	public double declareDonationTo(Competitor c) {
		return received;
	}
	
}
