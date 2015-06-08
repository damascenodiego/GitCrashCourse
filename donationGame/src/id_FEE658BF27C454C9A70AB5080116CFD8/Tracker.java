package id_FEE658BF27C454C9A70AB5080116CFD8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.usp.icmc.ssc01032015.Competitor;

public class Tracker extends CompetitorCore implements Competitor
{
	Map<Competitor, Double> donation_sum;
	Map<Competitor, Integer> donation_amnt;
	Set<Competitor> notrust;
	
	public Tracker()
	{
		super();
		donation_sum = new HashMap<Competitor, Double>();
		donation_amnt = new HashMap<Competitor, Integer>();
		notrust = new HashSet<Competitor>();
	}
	
	public int getStrategyId()
	{
		return 3;
	}
	
	public double declareDonationTo(Competitor c)
	{
		if (notrust.contains(c))
			return 0.0;

		if (donation_amnt.containsKey(c))
		{
			double val = donation_sum.get(c)/donation_amnt.get(c);
			return val;
		}
		return 5.0;
	}
	
	public void informDonationFrom(Competitor c, double donation)
	{
		if (donation < 1.0)
			notrust.add(c);

		if (donation_amnt.containsKey(c))
		{
			donation_sum.put(c, donation_sum.get(c) + donation);
			donation_amnt.put(c, donation_amnt.get(c) + 1);
		}
		else
		{
			donation_sum.put(c, donation);
			donation_amnt.put(c, 1);
		}

	}
	
}
