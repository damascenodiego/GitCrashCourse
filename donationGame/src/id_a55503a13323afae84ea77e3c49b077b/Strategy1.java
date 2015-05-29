package id_a55503a13323afae84ea77e3c49b077b;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy1 extends Player {
	public Strategy1() {
		this.strategy = 1;
	}

	public double declareDonationTo(Competitor c) {
		return 10;
	}
}
