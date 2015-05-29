/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_46aebc04b97509660337c196208e7ab1;

import br.usp.icmc.ssc01032015.Competitor;

/**
 *
 * @author AUGUSTO
 */
public class MediaGuy implements Competitor{
    
    private double totalCash;
    private double donation;

    public void BadGuy(){
        
        totalCash = 0;
        donation = 0;
    }
    
    @Override
    public double declareDonationTo(Competitor c) {
        return 5.00;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) {
        this.donation = donation;
    }

    @Override
    public void addCash(double amount) {
        totalCash = totalCash + amount;
    }

    @Override
    public double getTotalCash() {
        return totalCash;
    }
}
