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
public class guy implements Competitor{
    
    private double totalCash;
    private double donation;

    public void Guy(){
        
        totalCash = 0;
        donation = 5;
    }
    
    @Override
    public double declareDonationTo(Competitor c) {
        return donation;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) {
        this.donation = donation;
    }

    @Override
    public void addCash(double amount) {
        totalCash = amount;
    }

    @Override
    public double getTotalCash() {
        return totalCash;
    }
    
    
}
