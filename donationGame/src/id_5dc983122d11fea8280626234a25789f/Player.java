package id_5dc983122d11fea8280626234a25789f;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

public class Player implements Competitor {
	protected double myDonation;
	protected double enemyDonation;
	protected double totalCash;

	public Player() {
		this.myDonation = 0.0;
		this.enemyDonation = 0.0;
		this.totalCash = 0.0;
	}

	public double declareDonationTo(Competitor opponent) {
		this.myDonation = 0.0;
		return 0.0;
	}

	public void informDonationFrom(Competitor opponent, double amount) {
		this.enemyDonation = amount;
	}

	public void addCash(double amount) {
		this.totalCash += amount;
	}

	public double getTotalCash() {
		return this.totalCash;
	}
}