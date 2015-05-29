package id_54ef1d2792fa9d19e157ff12a9c04d8f;

import java.text.DecimalFormat;

public class Torneio {
	private int qntRodadas;
	private double valor1,valor2;
	private int numeroJogadores = 0;
	private Jogador[] lJogadores;//lista de jogadores para fazer o rank
	
	public Torneio(String[] args){
		qntRodadas =  Integer.parseInt(args[0]);
	}
	
	public void start(String[] args){
		Jogador[][] mJogadores = new Jogador[5][]; // matriz para guardar todos os objetos de jogadores
		
		/**INICIA A MATRIZ CONFORME OS DADOS PASSADOS POR PARAMETRO **/
		for (int i = 0; i < 5; i++){
			mJogadores[i] = new Jogador[Integer.parseInt(args[1+i])];
			numeroJogadores += Integer.parseInt(args[1+i]);
		}
		
		lJogadores =  new Jogador[numeroJogadores];
		/** SETA O ID DE TODOS OS JOGADORES DA MATRIZ **/
		int indice = 0;
		for(int i = 0; i < 5; i++){
			for (int j = 0; j < mJogadores[i].length; j++){
				Jogador jog = new Jogador(i);
				mJogadores[i][j] = jog;
				lJogadores[indice] = jog;
				indice++;
			}
		}
		
		/**FAZ A RODADA ACONTECER**/
		for(int rodadas = 0; rodadas< this.qntRodadas; rodadas++){
			for(int i = 0; i < 5; i++){
				for (int j = 0; j < mJogadores[i].length; j++){ // primeiro oponente
					for(int k = i; k < 5; k++){ //enfrenta todos os outros oponentes
						for (int l = j+1; l <  mJogadores[k].length; l++){
							valor1 = mJogadores[i][j].declareDonationTo(mJogadores[k][l]);
							valor2 = mJogadores[k][l].declareDonationTo(mJogadores[i][j]);
							mJogadores[i][j].informDonationFrom(mJogadores[k][l], valor2);
							mJogadores[k][l].informDonationFrom(mJogadores[i][j], valor1);
							mJogadores[i][j].addCash((10.0 - valor1)+(2 * valor2));
							mJogadores[k][l].addCash((10.0 - valor2)+(2 * valor1));
						}
					}
				}
			}
		}
		
	}
	
	public void winner(){
		ordenaVetor(lJogadores);
		for(int i = 0; i< lJogadores.length; i++){
		    DecimalFormat fmt = new DecimalFormat("0.00");   //limita o n?mero de casas decimais      
		    String saldo = fmt.format(lJogadores[i].getTotalCash());
			System.out.println("Jogador:"+ lJogadores[i].getId()+" Saldo:"+saldo);
		}
	}
	
	/**SELECTION SORT**/
	private void ordenaVetor(Jogador[] jogadores){
		for(int i = 0; i < jogadores.length; i++){ 
			for(int j = i+1; j< jogadores.length; j++){
				if(jogadores[i].getTotalCash() < jogadores[j].getTotalCash()){
					Jogador j1 = jogadores[i];
					jogadores[i] = jogadores[j];
					jogadores[j] = j1;
				}
			}
		}
	}
	
}
