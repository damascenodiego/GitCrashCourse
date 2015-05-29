
package id_5F69C25389D743BC2322F8BEB1A3D718;

import java.util.HashMap;

import br.usp.icmc.ssc01032015.Competitor;

public class PlayerType4 extends Player
{   

    private int sizeHistoric;
    private HashMap<Competitor, double[]> map; 
    // the map associates a Competitor to an array which contains the historic of donations from that specific Competitor
    
    public PlayerType4(int ID, int type, int rounds) 
    {
        super(ID, type, rounds);
        
        map = new HashMap<>();
        sizeHistoric = rounds; // size of the array that will stores the received donations for each Competitor
    }
    
    @Override
    public double declareDonationTo(Competitor c) 
    {
        double donation = 0.0;
        
        if (currentRound == 0)
        {
            map.put(c, new double[sizeHistoric]);
            donation = Math.random() * 5;
        }
        else
        {
            int aux = (sizeHistoric / 10) + ((sizeHistoric % 10 == 0) ? 0 : 1); // aux = CEIL(sizeHistoric / 10), aux = 10% of the game
            
            double sumWeight = 0.0;
            double sum = 0.0;
            
            double[] vector;
            vector = map.get(c);
            
            for (int i = 0, weight = 1; i < currentRound; i++)
            {
                sum += (vector[i] * weight);                       // weighted average
                sumWeight += weight;                               // accumulating the weight
                weight = (i % aux == 0) ? (weight + 1) : (weight); // if passed more 10% of the game, weight++ or else maintain it
            }
                
            
            donation = (sum / sumWeight); 
            // donation = weighted average, giving more weight in ascending order 
            // (according to the current round) to the received donations from "Competitor c"
        }

        donation = Math.abs(donation);

        return (donation);
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) 
    {
        map.get(c)[currentRound] = donation;  // storing the donation from "Competitor c" in the historic
    }
}
