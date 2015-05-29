package id_f41a1eaa6653ca96864dfaa783d17bcc;

import java.util.Arrays;

/* TRABALHO 1 - PORGRAMA????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */

public class Torneio {
	public void adicionarParticipantes(int A, int B, int C, int D, int E, Jogador jogadores[]) {
		int i;
		//preenche o array de jogadores com o numero certo de cada tipo de estrat??gia
		for(i=0;i<A;i++)
			jogadores[i]=new JogadorA();
		for(i=A;i<A+B;i++)
			jogadores[i]=new JogadorB();
		for(i=A+B;i<A+B+C;i++)
			jogadores[i]=new JogadorC();
		for(i=A+B+C;i<A+B+C+D;i++)
			jogadores[i]=new JogadorD();
		for(i=A+B+C+D;i<A+B+C+D+E;i++)
			jogadores[i]=new JogadorE();
	}
	public void rodada(int total, Jogador jogadores[]) {
		int i, j;
		double doacao;
		for(i=0;i<total-1;i++)
			for(j=i+1;j<total;j++) {
				doacao=jogadores[i].declareDonationTo(jogadores[j]);//recebe o valor a ser doado
				jogadores[j].informDonationFrom(jogadores[i], doacao);//passa o valor doado
				jogadores[i].addCash(10-doacao);//entraga os 10 reais, j?? retirando o valor doado
				jogadores[j].addCash(2*doacao);//adiciona o valor que foi doado
				//faz a mesma coisa para o outro jogador
				doacao=jogadores[j].declareDonationTo(jogadores[i]);
				jogadores[i].informDonationFrom(jogadores[j], doacao);
				jogadores[j].addCash(10-doacao);
				jogadores[i].addCash(2*doacao);				
			}
	}
	public void imprimeRanking(int total, Jogador jogadores[]) {
		int i;
		Arrays.sort(jogadores);//faz a ordena????o do vetor de jogadores com base na quantidade de dinheiro
		for(i=total-1;i>=0;i--)
			System.out.println("Jogador "+jogadores[i].estrategia+": "+jogadores[i].totalDinheiro+"\n");//imprime os jogadores, em ordem
	}
}
