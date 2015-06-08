package id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies;

import br.usp.icmc.ssc01032015.Competitor;

import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Player;

public class S5Player extends Player {

	public S5Player(String name) {
		super(name);
	}
	
	public S5Player() {
		this("S5Player");
	}

	@Override
	public double declareDonationTo(Competitor c) {
		if(!(c instanceof Player)) return 0.0;
		double donation = 10d;
		
		Player aux = (Player)c;
		aux.setDonated(donation);
		return donation;
	}
}
