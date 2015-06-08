package id_5dc983122d11fea8280626234a25789f;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;


//Estrat??gia: Malando, sempre doa dois a menos do que recebeu. Se for a primeira rodada, doa 0.0
public class Player4 extends Player {
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

