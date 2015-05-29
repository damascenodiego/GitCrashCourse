package id_90ae014bd2408ecfab890ca6cafcdd1c;
import java.util.ArrayList;

public class Tournament {
	
	//Reads number of turns and players from each strategy and runs createPlayers();
	public static void initialize(String[] arg) {
		String[] args = {"10","1","1","1","1","1"};
		
		int inputFlag = 0;
		String strTotalTurns = "";	//Number of turns
		String strStrategy_1 = "";	//Number of players with Strategy_1
		String strStrategy_2 = "";	//Number of players with Strategy_2
		String strStrategy_3 = "";	//Number of players with Strategy_3
		String strStrategy_4 = "";	//Number of players with Strategy_4
		String strStrategy_5 = "";	//Number of players with Strategy_5
		
		for(String argum: args) {					//Reading number of turns first, then number of competitors:
			if(inputFlag == 0) {					//	"java Tournament <number of turns> <number of competitors from each strategy>"
				strTotalTurns = argum;				//Example:
				inputFlag++;						//	"java Tournament   100 13 42 24 77 21"
			}										//		  meaning:   turns S1 S2 S3 S4 S5
			else if(inputFlag == 1) {
				strStrategy_1 = argum;
				inputFlag++;
			}
			else if(inputFlag == 2) {
				strStrategy_2 = argum;
				inputFlag++;
			}
			else if(inputFlag == 3) {
				strStrategy_3 = argum;
				inputFlag++;
			}
			else if(inputFlag == 4) {
				strStrategy_4 = argum;
				inputFlag++;
			}
			else {
				strStrategy_5 = argum;
			}
			
		}
		
		int numTurns = Integer.parseInt(strTotalTurns);				//Converting all the args input from String to Integer
		int numStrategy_1 = Integer.parseInt(strStrategy_1);
		int numStrategy_2 = Integer.parseInt(strStrategy_2);
		int numStrategy_3 = Integer.parseInt(strStrategy_3);
		int numStrategy_4 = Integer.parseInt(strStrategy_4);
		int numStrategy_5 = Integer.parseInt(strStrategy_5);
		
		createPlayers(numTurns, numStrategy_1, numStrategy_2, numStrategy_3, numStrategy_4, numStrategy_5);
	}
	
	//Creates array of players and runs playTournament();
	public static void createPlayers(int numTurns, int numStrategy_1, int numStrategy_2, int numStrategy_3, int numStrategy_4, int numStrategy_5) {

		ArrayList<Competitor> players = new ArrayList<Competitor>();	//Array of competitors
		
		for(int i = 0; i < numStrategy_1; i++) {	//Adds Strategy_1 players to the array
			players.add(new Strategy_1());
		}
		
		for(int i = 0; i < numStrategy_2; i++) {	//Adds Strategy_1 players to the array
			players.add(new Strategy_2());
		}
		
		for(int i = 0; i < numStrategy_3; i++) {	//Adds Strategy_1 players to the array
			players.add(new Strategy_3());
		}
		
		for(int i = 0; i < numStrategy_4; i++) {	//Adds Strategy_1 players to the array
			players.add(new Strategy_4());
		}
		
		for(int i = 0; i < numStrategy_5; i++) {	//Adds Strategy_1 players to the array
			players.add(new Strategy_5());
		}
		
		playTournament(numTurns, players, numStrategy_1, numStrategy_2, numStrategy_3, numStrategy_4, numStrategy_5);
	}
	
	//Plays tournament
	public static void playTournament(int numTurns, ArrayList<Competitor> players, int numStrategy_1, int numStrategy_2, int numStrategy_3, int numStrategy_4, int numStrategy_5) {
		
		//Total amount of players
		int totalCompetitors = numStrategy_1 + numStrategy_2 + numStrategy_3 + numStrategy_4 + numStrategy_5;
		
		Competitor p1;
		Competitor p2;
		double donationFromP1;
		double donationFromP2;
		
		//FOR "turns"
		for (int i = 0; i < numTurns; i++) {
		
			//FOR "players":
			//	Goes through every pair
			//	of player possible:
			//	(1,1) -> (1,2) -> (1,3) -> ... (n-2,n-1) -> (n-2,n) -> (n-1,n)
			for (int player_1 = 0; player_1 < totalCompetitors; player_1++) {
				
				p1 = players.get(player_1);
				
				for (int player_2 = 1 + player_1; player_2 < totalCompetitors; player_2++) {	
					
					p2 = players.get(player_2);
					
					//p2 informs donation from p1
					System.out.print("\nPlayer " + player_1 + " has donated $");
					p2.informDonationFrom(p1, p1.declareDonationTo(p2));
					System.out.print(" to player " + player_2);
						
					//p1 informs donation from p2					
					System.out.print("\nPlayer " + player_2 + " has donated $");
					p1.informDonationFrom(p2, p2.declareDonationTo(p1));
					System.out.print(" to player " + player_1);
					
					p1.addCash(10 - p1.declareDonationTo(p2) + 2*p2.declareDonationTo(p1));	//Refreshes amount of Cash
					p2.addCash(10 - p2.declareDonationTo(p1) + 2*p1.declareDonationTo(p2));	//from both players
				}
			}
		}
		
		showResults(players, totalCompetitors, numStrategy_1, numStrategy_2, numStrategy_3, numStrategy_4, numStrategy_5);
	}
	
	//Shows results
	public static void showResults(ArrayList<Competitor> players, int totalCompetitors, int numStrategy_1, int numStrategy_2, int numStrategy_3, int numStrategy_4, int numStrategy_5) {

		Competitor p;		//Current player
		int pStrategy = -1;	//Current player's strategy
		
		int winnerIndx = -1;		//Winner's index
		int winnerStrategy = -1;	//Winner's strategy
		double winnerCash = -1;		//Winner's totalCash
		
		System.out.println("\nResults:");
		for (int i = 0; i < totalCompetitors; i++){
			p = players.get(i);
			
			//Finds the strategy of each competitor
			if(i < numStrategy_1) { pStrategy = 1; }
			
			else if(i < numStrategy_1 + numStrategy_2) { pStrategy = 2; }
			
			else if(i < numStrategy_1 + numStrategy_2 + numStrategy_3) { pStrategy = 3; }
			
			else if(i < numStrategy_1 + numStrategy_2 + numStrategy_3 + numStrategy_4) { pStrategy = 4; }
			
			else { pStrategy = 5; }
			
			//Finds winner			
			if (p.getTotalCash() > winnerCash) {
				winnerCash = p.getTotalCash();
				winnerIndx = i;
				winnerStrategy = pStrategy;
			}
			
			System.out.print("\nPlayer " + i + "(Strategy " + pStrategy + ") has $");
			System.out.printf("%.2f", p.getTotalCash());
		}
		
		System.out.println("\nThe winner is: Player " + winnerIndx + ", using Strategy " + winnerStrategy + "! Congratulations!");
		
		players.clear();	//Femoves all elements from the array
	}
	
	//Main
    public static void main (String[] args) {

		//Reading number of turns first, then number of competitors from each strategy:
		//	"java Tournament <number of turns> <players with Strategy 1> <players with Strategy 2> ..."
		//Example:
		//	"java Tournament   100 13 42 24 77 21"
		//					 turns S1 S2 S3 S4 S5
		initialize(args);
    }
}