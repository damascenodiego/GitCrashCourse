package id_90ae014bd2408ecfab890ca6cafcdd1c;
public class Strategy_2 implements Competitor {

    public double totalCash;
	
    Strategy_2() {
        totalCash = 0;
    }

    public double declareDonationTo(Competitor c) {
        return 10;
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
