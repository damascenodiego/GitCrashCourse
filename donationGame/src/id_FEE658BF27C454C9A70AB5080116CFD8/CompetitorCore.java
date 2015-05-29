package id_FEE658BF27C454C9A70AB5080116CFD8;

import br.usp.icmc.ssc01032015.Competitor;

class CompetitorCore /*diz respeito a tudo que ?? comum entre todos os competidores, os quais devem todos extender esta classe */
{
	private double cash;
	
	CompetitorCore()
	{
		cash = 0.0;
	}
	
	final public void addCash(double c)
	{
		cash+=c;
	}
	
	final public double getTotalCash()
	{
		return cash;
	}
	
	public int compareTo(Competitor p)
	{
		if (cash > p.getTotalCash())
			return -1;
		else if (cash < p.getTotalCash())
			return 1;
		return 0;
	}
}
