package id_FEE658BF27C454C9A70AB5080116CFD8;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import br.usp.icmc.ssc01032015.Competitor;

class Rand extends CompetitorCore implements Competitor{
	
	Rand()
	{
		super();
		notrust = new HashSet<Competitor>();
	}
	
	Set<Competitor> notrust;
	
	public int getStrategyId()
	{
		return 1;
	}
	
	public double declareDonationTo(Competitor c)
	{
		Random gen = new Random();
		double amount = gen.nextDouble();
		
		if (!notrust.contains(c))
			amount*=10.0;
		else
			amount/=10.0;
			
		return amount;
	}
	
	public void informDonationFrom(Competitor c, double donation)
	{
		if(donation < 1.0 && !notrust.contains(c))
		{
			notrust.add(c);
		}
	}
	
}
