
package id_5F69C25389D743BC2322F8BEB1A3D718;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.usp.icmc.ssc01032015.Competitor;

public class PlayerType4 extends Player
{   

	private HashMap<Competitor, List<Double>> map; 
	// the map associates a Competitor to an array which contains the historic of donations from that specific Competitor

	public PlayerType4() 
	{
		//        super(ID, type, rounds);
		super();

		map = new HashMap<>();
		//        sizeHistoric = rounds; // size of the array that will stores the received donations for each Competitor
	}

	@Override
	public double declareDonationTo(Competitor c) 
	{
		double donation = 0.0;

		int sizeHistoric = map.size();

		currentRound = ((!map.containsKey(c))? 0: map.get(c).size()) ;
		if (currentRound  == 0)
		{
			map.put(c, new ArrayList<Double>());
			donation = Math.random() * 5;
		}
		else
		{
			int aux = (sizeHistoric / 10) + ((sizeHistoric % 10 == 0) ? 0 : 1); // aux = CEIL(sizeHistoric / 10), aux = 10% of the game

					double sumWeight = 0.0;
					double sum = 0.0;

					List<Double> vector;
					vector = map.get(c);

					for (int i = 0, weight = 1; i < currentRound; i++)
					{
						sum += (vector.get(i) * weight);                       // weighted average
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
		if(!map.containsKey(c)){
			map.put(c, new ArrayList<Double>());  // store "Competitor c" 
		}
		map.get(c).add(donation);  // storing the donation from "Competitor c" in the historic
	}
}
