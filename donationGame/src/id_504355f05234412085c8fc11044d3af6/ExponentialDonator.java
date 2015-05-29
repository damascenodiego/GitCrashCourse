package id_504355f05234412085c8fc11044d3af6;

public class ExponentialDonator extends CashCompetitor
{
	private final double maxDonation = 10.0;
	private final double exp = 3.0;

	@Override
	public double declareDonationTo(Competitor c)
	{
		if(this.cash > maxDonation)
			return maxDonation;
		double donation = Math.max(Math.pow(this.cash / this.maxDonation, exp), 1.0) * this.cash;
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
