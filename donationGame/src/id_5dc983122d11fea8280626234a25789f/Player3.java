package id_5dc983122d11fea8280626234a25789f;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

//Estrat??gia: Good guy, sempre doa o mesmo tanto que recebeu na rodada anterior. Se for a primeira rodada, doa 10.0
public class Player3 extends Player {
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