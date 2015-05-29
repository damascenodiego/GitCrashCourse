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
public class Competitor5 extends Competitor1 implements Competitor{
    private double totalCash;
    
    public Competitor5(){
        totalCash = 0;
    }
     // Indicates how much to donate to Competitor c
    public double declareDonationTo(Competitor c){
       return 10;
    }
}
