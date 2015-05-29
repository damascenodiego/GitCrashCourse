package id_6884f0fdd5ae152b4e5838f18e1c8124;

import java.util.Collections;
import java.util.LinkedList;

public class ChampionshipOrganizer implements Championship {
		private int rounds;
		LinkedList<MainCompetitor> list;
		
		//guarda a quantidade de cada tipo de jogador
		private int keijo, mineiro, jorgao, dog, murilol;
		
		//coloca os jogadores dentro da lista de competidores
		ChampionshipOrganizer(String rounds, String keijoStr, String dogStr, String mineiroStr, String jorgaoStr, String murilolStr) {
			int i;
			
			this.rounds = Integer.valueOf(rounds);
			list = new LinkedList<MainCompetitor>();
			
			//quantidade de cada tipo de jogador
			keijo = Integer.valueOf(keijoStr);
			mineiro = Integer.valueOf(mineiroStr);
			jorgao= Integer.valueOf(jorgaoStr);
			dog = Integer.valueOf(dogStr);
			murilol = Integer.valueOf(murilolStr);
			
			for(i = 0; i < keijo; i++)
				list.add(new Keijo(i));
			for(i = 0; i < mineiro; i++)
				list.add(new Mineiro(i));
			for(i = 0; i < jorgao; i++)
				list.add(new Jorgao(i));
			for(i = 0; i < dog; i++)
				list.add(new Dog(i));
			for(i = 0; i < murilol; i++)
				list.add(new Murilol(i));
		}	
		
		public int getCompetitors(){
			return list.size();
		}
		
		public boolean roundsLeft(){
			return (rounds > 0) ? true : false;
		}

		public void prepareRound(){		
			rounds--;
			Collections.shuffle(list);
		}
		
		public void prepareMatchUp(MainCompetitor a, MainCompetitor b){
			a.addCash(10);
			b.addCash(10);
		}

		public double recalculateDonation(double donation){
			return (donation * 2);
		}
		
		public void printFinalChart(){
			int i = 0;
			
			Collections.sort(list);
			
			for(MainCompetitor c : list){
				System.out.print(i + 1 + " " + c.getTotalCash() + " ");
				System.out.println(c);
				i++;
			}
		}
}