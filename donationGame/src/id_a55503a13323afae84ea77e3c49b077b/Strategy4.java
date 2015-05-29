package id_a55503a13323afae84ea77e3c49b077b;

import java.util.Random;

public class Strategy4 extends Player {

	public Strategy4() {
		this.strategy = 4;
	}

	public double declareDonationTo(Competitor c) {
		Random r = new Random();
		int n = r.nextInt(5);
		return n+5;
	}
	
}
