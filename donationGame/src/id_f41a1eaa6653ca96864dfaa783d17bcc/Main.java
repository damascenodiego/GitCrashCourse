package id_f41a1eaa6653ca96864dfaa783d17bcc;
 

/* TRABALHO 1 - PORGRAMA????????????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??????DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */
 
public class Main {
	public static void main(String[] arg) {
		String []args = {"10", "2", "2", "2", "2", "2"};
		int i, total, numeroRodadas, A, B, C, D, E;
		//as fun????????????es a seguir passam os parametros recebidos pelo programa para vari??????veis inteiras
		numeroRodadas=Integer.parseInt(args[0]);
		A=Integer.parseInt(args[1]);
		B=Integer.parseInt(args[2]);
		C=Integer.parseInt(args[3]);
		D=Integer.parseInt(args[4]);
		E=Integer.parseInt(args[5]);
		total=A+B+C+D+E;
		Jogador jogadores[]=new Jogador[total];//cria o array de jogadores
		Torneio torneio=new Torneio();//cria o torneio
		torneio.adicionarParticipantes(A, B, C, D, E, jogadores);
		for(i=0;i<numeroRodadas;i++)
			torneio.rodada(total, jogadores);
		torneio.imprimeRanking(total, jogadores);
	}
}
		
