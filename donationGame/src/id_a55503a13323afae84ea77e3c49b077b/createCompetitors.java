package id_a55503a13323afae84ea77e3c49b077b;

public class createCompetitors {
	
	public Player create(int i) {
		if(i == 0) {
			return new Strategy0();
		}
		if(i == 1) {
			return new Strategy1();
		}
		if(i == 2) {
			return new Strategy2();
		}
		if(i == 3) {
			return new Strategy3();
		}
		if(i == 4) {
			return new Strategy4();
		}
		return null;
	}

}
