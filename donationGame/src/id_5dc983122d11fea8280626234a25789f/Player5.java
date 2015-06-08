package id_5dc983122d11fea8280626234a25789f;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

//Estrat??gia: Cauteloso, se o oponente der menos dinheiro que voc??, dar 0.0
public class Player5 extends Player {
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