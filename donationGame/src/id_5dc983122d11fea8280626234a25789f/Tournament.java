package id_5dc983122d11fea8280626234a25789f;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.usp.icmc.ssc01032015.Competitor;

public class Tournament {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nplayer[] = new int[5];
		int total_players = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Numero de players to tipo " + (i + 1) + ":");
			nplayer[i] = input.nextInt();
			total_players += nplayer[i];
		}

		ArrayList<Competitor> array_players = new ArrayList<Competitor>();
		for (int i = 0; i < 5; i++) {
			for (int j = nplayer[i]; j > 0; j--) {
				switch (i) {
					case 0:
						array_players.add(new Player1());
						break;
					case 1:
						array_players.add(new Player2());
						break;
					case 2:
						array_players.add(new Player3());
						break;
					case 3:
						array_players.add(new Player4());
						break;
					case 4:
						array_players.add(new Player5());
						break;
					default:
						break;
				}
			}
		}

		int rounds;
		System.out.println("Numero de rounds:");
		rounds = input.nextInt();

		for (; rounds > 0; rounds--) {
			for (Competitor player : array_players) {
				for (Competitor opponent : array_players.subList(array_players.indexOf(player) + 1, array_players.size())) {
					player.addCash(10.0);
					opponent.addCash(10.0);

					double player_donation = player.declareDonationTo(opponent);
					double opponent_donation = opponent.declareDonationTo(player);
					player.informDonationFrom(opponent, opponent_donation);
					opponent.informDonationFrom(player, player_donation);

					player.addCash((10 - player_donation) + (2 * opponent_donation));
					opponent.addCash((10 - opponent_donation) + (2 * player_donation));
				}
			}
		}

		// Admito ser ruim e n??o ter conseguido usar Collection.sort
		// Peguei esse c??digo de http://technodeck.blogspot.com.br/2012/05/manually-sort-arraylist-in-java.html
		List<Competitor> sorted = new ArrayList<Competitor>();
		Competitor player1 = null;
		int remove_index = -1;

		while(array_players.size() > 0) {
			player1 = array_players.get(0);
			for (int i = 0; i < array_players.size(); i++ ) {
				Competitor player2 = array_players.get(i);
				if(player1.getTotalCash() < player2.getTotalCash()) {
					player1 = player2;
					remove_index = i;
				}
			}
			sorted.add(player1);
			if(remove_index >= 0) {
				array_players.remove(remove_index);
			}
			remove_index = 0;
		}

		for (Competitor player : sorted) {
			System.out.println(player + ": " + player.getTotalCash());
		}
	}
}
