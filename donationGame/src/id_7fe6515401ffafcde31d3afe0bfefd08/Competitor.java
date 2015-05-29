package id_7fe6515401ffafcde31d3afe0bfefd08;

public interface Competitor extends Comparable<Competitor>
{	
    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);
    
    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);
    
    // Adds the amount of cash
    void addCash(double amount);
    
    // Get the amount of cash this competitor has
    double getTotalCash();
    
    // retorna a estrategia usada
    int getStrategy(); 
}
