
package id_5F69C25389D743BC2322F8BEB1A3D718;

import java.util.ArrayList;
import java.util.List;

import br.usp.icmc.ssc01032015.Competitor;

public class Player implements Competitor_Game
{
    // "protected" variables, so who extends this class is able to access
    
    protected List<Double>historic;
    protected double totalAmount;
    
    protected int currentRound;
    
//    protected final int ID;
//    protected final int type;
    
    //public Player(int ID, int type, int rounds)
    public Player()
    {
        historic = new ArrayList<Double>();
        totalAmount = 0.0;
        currentRound = 0;
        
//        this.ID = ID;
//        this.type = type;
    }
    
    @Override
    public double declareDonationTo(Competitor c) 
    {
        /*
         * this method will be overridden in the others descendent classes
         * because each descendent class has a different game strategy
         */
        return (10.0);
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) 
    {
        /*
         * this method will be overridden in the others descendent classes
         * because each descendent class has a different game strategy
         */
    }

    @Override
    public void addCash(double amount) 
    {
        historic.add(amount);
        totalAmount += amount;
    }

    @Override
    public double getTotalCash() 
    {
        return (totalAmount);
    }
    
    @Override
    public void informRound(int round)
    {
        currentRound = round;
    }    
   
//    @Override
//    public int getID() 
//    {
//        return (this.hashCode());
//    }
//    
//    @Override
//    public int getType()
//    {
//        return (type);
//    }
    
}
