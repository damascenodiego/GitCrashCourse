/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_46aebc04b97509660337c196208e7ab1;

import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;
/**
 *
 * @author AUGUSTO
 */
public class RandomGuy implements Competitor{
    
    private double totalCash;
    private double donation;
    private double mydonation;
    
    public void RandomGuy(){
        
        totalCash = 0;
        donation = 0;
        mydonation = 0;
    }

    @Override
    public double declareDonationTo(Competitor c) {
        Random r = new Random();
        mydonation = r.nextInt(11);
        return mydonation/1.00;
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
