package id_50d05aa2a02d88bc375bcbe98e807516;

public interface Competitor {

    double declareDonationTo(Competitor C);

    void informDonationFrom(Competitor C, double donation);

    void addCash(double amount);

    double getTotalCash();

}
