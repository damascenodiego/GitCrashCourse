package id_90ae014bd2408ecfab890ca6cafcdd1c;
public class Strategy_1 implements Competitor {

    public double totalCash;

    Strategy_1() {
        totalCash = 0;
    }

    public double declareDonationTo(Competitor c) {
        return 0;
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
