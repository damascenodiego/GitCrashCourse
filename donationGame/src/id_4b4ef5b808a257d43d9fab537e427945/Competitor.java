package id_4b4ef5b808a257d43d9fab537e427945;

public interface Competitor 
{
    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);
    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);
    // Adds the amount of cash
    void addCash(double amount);
    // Get the amount of cash this Competitor has
    double getTotalCash();
}