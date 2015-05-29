package id_afd29ea84776a187e29706c4df0b957b;

public class Main {

	public static void main(String[] arg) {
		String []args = {"10", "2", "2", "2", "2", "2"};

		int rounds;
		int[] numberOfPlayers;
		Competitor[] rank;

		if(args.length < 1){
			System.out.println("java br.usp.icmc.ssc01032015.Main <number of rounds> <number of players using strategy 1> [<number of players using strategy 2> [...]]");
			return;
		}

		rounds = Integer.parseInt(args[0]);
		numberOfPlayers = new int[args.length - 1];

		for(int i = 0; i < numberOfPlayers.length; i++)
			numberOfPlayers[i] = Integer.parseInt(args[i+1]);
		
		Tournament tournament = new Tournament(rounds, numberOfPlayers);
		rank = tournament.startTournament();

		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i] + " - " + rank[i].getTotalCash());
		}
	}

}
