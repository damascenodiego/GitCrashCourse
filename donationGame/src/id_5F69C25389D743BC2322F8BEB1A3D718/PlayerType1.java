
package id_5F69C25389D743BC2322F8BEB1A3D718;

import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

public class PlayerType1 extends Player
{   
    private Random rand = new Random();
    
    public PlayerType1(int ID, int type, int rounds) 
    {
        super(ID, type, rounds);
    }
    
    @Override
    public double declareDonationTo(Competitor c) 
    {
        boolean stopLoop = false;
        double donation = 5.0;

        while (!stopLoop)
        {
            donation = Math.abs(rand.nextDouble());
            donation *= 10;
            donation += 5;
            
            if (donation < 10.0)
                stopLoop = true;
        }
        
        donation = Math.abs(donation);

        return (donation);
    }
}
