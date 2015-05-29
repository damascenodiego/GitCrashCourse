package id_FEE658BF27C454C9A70AB5080116CFD8;
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

class Traitor extends CompetitorCore implements Competitor
{
	
	Traitor()
	{
		super();
	}
	
	public int getStrategyId()
	{
		return 2;
	}
	
	public double declareDonationTo(Competitor c)
	{
		Random gen = new Random();
		return gen.nextDouble()/10.0;
	}
	public void informDonationFrom(Competitor c, double donation)
	{
	
	}
}
