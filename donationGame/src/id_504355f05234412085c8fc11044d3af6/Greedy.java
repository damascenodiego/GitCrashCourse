package id_504355f05234412085c8fc11044d3af6;

import br.usp.icmc.ssc01032015.Competitor;

public class Greedy extends CashCompetitor
{
	private final double constant = 0.25;
	@Override
	public double declareDonationTo(Competitor c)
	{
		double donation = Math.min(MAX, this.constant * this.cash);
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
