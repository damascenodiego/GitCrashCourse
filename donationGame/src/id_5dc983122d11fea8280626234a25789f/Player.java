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

// Estrat??gia: Ser um cara esperto, fingir que ?? legal sempre doando um pouco. Se doarem o suficiente, claro.
class Player1 extends Player {
	private int turn;

	public Player1() {
		turn = 0; // Primeira rodada
	}

	public double declareDonationTo(Competitor opponent) {
		if (this.turn == 0) {
			this.myDonation = 0.0;
			turn++;
		} else {
			this.myDonation = this.enemyDonation > 5 ? 10 - this.enemyDonation : 0.0;
		}
		return this.myDonation;
	}
}

// Estrat??gia: Ser cuz??o. Digo, doar sempre 0.0
class Player2 extends Player {

}

// Estrat??gia: Good guy, sempre doa o mesmo tanto que recebeu na rodada anterior. Se for a primeira rodada, doa 10.0
class Player3 extends Player {
	private int turn;

	public Player3() {
		turn = 0; // Primeira rodada
	}

	public double declareDonationTo(Competitor opponent) {
		if (this.turn == 0) {
			this.myDonation = 10.0;
			turn++;
		} else {
			this.myDonation = this.enemyDonation;
		}
		return this.myDonation;
	}
}

// Estrat??gia: Malando, sempre doa dois a menos do que recebeu. Se for a primeira rodada, doa 0.0
class Player4 extends Player {
	private int turn;

	public Player4() {
		turn = 0;
	}

	public double declareDonationTo(Competitor opponent) {
		if (this.turn == 0) {
			this.myDonation = 0.0;
			turn++;
		} else {
			this.myDonation = this.enemyDonation - 2 < 0 ? 0.0 : this.enemyDonation - 2;
		}
		return this.myDonation;
	}
}

// Estrat??gia: Cauteloso, se o oponente der menos dinheiro que voc??, dar 0.0
class Player5 extends Player {
	private Map<Competitor, Double> opponentDonation;
	private Map<Competitor, Double> yourDonation;
	private int turn;

	public Player5() {
		opponentDonation = new HashMap<Competitor, Double>();
		yourDonation = new HashMap<Competitor, Double>();
	}

	public double declareDonationTo(Competitor opponent) {
		if (!opponentDonation.containsKey(opponent)) {
			opponentDonation.put(opponent, 0.0);
			yourDonation.put(opponent, 5.0);
		}

		if (opponentDonation.get(opponent) < yourDonation.get(opponent)) {
			this.myDonation = 0.0;
			return this.myDonation;
		}

		return 5.0;
	}

	public void informDonationFrom(Competitor opponent, double amount) {
		this.enemyDonation = amount;
	}
}
