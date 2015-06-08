package id_7fe6515401ffafcde31d3afe0bfefd08;

import br.usp.icmc.ssc01032015.Competitor;

public class CompetitorDonateFormula extends GeneralCompetitor implements Competitor
{	
	public CompetitorDonateFormula( int strategy )
	{	
		cash = 0.00;
		lastDonation = 0.00;
		lastRecieved = 0.00;
		this.strategy = strategy;
	}
	
	public CompetitorDonateFormula() {
		this(0);
		this.strategy = this.getClass().getName().hashCode();
	}
	

    public double declareDonationTo(Competitor c)
    {
    	lastDonation = (0.7 * cash + lastRecieved) % 10;
    	return lastDonation;
    }
    
    public void informDonationFrom(Competitor c, double donation)
    {
 		lastRecieved = donation;
    }
}
