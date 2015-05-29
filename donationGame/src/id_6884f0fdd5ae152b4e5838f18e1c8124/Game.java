package id_6884f0fdd5ae152b4e5838f18e1c8124;

public class Game {
	public static void main(String [] arg) {
		String[] args = {"10","10","10","10","10","10"};
		System.out.println("Digite a quantidade de rodadas, e de jogadores tipo Keijo, Dog, Mineiro, Jorg???o e Murilol, respectivamente.");
		ChampionshipOrganizer championship = new ChampionshipOrganizer(args[0], args[1], args[2], args[3], args[4], args[5]);
		int i, j;
		double FirstDonation;
		double SecondDonation;
			
			//enquanto houver rodadas
			while(championship.roundsLeft()){
				
				championship.prepareRound();
				
				//cada jogador joga com todos os outros em cada rodada
				i = 0;
				for(MainCompetitor player1 : championship.list){
					j = 0;
					for(MainCompetitor player2 : championship.list){
						if(j > i){
							championship.prepareMatchUp(player1, player2);
							
							FirstDonation = player1.declareDonationTo(player2);
							SecondDonation = player2.declareDonationTo(player1);
							
							//adiciona o dobro do que foi doado para cada jogador
							player1.addCash(championship.recalculateDonation(SecondDonation));
							player2.addCash(championship.recalculateDonation(FirstDonation));
							
							//no final do encontro, informa aos dois jogadores de quem e quanto foi doado
							player1.informDonationFrom(player2, SecondDonation);
							player2.informDonationFrom(player1, FirstDonation);
						}
						j++;
					}
					i++;
				}
			}
			
			championship.printFinalChart();
	}
}