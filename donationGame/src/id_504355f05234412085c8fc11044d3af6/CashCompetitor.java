package id_504355f05234412085c8fc11044d3af6;

import br.usp.icmc.ssc01032015.Competitor;

public abstract class CashCompetitor implements Competitor
{
	protected double cash = 0.0;
	protected final double MAX = 10.0;
	
	protected void removeCash(double amount) throws Exception
	{
		if(amount > cash)
			throw new Exception("Trying to remove more cash than the competitor have.");
		if(amount > MAX)
			throw new Exception("Trying to donate more than 10.");
		if(amount > 0.0)
			this.cash -= amount;
	}
	
	@Override
	public void addCash(double amount)
	{
		if(amount > 0.0)
			this.cash += amount;
	}

	@Override
	public double getTotalCash()
	{
		return this.cash;
	}

	@Override
	public void informDonationFrom(Competitor c, double donation)
	{
		this.addCash(donation);
	}

	@Override
	public String toString()
	{
		return getClass().getName() + ":" + this.cash;
	}
}
