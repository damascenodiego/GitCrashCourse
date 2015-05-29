/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_823f8912a4d502ff866453d2c1bf00fa;
import java.util.ArrayList;

import br.usp.icmc.ssc01032015.Competitor;

/**
 *
 * @author Adriller, Allan, Hikaro
 */
public class Tournment{
    int[] quantity = new int[5];
    int rounds, i, flag = 1;
    ArrayList<Competitor> Competitors = new ArrayList<Competitor>();
    
    public Tournment(int rnds, int qtC1, int qtC2, int qtC3, int qtC4, int qtC5){
       quantity[0] = qtC1;
       quantity[1] = qtC2;
       quantity[2] = qtC3;
       quantity[3] = qtC4;
       quantity[4] = qtC5;
       rounds = rnds;
   }
    
    public void Create(){
        for(int count: quantity){
            for(i = 0 ; i < count ; i++){
                if(flag == 1)
                    Competitors.add(new Competitor1());
                if(flag == 2)
                    Competitors.add(new Competitor2());
                if(flag == 3)
                    Competitors.add(new Competitor3());
                if(flag == 4)
                    Competitors.add(new Competitor4());
                if(flag == 5)
                    Competitors.add(new Competitor5());
            }
            flag ++;
        }
    }
    
    void Begin(){
        int i, j, k;
        double donation1, donation2;
        for(i = 0 ; i < rounds ; i++){
            for(j = 0 ; j < Competitors.size() ; j++){
                for(k = j ; k < Competitors.size() ; k++){
                    if(j != k){
                        donation1 = Competitors.get(j).declareDonationTo(Competitors.get(k));
                        donation2 = Competitors.get(k).declareDonationTo(Competitors.get(j));
                        Competitors.get(j).informDonationFrom(Competitors.get(k), donation2);
                        Competitors.get(k).informDonationFrom(Competitors.get(j), donation1);
                        Competitors.get(j).addCash((10 - donation1) + (2 * donation2));
                        Competitors.get(k).addCash((10 - donation2) + (2 * donation1));
                    }
                }
            }
        }
    }
    
    
    
    public void Finish(){
       double bigger;
       int i, index = 0, j;
       System.out.println("Results:");
       for(j = 1 ; Competitors.size() > 0 ; j++){
           bigger = Competitors.get(0).getTotalCash();
           for(i = 0 ; i < Competitors.size() ; i++){
               if(bigger < Competitors.get(i).getTotalCash()){
                   bigger = Competitors.get(i).getTotalCash();
                   index = i;
               }
           }
           System.out.print(j + " Place: total cash = ");
           System.out.print(Competitors.get(index).getTotalCash());
           System.out.println(". Is a: " + Competitors.get(index).getClass());
           Competitors.remove(Competitors.get(index));
       }
    }
}
