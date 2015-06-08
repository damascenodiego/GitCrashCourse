package id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies;

import br.usp.icmc.ssc01032015.Competitor;

import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Player;

public class S4Player extends Player {

	public S4Player(String name) {
		super(name);
	}
	public S4Player() {
		this("S4Player");
	}

	@Override
	public double declareDonationTo(Competitor c) {
		if(!(c instanceof Player)) return 0.0;
		double donation = 7.5d;
		
		Player aux = (Player)c;
		aux.setDonated(donation);
		return donation;
	}
}
