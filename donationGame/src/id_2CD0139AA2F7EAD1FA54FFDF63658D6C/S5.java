package id_2CD0139AA2F7EAD1FA54FFDF63658D6C;

import java.util.ArrayList;

import br.usp.icmc.ssc01032015.Competitor;

public class S5 implements Competitor {

    private double TotalCash = 0;
    ArrayList<Double> Donated = new ArrayList<>();

    @Override
    public double declareDonationTo(Competitor c) {
        return 5;
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
