package id_FEE658BF27C454C9A70AB5080116CFD8;
import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

public class Mirror extends CompetitorCore implements Competitor
{	
	Map<Competitor, Double> m;
	
	public 
	Mirror()
	{
		super();
		m = new HashMap<Competitor, Double>();
	}
	
	public int getStrategyId()
	{
		return 5;
	}
	
	public double declareDonationTo(Competitor c)
	{
		if (m.containsKey(c))
		{
			double val = m.get(c);
				return val;
		}
		return 1.618;
	}
	
	public void informDonationFrom(Competitor c, double donation)
	{
		m.put(c, donation);
	}
	
}
