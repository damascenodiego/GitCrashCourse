
package id_4b4ef5b808a257d43d9fab537e427945;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Torneio {
    
    private ArrayList<Competitor> Lista;
    private ArrayList<Double> ListaFinal;
    private int nRodadas;
    private int nTipos[];
    private static int MAXDONATION = 10;
    
    public Torneio(int nRodadas){
        this.Lista = new ArrayList<>();
        nTipos = new int [5];
        this.nRodadas = nRodadas;
    }
     
    private void receberParticipantes(int Type1, int Type2, int Type3, int Type4, int Type5){
        
        nTipos[0] = Type1;
        nTipos[1] = Type2;
        nTipos[2] = Type3;
        nTipos[3] = Type4;
        nTipos[4] = Type5;
        this.iniciarParticipantes();
    }
    
    private void iniciarParticipantes(){
        
        int i;
        
        for(i = 0; i<nTipos[0]; i++)
          {
            this.addCompetitor(new Type1());
          }
        for(i = 0; i<nTipos[1]; i++)
          {
            this.addCompetitor(new Type2());
          }
        for(i = 0; i<nTipos[2]; i++)
          {
            this.addCompetitor(new Type3());
          }
        for(i = 0; i<nTipos[3]; i++)
          {
            this.addCompetitor(new Type4());
          }
        for(i = 0; i<nTipos[4]; i++)
          {
            this.addCompetitor(new Type5());
          } 
    }
    
    private void addCompetitor(Competitor a){
        Lista.add(a);
    }
    
    public void iniciarTorneio(int Type1, int Type2, int Type3, int Type4, int Type5){
        
        int i, j, k;
        
        this.receberParticipantes(Type1, Type2, Type3, Type4, Type5);
       
        for(i = 0; i<nRodadas; i++){
            
            
            for(j = 0 ; j<Lista.size(); j++){
                for(k = j+1; k<Lista.size(); k++){
                    FIGHT(Lista.get(j), Lista.get(k));
                  }
              }
        }
        
    }
    
    private void FIGHT(Competitor a, Competitor b){
        double donationA, donationB;
        
        donationA = a.declareDonationTo(b);
        donationB = b.declareDonationTo(a);
 
        a.addCash(MAXDONATION - donationA + donationB * 2);
        b.addCash(MAXDONATION - donationB + donationA * 2);
        
        a.informDonationFrom(b, donationB);
        b.informDonationFrom(a, donationA);
    }
    
    public void escreveResultado()
    {
        int i;
        
        ordenar();
        for(i = 0; i< Lista.size(); i++){
             System.out.println(Lista.get(i).getTotalCash());
             //ListaFinal.add(Lista.get(i).getTotalCash());
         }
    }
            private void ordenar(){
                
                Collections.sort(Lista, new Comparator<Competitor>() {
                    @Override
                    public int compare(Competitor c1, Competitor c2) {
                    return Double.compare(c1.getTotalCash(), c2.getTotalCash());
                    }
                });
}


}
