package id_143c43b4aa5a831f05c35921c05cac3b;
import java.util.ArrayList;

public class Strategy1 implements Competitor {


	public String ID = "143c43b4aa5a831f05c35921c05cac3b";

	private double total=0;
	private double donated;
	private double decision;
	private int count;
	ArrayList<Double> listDonated = new ArrayList<>();

	public double declareDonationTo(Competitor x) {
		decision = 0;
		for(int i=0; i<count; i++) {
			if(count > 0) {
				decision += listDonated.get(i);
			}
		}
		if(count > 0){
			decision = decision / count;
		}
		return decision;
	}
	public void informDonationFrom(Competitor x, double donation) {
		listDonated.add(donation);
		donated = donation;
		count++;
	}
	public void addCash(double amount) {
		total += amount;
	}
	public double getCash() {
		return total;
	}
}
