package id_504355f05234412085c8fc11044d3af6;

import br.usp.icmc.ssc01032015.Competitor;

public class Main
{
	public static final int nArgs = 6;

	public static void main(String[] arg)
	{
		String[] args = {"10", "2", "2", "2", "2", "2"};
		if (args.length != Main.nArgs)
		{
			System.out.println("Wrong number of arguments");
			System.out.println("Please use <Number of rounds> <Number of competitors of each type>");
			System.exit(1);
		}

		Game game = null;
		int nCompetitors0 = 0;
		int nCompetitors1 = 0;
		int nCompetitors2 = 0;
		int nCompetitors3 = 0;
		int nCompetitors4 = 0;

		try
		{
			int nRounds = Integer.parseInt(args[0]);
			nCompetitors0 = Integer.parseInt(args[1]);
			nCompetitors1 = Integer.parseInt(args[2]);
			nCompetitors2 = Integer.parseInt(args[3]);
			nCompetitors3 = Integer.parseInt(args[4]);
			nCompetitors4 = Integer.parseInt(args[5]);
			int nCompetitors = nCompetitors0 + nCompetitors1 + nCompetitors2 + nCompetitors3 + nCompetitors4;
			game = new Game(nRounds, nCompetitors);
		}
		catch (Exception e)
		{
			System.out.println("Error creating game");
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		try
		{
			game.join(Greedy.class, nCompetitors0);
			game.join(Generous.class, nCompetitors1);
			game.join(RandomDonator.class, nCompetitors2);
			game.join(ExponentialDonator.class, nCompetitors3);
			game.join(IACompetitor.class, nCompetitors4);
		}
		catch (Exception e)
		{
			System.out.println("Error player joining game");
			System.out.println(e.getMessage());
			System.exit(1);
		}

		game.start();

		for(Competitor competitor : game.getResults())
		{
			System.out.println(competitor.toString());
		}
	}

}
