package id_2CD0139AA2F7EAD1FA54FFDF63658D6C;

import java.util.ArrayList;

public class S2 implements Competitor {

    private double TotalCash = 0;
    ArrayList<Double> Donated = new ArrayList<>();
    double d = 11;

    @Override
    public double declareDonationTo(Competitor c) {
        d--;
        if (d == 0) {
            d = 10;
        }
        return d;
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
