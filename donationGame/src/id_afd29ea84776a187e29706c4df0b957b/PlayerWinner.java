package id_afd29ea84776a187e29706c4df0b957b;

import java.util.ArrayList;

public class PlayerWinner extends Player {

	ArrayList<Competitor> comps = new ArrayList<Competitor>();

	@Override
	public String toString(){

		//Todos os nomes sao ficticios e meremente ilustrativos
		//Qualquer semelhanca com a realidade e' mera coincidencia
		return "ATheNewSoN";

	}

	@Override
	public double declareDonationTo(Competitor c) {
		if(comps.contains(c)){
			return 0;
		}
		comps.add(c);
		return 0.000000000000000000893675669267420d;
	}

}
