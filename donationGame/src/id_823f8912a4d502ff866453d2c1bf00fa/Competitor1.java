/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_823f8912a4d502ff866453d2c1bf00fa;

import br.usp.icmc.ssc01032015.Competitor;

/**
 *
 * @author Adriller, Allan, Hikaro
 */
public class Competitor1 implements Competitor{
    private double totalCash;
     
    public Competitor1(){
        totalCash = 0;
    }
    // Indicates how much to donate to Competitor c
    public double declareDonationTo(Competitor c){
        return 0;
    }
    
    // Indicates how much was donated from Competitor c
    public void informDonationFrom(Competitor c, double donation){
        System.out.println("Donated: " + donation);
    }
    
    // Adds the amount of cash
    public void addCash(double amount){
        totalCash += amount;
    }
    
    // Get the amount of cash this competitor has
    public double getTotalCash(){
        return totalCash;
    }
}
