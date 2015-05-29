package id_FEE658BF27C454C9A70AB5080116CFD8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tournament{
	
	private List<Competitor> comp = new ArrayList<Competitor>();
	private int rounds;
	
	public Tournament(int s1, int s2, int s3, int s4, int s5)
	{
		rounds = 0;
		for (int i = 0; i < s1; i++)
		{
			comp.add(new Rand());
		}
		for (int i = 0; i < s2; i++)
		{
			comp.add(new Traitor());
		}
		for (int i = 0; i < s3; i++)
		{
			comp.add(new Tracker());
		}
		for (int i = 0; i < s4; i++)
		{
			comp.add(new Echoer());
		}
		for (int i = 0; i < s5; i++)
		{
			comp.add(new Mirror());
		}
	}
	
	public void runRound()
	{
		int i, j;
		Competitor A, B;
		double fromA, fromB;
		for (i = 0; i < comp.size() -1; i++)
		{
			for (j = i+1; j < comp.size(); j++)
			{
				A = comp.get(i);
				B = comp.get(j);
				fromA = A.declareDonationTo(B);
				fromB = B.declareDonationTo(A);
				A.informDonationFrom(B, fromB);
				B.informDonationFrom(A, fromA);
				A.addCash(10.0 - fromA + 2*fromB);
				B.addCash(10.0 - fromB + 2*fromA);
			}
		}
		rounds++;
	}
	
	public void runRound(int amount)
	{
		for (int i = 0; i < amount; i++)
			runRound();
	}
	
	public void displayRanking()
	{
		List<Competitor> copy = new ArrayList<Competitor>();
		copy.addAll(comp);
		Collections.sort(copy);
		for (int i = 0; i < copy.size(); i++)
			System.out.println(i+1 + "- " + copy.get(i).getTotalCash() + " (strategy " + copy.get(i).getStrategyId() + ")");
	}
	
}
