package id_4b4ef5b808a257d43d9fab537e427945;

import java.util.ArrayList;

import br.usp.icmc.ssc01032015.Competitor;

public class Type5 implements Competitor
{
    /*Atributos*/
    private ArrayList<Double> hist_cash;
    private ArrayList<Double> hist_donation;
    private ArrayList<Competitor> hist_donator;
    private double total;
    private double donation;
    private double donation_received;
    private int index;
    private Competitor opponent;    
    
    
    /*Metodos*/
    public Type5()
    {
        this.donation = 0.0;
        this.donation_received = 0.0;
        this.hist_cash = new ArrayList<>();
        this.hist_donation = new ArrayList<>();
        this.hist_donator = new ArrayList<>();
    }
    
    @Override
    public double declareDonationTo(Competitor c) {
        /*
        Doa 1 se no encontro anterior foi doado menos 5 ou 5,
        se n??o doa 9
        Doa 5 se for o primeiro encontro
        */
        
        try{
            index = hist_donator.lastIndexOf(c);
            
            if(hist_cash.get(index)<=5.0){
                donation = 1.0;
            }else{
                donation = 9.0;
            }
            
        }catch (IndexOutOfBoundsException ioobe){
            donation = 5.0;
        }               
                       
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
