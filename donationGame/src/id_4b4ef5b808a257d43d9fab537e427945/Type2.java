package id_4b4ef5b808a257d43d9fab537e427945;

import java.util.ArrayList;

public class Type2  implements Competitor
{
    /*Atributos*/    
    private ArrayList<Double> hist_cash;
    private ArrayList<Double> hist_donation;
    private ArrayList<Competitor> hist_donator;
    private double total;
    private double donation;
    private int index;
    private Competitor opponent;
    
    
    /*Metodos*/
    Type2()
    {
        this.donation = 0.0;
        this.hist_cash = new ArrayList<>();
        this.hist_donation = new ArrayList<>();
        this.hist_donator = new ArrayList<>();
    }
    
    @Override
    public double declareDonationTo(Competitor c) {
        //Sempre Doar?? 0
        donation = 0.0;            
        
        return donation;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) 
    {
           hist_donator.add(c);
           index = hist_donator.lastIndexOf(c);     //Garante que sempre v??o estar com o mesmo indice
           hist_donation.add(index, donation);
    }

    @Override
    public void addCash(double amount) {
        hist_cash.add(total);
        total += amount;
    }

    @Override
    public double getTotalCash() {
        return this.total;
    }
}
