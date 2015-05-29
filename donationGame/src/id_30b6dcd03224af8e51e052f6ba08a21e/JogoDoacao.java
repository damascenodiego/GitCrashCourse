/*
 * NOME:
 * N??????USP:
 * 
 * NOME: Saulo Tadashi Iguei
 * N??????USP: 7573548
 */
package id_30b6dcd03224af8e51e052f6ba08a21e;

public class JogoDoacao {
	public static Competitor[] classificar (Competitor[] Jogadores) {
		//bubble sort
		for (int i = 0; i < Jogadores.length; i++){
			for (int j = Jogadores.length - 1; j > i; j--){
				if(Jogadores[j].getTotalCash() < Jogadores[j-1].getTotalCash()){
					Competitor aux = Jogadores[j];
					Jogadores[j] = Jogadores[j - 1];
					Jogadores[j - 1] = aux;
				}
				
			}//for j
		}//for i
		return Jogadores;
	}//classificar
	
    public static void main(String[] args){
		//na linha de chamada do programa ser?????? dada o n??????mero de rodadas e n??????mero de cada tipo de jogadores (para cada os 5)
		int rodadas = 0;
		try {
			rodadas = Integer.parseInt(args[0]); //args ?????? string e rodadas ?????? int
		}catch (ArrayIndexOutOfBoundsException e){
			System.err.println("argument must be entered");
			System.exit(1);
		}
		
		if(args.length != 6){
			System.err.println("argument must be entered as: 3 2 5 1 4 5 (6 number is required)");
			System.exit(1);
		}
		
		int[] numJogadores = new int[5];
		int totalJogadores = 0;
	
		//a descri????????????o do trabalho diz que ser?????? dada 6 entradas
		if(args.length < 6)
			return;
	
		int i;
		//calculo de total de jogadores
		for(i = 0; i < 5; i++){
			numJogadores[i] = Integer.parseInt(args[i+1]);
			totalJogadores += numJogadores [i];
		}//for
	
		//chamadas para cada rodada declarada
		Torneio T = new Torneio (totalJogadores, numJogadores, rodadas);
		for (i = 0; i < rodadas; i++)
			T.rodada (totalJogadores);
	    
	    //fun????????????o est??????tica para ordena????????????o do vetor de jogadores em fun????????????o dos ganho
		//ordena????????????o em forma crescente
	    Competitor[] Jogadores = classificar (T.getJogadores());
	    
	    //impress??????o da classifica????????????o
	    //impress??????o inversa, pois o vetor ?????? crescente
	    System.out.println("Classifica????????????o geral:");
	    for(i = totalJogadores - 1; i >= 0; i--){
	    	System.out.printf("%d??????: R$%.1f\t%s\n",(totalJogadores - i), Jogadores[i].getTotalCash(),
	    			 Jogadores[i]);
	    }//for
	    
	    //T.printHistorico();
    }//main
}
