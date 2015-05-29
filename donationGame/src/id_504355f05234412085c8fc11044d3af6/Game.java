package id_504355f05234412085c8fc11044d3af6;

import java.util.Arrays;
import java.util.Comparator;

import br.usp.icmc.ssc01032015.Competitor;

public class Game
{
	private int nRounds;
	private int nCompetitors;
	private int nMaxCompetitors;

	private Competitor[] competitors;

	public Game(int nRounds, int nMaxCompetitors) throws Exception
	{
		if (nRounds < 1)
			throw new Exception("Number of rounds lesser than 1.");
		if (nMaxCompetitors < 1)
			throw new Exception("Number of competitors lesser than 1.");

		this.nRounds = nRounds;
		this.nMaxCompetitors = nMaxCompetitors;
		this.nCompetitors = 0;
		this.competitors = new Competitor[this.nMaxCompetitors];
	}

	public void start()
	{
		for (Competitor c : this.competitors)
		{
			c.addCash(10.0);
		}
		
		for (int i = 0; i < this.nRounds; i++)
		{
			this.beginRound();
		}
	}
	
	private void beginRound()
	{
		for (int i = 0; i < competitors.length; i++)
		{
			for (int j = i + 1; j < competitors.length; j++)
			{
				double donationA = this.competitors[i].declareDonationTo(this.competitors[j]);
				double donationB = this.competitors[j].declareDonationTo(this.competitors[i]);
				this.competitors[i].informDonationFrom(this.competitors[j], donationB * 2.0);
				this.competitors[j].informDonationFrom(this.competitors[i], donationA * 2.0);
			}
		}
	}

	public void join(Class<? extends Competitor> t, int quantity) throws Exception
	{
		if(this.nCompetitors == nMaxCompetitors)
			throw new Exception("Error joining " + t.getName() + ". List of competitors is full.");
		for (int i = 0; i < quantity && i < this.nMaxCompetitors -  this.nCompetitors; i++)
		{
			this.competitors[this.nCompetitors + i] = t.newInstance();
		}
		
		this.nCompetitors += quantity;
	}

	public Competitor[] getResults()
	{
		Arrays.sort(this.competitors, new Comparator<Competitor>()
		{
			@Override
			public int compare(Competitor a, Competitor b)
			{
				return Double.compare(b.getTotalCash(), a.getTotalCash());
			}
		});
		return this.competitors;
	}
}
