
package id_30b6dcd03224af8e51e052f6ba08a21e;

public class Torneio {     
	Competitor [] Jogadores;
	private int totalJogadores = 0;
	public final static double valorBanca = 10;
    
    public Torneio(int totalJogadores, int [] numJogadores, int rodadas){
    	//aloca a quantidade total de jogadores
        Jogadores = new Competitor[totalJogadores];
        this.totalJogadores = totalJogadores;
        int counter = 1;
        
        //para cada tipo de jogadores participantes construir seu objeto em qtd. dado
        for (int i = 0; i < numJogadores[0]; i++, counter++)
        	this.Jogadores[counter - 1] = new Jogador1();
        
        for (int i = 0; i < numJogadores[1]; i++, counter++)
        	this.Jogadores[counter - 1] = new Jogador2();
        
        for (int i = 0; i < numJogadores[2]; i++, counter++)
        	this.Jogadores[counter - 1] = new Jogador3();
       
        for (int i = 0; i < numJogadores[3]; i++, counter++)
        	this.Jogadores[counter - 1] = new Jogador4();
        
        for (int i = 0; i < numJogadores[4]; i++, counter++)
        	this.Jogadores[counter - 1] = new Jogador5();
    }//Torneio constructor
         
    public int getTotalJogadores (){
    	return this.totalJogadores;
    }
    
    public Competitor[] getJogadores (){
    	return this.Jogadores.clone();
    }//getJogadores
    
    public void rodada (int totalJogadores){
    	for(int i = 0; i < totalJogadores; i++){
    		for(int j = i+1; j < totalJogadores; j++){
    			//doa????o
    			double donationC1 = Jogadores[i].declareDonationTo(Jogadores[j]);
    			double donationC2 = Jogadores[j].declareDonationTo(Jogadores[i]);
    			
    			//arredondamento de doa????o para formato 0.0
    			donationC1 = (double) Math.round(donationC1 * 10.0)/10.0;
    			donationC2 = (double) Math.round(donationC2 * 10.0)/10.0;
    		
    			//recebimento
    			Jogadores[i].addCash(2*donationC2 + (valorBanca - donationC1));
    			Jogadores[j].addCash(2*donationC1 + (valorBanca - donationC2));
    			
    			//guardar hist??rico
    			Jogadores[i].informDonationFrom(Jogadores[j], donationC2);
    			Jogadores[j].informDonationFrom(Jogadores[i], donationC1);
    		}//for j
    	}//for i
    }//rodada
/*
    public void printHistorico(){
    	for(int i = 0; i < Jogadores.length; i++)
    		Jogadores[i].printHistorico();
    }
*/
    
}//Torneio class
