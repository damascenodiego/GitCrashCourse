package id_7fe6515401ffafcde31d3afe0bfefd08;

import br.usp.icmc.ssc01032015.Competitor;

public class CompetitorDonateAll extends GeneralCompetitor implements Competitor
{	
	public CompetitorDonateAll( int strategy )
	{	
		cash = 0.00;
		lastDonation = 0.00;
		lastRecieved = 0.00;
		this.strategy = strategy;
	}

    public double declareDonationTo(Competitor c)
    {
    	lastDonation = 10.00;
    	return lastDonation;
    }
    
    public void informDonationFrom(Competitor c, double donation)
    {
 		lastRecieved = donation;
    }
}
