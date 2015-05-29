package id_2d5b283e0854cdf7f4da7d990a0023d8;

//Autores: Danilo Marques A. dos Santos (8598670)
//         Luiz Massao Miyazaki         (8937080)

public interface Competitor {
    
    // Indicates how much to donate to Competitor c;
    double declareDonationTo(Competitor c);
    
    // Indicates how much was donated from Competitor c;
    void informDonationFrom(Competitor c, double donation);
    
    // Adds the amount of cash;
    void addCash(double amount);
    
    // Gets the amount of cash this competitor has;
    double getTotalCash();
    
}