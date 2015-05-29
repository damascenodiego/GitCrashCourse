package id_90ae014bd2408ecfab890ca6cafcdd1c;
public interface Competitor {

    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);
    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);
    // Adds the amount of cash
    void addCash(double amount);
    // Get the amount of cash this competitor has
    double getTotalCash();
}