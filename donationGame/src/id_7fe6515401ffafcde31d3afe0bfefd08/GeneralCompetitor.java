package id_7fe6515401ffafcde31d3afe0bfefd08;

public class GeneralCompetitor
{
	double cash;
	double lastDonation;	//guarda a ultima doa????o feita
	double lastRecieved;	//guarda a ultima doa????o recebida
	int strategy;	//guarda o tipo de estrategia
	
	/*public GeneralCompetitor( int strategy )
	{	
		cash = 0.00;
		lastDonation = 0.00;
		lastRecieved = 0.00;
		this.strategy = strategy;
	}*/
    
    public void addCash(double amount)
    {
    	cash += amount;
    }
    
    public double getTotalCash()
    {
    	return cash;
    }
    
    public int getStrategy()
    {
    	return strategy;
    }
    
    public int compareTo( Competitor c )
    {
    	int comp = 0;
    	
    	if( cash < c.getTotalCash() )
    	{
    		comp = 1;
    	}
    	else if( cash > c.getTotalCash() )
    	{
    		comp = -1;
    	}
    	
    	return comp;
    }
}
