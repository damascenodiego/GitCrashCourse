package id_a55503a13323afae84ea77e3c49b077b;

import java.util.ArrayList;


public class Round {
	
	public void round(ArrayList<Player> competitors) {
		double v1, v2, amount;
		
		for(int i=0; i<competitors.size()-1; i++) {
			for(int j = i+1; j<competitors.size(); j++) {
				v1 = competitors.get(i).declareDonationTo(competitors.get(j));
				v2 = competitors.get(j).declareDonationTo(competitors.get(i));
				
				competitors.get(i).informDonationFrom(competitors.get(j), v2);
				competitors.get(j).informDonationFrom(competitors.get(i), v1);
				
				amount = (10-v1) + (2*v2);
				competitors.get(i).addCash(amount);
				
				amount = (10-v2) + (2*v1);
				competitors.get(j).addCash(amount);
				
			}
		}
	}
	
	
}
