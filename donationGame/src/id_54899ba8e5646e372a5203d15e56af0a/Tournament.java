package id_54899ba8e5646e372a5203d15e56af0a;


public class Tournament{
	public void encounters(Player[] players, int totalCompetitors){
		for(int i=0;i<totalCompetitors-1;i++){
			for(int j=i+1;j<totalCompetitors;j++){

				players[i].informDonationFrom(players[j], players[j].declareDonationTo(players[i])*2.0);
				players[j].informDonationFrom(players[i], players[i].declareDonationTo(players[j])*2.0);

				players[i].addCash(10-players[i].declareDonationTo(players[j]));
				players[j].addCash(10-players[j].declareDonationTo(players[i]));
			}
		}
	}

	public void results(Player[] players, int totalCompetitors){
		Player temp;

		for(int i=0;i<totalCompetitors;i++){
			for(int j=0;j<totalCompetitors;j++){
				if(players[j].totalCash > players[i].totalCash){
					temp = players[i];
					players[i] = players[j];
					players[j] = temp;
				}
			}
		}

		for(int i=totalCompetitors-1;i>=0;i--){
			System.out.format("%d: %d - estrategia: %d com %.2f reais\n", (totalCompetitors-i), players[i].name, players[i].strategy, players[i].totalCash);
		}

		return;
	}
}