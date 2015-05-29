
package id_6884f0fdd5ae152b4e5838f18e1c8124;

public interface Competitor {
    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);
    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);
    // Adds the amount of cash
    void addCash(double amount);
    // Get the amount of cash this competitor has
    double getTotalCash();
    //Retorna o tipo do jogador
    int getType();
}
