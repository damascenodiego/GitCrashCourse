package id_a55503a13323afae84ea77e3c49b077b;

import java.util.ArrayList;

public class Tournament {
	int rounds;
	ArrayList<Player> competitors= new ArrayList<Player>();

	public Tournament(int rounds, int[] vetor) {
		this.rounds = rounds;
		createCompetitors t = new createCompetitors();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<vetor[i]; j++) {
				competitors.add(t.create(i));
			}	
		}
	}
	
	public void startGame() {
		//double v1, v2, amount;
		Round round = new Round();
		
		while(rounds > 0) {
			round.round(competitors); 
			rounds--;
		}
	}
	
	public void results() {
		double total;
		
		for(int i=0; i<competitors.size(); i++) {
			total = competitors.get(i).getTotalCash();
			System.out.printf("Strategy %d: %f\n", competitors.get(i).strategy, total);
		}
		
	}
	
}
