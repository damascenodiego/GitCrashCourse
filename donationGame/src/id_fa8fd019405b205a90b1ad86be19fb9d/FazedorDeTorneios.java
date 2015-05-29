//Gabriel Scalet Bicalho, 8937204
//Nicolas Bassetto Leite, 8937292
//Danilo De Moraes Costa, 8921972

package id_fa8fd019405b205a90b1ad86be19fb9d;

import id_fa8fd019405b205a90b1ad86be19fb9d.Torneio.GameIsOverException;
import id_fa8fd019405b205a90b1ad86be19fb9d.Torneio.MatchIterator;

public class FazedorDeTorneios {
	
	public static void main(String[] arg){
		String []args = {"10", "2", "2", "2", "2", "2"};
		Class[] classesCompetidores = new Class[]{
				CompetitorZero.class,
				CompetitorTitForTat.class,
				CompetitorMax.class,
				PlayerHalf.class,
				PlayerJustice.class};
		
		if(args.length != classesCompetidores.length + 1){
			System.out.println("Wrong usage!");
			System.out.print("Parameters: #rounds ");
			for(int i=0; i<classesCompetidores.length; i++)
				System.out.print("#p" + (i+1) + " ");
			return;
		}
		
		int[] nCompetidores = new int[args.length-1];
		for(int i = 0; i < nCompetidores.length; i++)
			nCompetidores[i] = Integer.parseInt(args[i+1]);
		
		int nRodadas = Integer.parseInt(args[0]);
		
		FairMatchIterator fmi = new FairMatchIterator();
		
		Torneio t = new Torneio(nRodadas, classesCompetidores, nCompetidores, fmi);
		
		while(t.hasRounds()){
			try {
				t.doRound();
			} catch (GameIsOverException e) {}
		}
		
		t.printCurrentScoreboard();
	}
	
	private static class FairMatchIterator implements MatchIterator{

		@Override
		public void doMatch(Competitor c1, Competitor c2) {
			double c1Donation = c1.declareDonationTo(c2);
			if(c1Donation < 0.0)
				c1Donation = 0.0;
			else
				c1Donation = Math.min(10.0, c1Donation);
			
			double c2Donation = c2.declareDonationTo(c1);
			if(c2Donation < 0.0)
				c2Donation = 0.0;
			else
				c2Donation = Math.min(10.0, c2Donation);
			
			
			c1.informDonationFrom(c2, c2Donation);
			c2.informDonationFrom(c1, c1Donation);

			c1.addCash(10.0 - c1Donation + 2 * c2Donation);
			c2.addCash(10.0 - c2Donation + 2 * c1Donation);			
		}
	}
}
