package id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies;

import br.usp.icmc.ssc01032015.Competitor;

import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Player;

public class S3Player extends Player {

	public S3Player(String name) {
		super(name);
	}

	@Override
	public double declareDonationTo(Competitor c) {
		double donation = 5d;
		
		Player aux = (Player)c;
		aux.setDonated(donation);
		return donation;
	}	
}
