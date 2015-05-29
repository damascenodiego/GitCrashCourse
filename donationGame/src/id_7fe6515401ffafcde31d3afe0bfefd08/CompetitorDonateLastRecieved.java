package id_7fe6515401ffafcde31d3afe0bfefd08;

public class CompetitorDonateLastRecieved extends GeneralCompetitor implements Competitor
{
	public CompetitorDonateLastRecieved( int strategy )
	{	
		cash = 0.00;
		lastDonation = 0.00;
		lastRecieved = 0.00;
		this.strategy = strategy;
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
