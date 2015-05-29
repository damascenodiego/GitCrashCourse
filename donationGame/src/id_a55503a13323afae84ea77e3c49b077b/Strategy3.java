package id_a55503a13323afae84ea77e3c49b077b;

import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy3 extends Player {

	public Strategy3() {
		this.strategy = 3;
	}

	public double declareDonationTo(Competitor c) {
		Random r = new Random();
		int n = r.nextInt(5);
		return n;
	}
	
}
