package id_fa8fd019405b205a90b1ad86be19fb9d;

import br.usp.icmc.ssc01032015.Competitor;

public abstract class BasicCompetitor implements Competitor{
	protected double totalCash = 0.0;
	
	@Override
	public void addCash(double amount) {
		totalCash += amount;
	}

	@Override
	public double getTotalCash() {
		return totalCash;
	}
} 
