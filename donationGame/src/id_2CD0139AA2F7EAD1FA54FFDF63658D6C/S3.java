package id_2CD0139AA2F7EAD1FA54FFDF63658D6C;

import java.util.ArrayList;

public class S3 implements Competitor {

    private double TotalCash = 0;
    ArrayList<Double> Donated = new ArrayList<>();

    @Override
    public double declareDonationTo(Competitor c) {

        double d = 0;
        for (int i = 0; i < Donated.size(); i++) {
            d += 9 * Donated.get(i);
            if (d > 10) {
                d /= 10;
            }
        }
        double d2 = Integer.parseInt(Integer.toString((int) d).substring(0, 1));
        return d2;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) {
        Donated.add(donation);
    }

    @Override
    public void addCash(double amount) {
        TotalCash += amount;
    }

    @Override
    public double getTotalCash() {
        return TotalCash;
    }
}
