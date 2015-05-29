/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id_46aebc04b97509660337c196208e7ab1;
 
import java.util.ArrayList;
/**
 *
 * @author AUGUSTO
 */
public class Torneio_DilemaPrisioneiro {

    /**
     *
     * @param c
     * @param n1 = numero de jogadores da estrategia um (BadGuy)
     * @param n2 = numero de jogadores da estrategia dois (GoodGuy)
     * @param n3 = numero de jogadores da estrategia tres (RandomGuy)
     * @param n4 = numero de jogadores da estrategia quatro (Guy)
     * @param n5 = umero de jogadores da estrategia cinco (MediaGuy)
     */
    public static void ConstroiTorneio(ArrayList<Competitor> c, int n1, int n2, int n3, int n4, int n5){
        
        for(int i=0; i<n1; i++){
            boolean add = c.add(new BadGuy());
        }
        
        for(int i=0; i<n2; i++){
            boolean add = c.add(new GoodGuy());
        }
        
        for(int i=0; i<n3; i++){
            boolean add = c.add(new RandomGuy());
        }
        
        for(int i=0; i<n4; i++){
            boolean add = c.add(new guy());
        }
        
        for(int i=0; i<n5; i++){
            boolean add = c.add(new MediaGuy());
        }
    }
    
    /**
     * @param args the command line arguments
     * args[0] = numero de rodadas
     * args[1] = numero de jogadores da estrategia um (BadGuy)
     * args[2] = numero de jogadores da estrategia dois (GoodGuy)
     * args[3] = numero de jogadores da estrategia tres (RandomGuy)
     * args[4] = numero de jogadores da estrategia quatro (Guy)
     * args[5] = numero de jogadores da estrategia cinco (MediaGuy)
     */
    public static void main(String[] arg) {
    	String[] args = {"10", "2", "2", "2", "2", "2"};
        // TODO code application logic here
        
        ArrayList<Competitor> competidores = new ArrayList(); 
        
        ConstroiTorneio(competidores, Integer.parseInt(args[1]),Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
        
        int jogadores = Integer.parseInt(args[1]) + Integer.parseInt(args[2]) + Integer.parseInt(args[3]) + Integer.parseInt(args[4]) + Integer.parseInt(args[5]);
        
        int rodadas = Integer.parseInt(args[0]);
        
        for(int i=0; i<rodadas; i++){
            for(int j=0; j<jogadores; j++){
                for(int k=j+1; k<jogadores; k++){
                    //if(j!=k){
                        Competitor p1 = competidores.get(j); //Competidor de indice j jogador um
                        Competitor p2 = competidores.get(k);//Competidor de indice k jogador dois
                        
                        double q1 = p1.declareDonationTo(p2);//quantidade doada 
                        double q2 = p2.declareDonationTo(p1);
                        
                        p1.informDonationFrom(p2, q2);
                        p2.informDonationFrom(p1, q1);
                        
                        p1.addCash(10-q1 + 2*q2);
                        p2.addCash(10-q2 + 2*q1);
                    //}
                }
            }
        }
        
        for(int i=0; i<jogadores; i++){
            Competitor p = competidores.get(i);
            System.out.println(p.getTotalCash());
        }
    }
}
