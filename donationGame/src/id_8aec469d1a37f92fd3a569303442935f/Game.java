package id_8aec469d1a37f92fd3a569303442935f;

import java.util.Arrays;
 
public class Game {    
	private double amount1, amount2;
	private int n_round, competitors_total, i, k, j;
	private int n_competitors[] = new int[5];
	private Player[] players;
	
	public Game(String args[]) {
		n_round = Integer.parseInt(args[0]);
		
		for(i=0; i<5; i++) {
            n_competitors[i] = Integer.parseInt(args[i+1]);
            competitors_total += n_competitors[i];
        }
	}
	
	public void startGame() {
		 players = new Player[competitors_total];
	       
        //-----------------------------------------------------------------------------
        for(i=0; i<n_competitors[0]; i++) {
            players[i] = new LeeSin();
        }
       
        for(;i<n_competitors[0]+n_competitors[1]; i++) {
            players[i] = new Sion();
        }
       
        for(;i<n_competitors[0]+n_competitors[1]+n_competitors[2]; i++){
            players[i] = new JohnTravolta();
        }
       
        for(;i<n_competitors[0]+n_competitors[1]+n_competitors[2]+n_competitors[3]; i++){
            players[i] = new Bob();
        }
       
        for(;i<n_competitors[0]+n_competitors[1]+n_competitors[2]+n_competitors[3]+n_competitors[4]; i++){
            players[i] = new Cafu();
        }
        
        //n de rodadas
		for(k=0; k<n_round; k++) {
	           //n competidores
	           for(i=0; i<competitors_total; i++) {
	        	   //n competidores
	               for(j=i+1; j<competitors_total; j++) {
	            	   		
	            	   	   //doa????????????es e recebimentos	
	                       amount1 = players[i].declareDonationTo(players[j]);
	                       amount2 = players[j].declareDonationTo(players[i]);
	                       players[j].informDonationFom(players[i], amount1);
	                       players[i].informDonationFom(players[j], amount2);                
	                       players[i].addCash(((10-amount1) + (2*amount2)));
	                       players[j].addCash(((10-amount2) + (2*amount1)));
	               
	               }
	           
	           }
	           
	       }
	}
	
	public void printRanking() {
		//Ordena de acordo com o TotalCash
        Arrays.sort(players);
        
        //printa ranking
        System.out.printf("Colocacao\tMontante\tEstrategia\n");
        for(i=0; i<players.length; i++)
        	System.out.printf("    %d??????\t\t%.2f\t\t    %d\n", i+1, players[i].getTotalCash(), players[i].getStrategy_number());
	}
	
	
   
    public static void main(String arg[]) {
       
    	String[] args = {"10", "2", "2", "2", "2", "2"};
    	
        if(args.length != 6) {
            System.out.println("Argumentos esperados: numero_de_rounds n_1 n_2 n_3 n_4 n_5");
            System.out.println("onde n_x = numero de competidores que usarao a estrategia x");
            System.exit(0);
        }
 
        Game tournament = new Game(args);
        tournament.startGame();
        tournament.printRanking();
   
    }
}
    
    
    
    