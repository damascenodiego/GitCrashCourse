
package id_5F69C25389D743BC2322F8BEB1A3D718;

public class PlayerType3 extends Player
{    
    public PlayerType3(int ID, int type, int rounds) 
    {
        super(ID, type, rounds);
    }
    
    @Override
    public double declareDonationTo(Competitor c) 
    {
        double donation = 0.0;
        double sum = 0.0;
        
        for (double x : historic)
            sum += x / (Math.random() * 10 + 1);
        
        if (currentRound != 0)
        {
            donation = sum / currentRound;
            
            if (donation > 10.0)
                donation = 10.0;
        }
        else
            donation = Math.random() * 10;
        
        donation = Math.abs(donation);

        return (donation);
    }
}
