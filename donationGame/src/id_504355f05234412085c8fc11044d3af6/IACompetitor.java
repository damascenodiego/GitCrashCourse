package id_504355f05234412085c8fc11044d3af6;

import java.util.LinkedHashMap;

public class IACompetitor extends CashCompetitor
{
	private LinkedHashMap<Class<? extends Competitor>, Double> map;
	double max = 0.0;

	public IACompetitor()
	{
		this.map = new LinkedHashMap<>();
	}

	@Override
	public double declareDonationTo(Competitor c)
	{
		double donation;

		if(map.containsKey(c.getClass()) && max != 0.0)
			donation = Math.min(map.get(c.getClass())/max * this.cash, MAX);
		else
			donation = Math.min(this.cash / 2.0, MAX);

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

	@Override
	public void informDonationFrom(Competitor c, double donation)
	{
		double value = 0.0;
		if(map.containsKey(c.hashCode()))
			value = map.get(c.getClass());
		value += donation;
		if(value > max)
			max = value;
		super.informDonationFrom(c, donation);
	}
}
