package id_afd29ea84776a187e29706c4df0b957b;

import java.util.ArrayList;
import java.util.Arrays;

public class Tournament {
	
	private int rounds;
	private int[] numberOfPlayers;
	private int playerCount;
	private ArrayList<Competitor> players;
	
	public Tournament(int rounds, int[] numberOfPlayers){
		
		this.rounds = rounds;
		this.numberOfPlayers = numberOfPlayers;
		this.playerCount = 0;
		players = new ArrayList<Competitor>();
		for(int i = 0; i < this.numberOfPlayers.length; i++){
			playerCount += this.numberOfPlayers[i];
			for(int j = 0; j < this.numberOfPlayers[i];j++){
				players.add(getPlayer(i+1));
			}
		}
	}
	
	public Competitor getPlayer(int strategy){
		
		switch(strategy){
		case 1:
			return new PlayerWinner();
		case 2:
			return new PlayerCollabA();
		case 3:
			return new PlayerCollabB();
		case 4:
			return new PlayerCollabC();
		case 5:
			return new PlayerCollabD();
		default:
		}
		return new PlayerCollab();
		
	}
	
	public Competitor[] startTournament(){

		Competitor[] playersArray = new Competitor[playerCount];
		Ranker r = new Ranker();

		for (int i = 0; i < rounds; i ++)
			round();

		playersArray = players.toArray(playersArray);

		Arrays.sort(playersArray, r);
		return playersArray;
	}
	
	public void encounter(Competitor p1, Competitor p2){
		
		double p1Donation;
		double p2Donation;
		
		p1Donation = p1.declareDonationTo(p2);
		p2Donation = p2.declareDonationTo(p1);

		p1.informDonationFrom(p2, p2Donation);
		p2.informDonationFrom(p1, p1Donation);
		
		p1.addCash((10d - p1Donation) + 2*(p2Donation));
		p2.addCash((10d - p2Donation) + 2*(p1Donation));
		
		
	}
	
	public void round(){
		for (int i = 0; i < playerCount; i++)
			for (int j = i+1; j < playerCount; j++)
				encounter(players.get(i), players.get(j));
	}

}
