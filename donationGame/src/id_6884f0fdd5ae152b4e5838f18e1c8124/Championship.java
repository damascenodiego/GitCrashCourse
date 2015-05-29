
package id_6884f0fdd5ae152b4e5838f18e1c8124;

public interface Championship {
	//indica se ainda ha rodadas ou se o torneio deve acabar
	boolean roundsLeft();
	//prepara a proxima rodada (embaralha a lista de competidores e decrementa o numero de rodadas restantes)
	void prepareRound();
	//organiza os competidores e imprime a classificacao final
	void printFinalChart();
	//recalcula o total da doacao que deve ser recebido pelo outro jogador
	 double recalculateDonation(double donation);
	 //prepara um encontro entre dois jogadores
	 void prepareMatchUp(MainCompetitor a, MainCompetitor b);
	 //retorna a quantidade de jogadores no jogo
	 int getCompetitors();
}