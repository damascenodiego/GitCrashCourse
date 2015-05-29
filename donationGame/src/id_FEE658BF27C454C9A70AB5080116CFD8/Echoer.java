package id_FEE658BF27C454C9A70AB5080116CFD8;


class Echoer extends CompetitorCore implements Competitor
{
	private double last;
	
	Echoer()
	{
		super();
		last = 0.0;
	}
	
	public int getStrategyId()	
	{
		return 4;
	}
	
	public double declareDonationTo(Competitor c)
	{
		return last;
	}
	
	public void informDonationFrom(Competitor c, double donation)
	{
		last = donation;
	}
	
}
