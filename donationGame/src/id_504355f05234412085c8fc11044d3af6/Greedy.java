package id_504355f05234412085c8fc11044d3af6;

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
