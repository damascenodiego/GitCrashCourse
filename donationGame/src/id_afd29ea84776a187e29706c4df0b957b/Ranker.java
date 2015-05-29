package id_afd29ea84776a187e29706c4df0b957b;

import java.util.Comparator;
class Ranker implements Comparator<Competitor>{

	@Override
	public int compare(Competitor p1, Competitor p2){

		if(p1.getTotalCash() == p2.getTotalCash())
			return 0;
		else if(p1.getTotalCash() < p2.getTotalCash())
			return 1;
		else if(p1.getTotalCash() > p2.getTotalCash())
			return -1;
		return 0;
	}
	
}
