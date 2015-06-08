package id_5dc983122d11fea8280626234a25789f;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

//Estrat??gia: Ser um cara esperto, fingir que ?? legal sempre doando um pouco. Se doarem o suficiente, claro.
public class Player1 extends Player {
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