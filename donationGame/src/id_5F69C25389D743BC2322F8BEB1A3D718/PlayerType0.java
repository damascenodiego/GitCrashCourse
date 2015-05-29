
package id_5F69C25389D743BC2322F8BEB1A3D718;

public class PlayerType0 extends Player
{ 
    public PlayerType0(int ID, int type, int rounds) 
    {
        super(ID, type, rounds);
    }
    
    @Override
    public double declareDonationTo(Competitor c) 
    {
        int mod;
        long time;
        double donation;
        
        time = System.nanoTime();
        mod = (int) (time % 10);
        
        if (mod < 5)
            donation = (double) mod;
        else
            donation = mod * (0.1);
        
        donation = Math.abs(donation);

        return (donation);
    }
}
