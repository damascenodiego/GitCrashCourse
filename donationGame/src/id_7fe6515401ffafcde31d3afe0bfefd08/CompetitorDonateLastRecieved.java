package id_7fe6515401ffafcde31d3afe0bfefd08;

import br.usp.icmc.ssc01032015.Competitor;

public class CompetitorDonateLastRecieved extends GeneralCompetitor implements Competitor
{
	public CompetitorDonateLastRecieved( int strategy )
	{	
		cash = 0.00;
		lastDonation = 0.00;
		lastRecieved = 0.00;
		this.strategy = strategy;
	}
	
	public CompetitorDonateLastRecieved() {
		this(0);
		this.strategy = this.getClass().getName().hashCode();
	}
	
    public double declareDonationTo(Competitor c)
    {
    	lastDonation = lastRecieved;
    	return lastDonation;
    }
    
    public void informDonationFrom(Competitor c, double donation)
    {
 		lastRecieved = donation;
    }
}
