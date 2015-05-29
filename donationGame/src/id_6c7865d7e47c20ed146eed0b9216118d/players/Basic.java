package id_6c7865d7e47c20ed146eed0b9216118d.players;

import br.usp.icmc.ssc01032015.Competitor;

public class Basic implements Competitor {
    private double cash;

    public Basic() {
        cash = 0;
    }

	public double declareDonationTo(Competitor c) {
        return 10;
    }

	public void informDonationFrom(Competitor c, double donation) {
        return;
    }

	public void addCash(double amount) {
        cash += amount;
    }

	public double getTotalCash() {
        return cash;
    }
}
