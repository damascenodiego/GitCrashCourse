package id_90ae014bd2408ecfab890ca6cafcdd1c;

import br.usp.icmc.ssc01032015.Competitor;

public class Strategy_5 implements Competitor {

    public double totalCash;

    Strategy_5() {
        totalCash = 0;
    }

    public double declareDonationTo(Competitor c) {
        return Math.abs(totalCash % 10);
    }

    public void informDonationFrom(Competitor c, double donation) {
        System.out.printf("%.2f", donation);
        return;
    }

    public void addCash(double amount) {
		totalCash += amount;
        return;
    }

    public double getTotalCash() {
        return totalCash;
    }
}
