package br.usp.icmc.ssc01032015.competitors;

import java.util.Locale;

import br.usp.icmc.ssc01032015.Competitor;


public abstract class AbstractCompetitor implements Competitor,Comparable<AbstractCompetitor>{

	double money;
	

	/*
	 * Competitor constructor 
	 */
	public AbstractCompetitor() {
		money = 0.0;
	}
	
	@Override
	/*
	 * The method declareDonationTo cannot change the money attribute!
	 */
	public abstract double declareDonationTo(Competitor s);

	@Override
	/*
	 * The method informDonationFrom cannot change the money attribute!
	 */
	public abstract void informDonationFrom(Competitor s, double donation);

	@Override
	public final void addCash(double amount) {
		money+=amount;

	}

	@Override
	public final double getCash() {
		return money;
	}
	
	@Override
	public int compareTo(AbstractCompetitor o) {
		return Double.compare(o.money, this.money);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"\t->\t R$ "+String.format(Locale.US, "%.2f", money);
	}
}
