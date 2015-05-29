
package id_5F69C25389D743BC2322F8BEB1A3D718;

import br.usp.icmc.ssc01032015.Competitor;

public class PlayerType2 extends Player
{   
    private double lastReceived;
    private double lastDonated;
    
    public PlayerType2(int ID, int type, int rounds) 
    {
        super(ID, type, rounds);
        lastReceived = 0.0;
        lastDonated = 0.0;
    }
    
    @Override
    public double declareDonationTo(Competitor c) 
    {
        double donation;
       
        donation = (2 * lastReceived + lastDonated)/ (Math.random() * 4 + 1);
        
        if (donation > 10.0)
            donation = 10.0;
        
        donation = Math.abs(donation);

        lastDonated = donation;
        return (donation);
    }
    
    @Override
    public void informDonationFrom(Competitor c, double donation) 
    {
        lastReceived = donation;
    }
}
