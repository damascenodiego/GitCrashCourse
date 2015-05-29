package id_2d5b283e0854cdf7f4da7d990a0023d8;

// Autores: Danilo Marques A. dos Santos (8598670)
//          Luiz Massao Miyazaki         (8937080)

import java.io.BufferedReader;                  // Necess??rios para a fun????o
import java.io.InputStreamReader;               // de leitura do teclado;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Main o = new Main();
        System.out.print("Numero de rodadas: ");   // Leitura do n??mero
        String line = reader.readLine();            // de rodadas;
        int rounds = new Integer(line);             //
        
        int[] type = new int[5];    // As posi????es do vetor de certa forma armazenam
                                    // o n??mero de jogadores que decidiram usar
                                    // determinada estrat??gia;
        
                                    //        type[0] jogadores usam a estrat??gia 0;
                                    //        type[1] - type[0] jogadores usam a estrat??gia 1;
                                    //        type[2] - type[1] jogadores usam a estrat??gia 2;
                                    //        type[3] - type[2] jogadores usam a estrat??gia 3;
                                    //        type[4] - type[3] jogadores usam a estrat??gia 4;
        
        int aux;                    // Vari??vel auxiliar para leitura da quantidade dos tipos de jogadores;
        
        for(int i=0; i<5; i++) {    // Leitura do n??mero de jogadores por estrat??gia/tipo;
            System.out.print("Numero de jogadores do tipo " + i + ": ");
            line = reader.readLine();
            aux = new Integer(line);
            
            if(i==0) {
                type[i] = aux;
            }
            
            else {
                type[i] = aux + type[i-1];
            }
        }       
        
       Player[] play = new Player[type[4]];        // Cria????o de um vetor do tipo Player para todos os jogadores;
       
       o.initial_players(type, play);
       
       o.trades(rounds, type, play);
       
       int[] aux_play = new int[type[4]];           // Vari??vel auxiliar para ordenar o ranking;
                                                    //
       for(int i=0; i<type[4]; i++) {               //
           aux_play[i]=i;                           //
       }                                            //
       
       o.rank_sort(type, play, aux_play);
       
       o.rank(type, play, aux_play);
       
    }
  
    public void initial_players(int[] type, Player[] play){
        for(int i=0; i<type[0]; i++) {              // Para os "type[0]" (definido no la??o acima)
           play[i] = new Strategy0();              // primeiros jogadores ?? atribu??da a estrat??gia zero;
       }                                           //
       
       for(int i=type[0]; i<type[1]; i++) {        // An??logo ao la??o imediatamente anterior
           play[i] = new Strategy1();              // para "type[1] - type[0]" jogadores.
       }                                           // Dessa vez, a estrat??gia um ?? atribu??da a esses jogadores;
       
       for(int i=type[1]; i<type[2]; i++) {        // An??logo aos dois la??os
           play[i] = new Strategy2();              // imediatamente anteriores;
       }                                           //
                                                   //
       for(int i=type[2]; i<type[3]; i++) {        //
           play[i] = new Strategy3();              //
       }                                           //
                                                   //
       for(int i=type[3]; i<type[4]; i++) {        //
           play[i] = new Strategy4();              //
       }                                           //    
    }
    
    public void trades(int rounds, int[] type, Player[] play){
        for(int k=0; k<rounds; k++) {              // Realiza????o das partidas: "rounds rodadas", onde todos os competidores jogam entre si;
            for(int i=0; i<type[4]; i++) {
                for(int j=i+1; j<type[4]; j++) {
                   
                    play[i].addCash((10.0-play[i].declareDonationTo(play[j])) + 2*play[j].declareDonationTo(play[i]));
                    play[j].addCash((10.0-play[j].declareDonationTo(play[i])) + 2*play[i].declareDonationTo(play[j]));
                 
                }
            }
        }


    }
    
    public void rank_sort(int[] type, Player[] play, int[] aux_play){
        int aux;
        
        for(int i=0; i<type[4]; i++) {               // Ordena????o do ranking atrav??s do algoritmo BubbleSort;
           for(int j=i+1; j<type[4]; j++) {
               
               if (play[aux_play[i]].getTotalCash() < play[aux_play[j]].getTotalCash()) {
                   aux = aux_play[i];
                   aux_play[i] = aux_play[j];
                   aux_play[j] = aux;
               }
               
           }
       }
    }
    
    public void rank(int[] type, Player[] play, int[] aux_play){
        // Imprime o ranking;
       System.out.println("\nRANKING\nClassifica????o\tDinheiro\tEstrat??gia adotada\n");
       
       for(int i=0; i<type[4]; i++) {
            System.out.println((i+1) + "." + "\t\tR$" + play[aux_play[i]].getTotalCash() + "\t\t" + play[aux_play[i]].strategy_type());
       }
    }
}

