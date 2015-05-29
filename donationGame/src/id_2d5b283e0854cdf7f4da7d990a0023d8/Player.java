package id_2d5b283e0854cdf7f4da7d990a0023d8;

import br.usp.icmc.ssc01032015.Competitor;

//Autores: Danilo Marques A. dos Santos (8598670)
//         Luiz Massao Miyazaki         (8937080)

public abstract class Player implements Competitor {
    
    public double totalcash;
    
    public abstract int strategy_type();
    
    @Override
    public abstract double declareDonationTo(Competitor c);
    
    @Override
    public abstract void informDonationFrom(Competitor c, double donation);
    
    @Override
    public void addCash(double amount) {
        totalcash += amount;
    }

    @Override
    public double getTotalCash() {
        return totalcash;
    }
}