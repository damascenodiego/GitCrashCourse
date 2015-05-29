package id_504355f05234412085c8fc11044d3af6;

import java.util.Random;

public class RandomDonator extends CashCompetitor
{
	private final double min = 1.0;
	private final double max = 5.0;
	private final Random rand = new Random();
	
	@Override
	public double declareDonationTo(Competitor c)
	{
		double donation = 0.0;
		if(this.cash < this.min + this.max)
		{
			donation = rand.nextDouble() * this.cash;
		}
		else
			donation = rand.nextDouble() * this.min + rand.nextDouble() * this.max;
		try
		{
			super.removeCash(donation);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return 0.0;
		}
		return donation;
	}
}
