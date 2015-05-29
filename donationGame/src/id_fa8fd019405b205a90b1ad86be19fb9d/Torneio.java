package id_fa8fd019405b205a90b1ad86be19fb9d;

import java.util.Arrays;
import java.util.Collections;

public class Torneio {
	//private static final int NUMERO_DE_COMPETIDORES = 5;
	
	private ComparableCompetitor[] competidores;
	private MatchIterator mi;
	private int rodadasRestantes;
	
	public Torneio(int numeroRodadas, Class<Competitor>[] classesCompetidores, int[] numeroCompetidores, MatchIterator mi){
		this.competidores = createCompetitorArray(classesCompetidores, numeroCompetidores);
		this.mi = mi;
		rodadasRestantes = numeroRodadas;
	}
	
	private ComparableCompetitor[] createCompetitorArray(Class<Competitor>[] classesCompetidores, int[] nCompetidores) throws IllegalArgumentException{
		
		if(classesCompetidores.length != nCompetidores.length)
			throw new IllegalArgumentException("Arrays must be the same size!");
		
		int totalCompetidores = 0;
		for(int i = 0; i<nCompetidores.length; i++){
			totalCompetidores += nCompetidores[i];
		}

		ComparableCompetitor[] competidores = new ComparableCompetitor[totalCompetidores];
		
		for(int i=0; i<nCompetidores.length; i++){
			for(int j = 0; j < nCompetidores[i]; j++){
				try {
					--totalCompetidores;
					competidores[totalCompetidores] = new ComparableCompetitor((Competitor)classesCompetidores[i].newInstance(), ""+(j+1));
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		
		return competidores;
	}
	
	public boolean hasRounds(){
		return rodadasRestantes != 0;
	}
	
	public void doRound() throws GameIsOverException{
		if(!hasRounds())
			throw new GameIsOverException();
		
		Collections.shuffle(Arrays.asList(competidores));
		
		for(int i = 0; i < competidores.length; i++){
			for(int j = i + 1; j < competidores.length; j++){
				mi.doMatch(competidores[i].getCompetitor(), competidores[j].getCompetitor());
			}
		}
		
		rodadasRestantes--;
	}
	
	public void printCurrentScoreboard(){
		Arrays.sort(competidores);

		for(int i = competidores.length - 1; i >= 0; i--){
			System.out.println((competidores.length - i) + "o Lugar: " + competidores[i]);
		}
	}
	
	public static interface MatchIterator{
		public void doMatch(Competitor c1, Competitor c2);
	}
	
	public static class GameIsOverException extends Exception{};
	
	private static class ComparableCompetitor implements Comparable{
		private Competitor c;
		private String nome;
		
		public ComparableCompetitor(Competitor c, String nome){
			this.c = c;
			this.nome = nome;
		}

		public Competitor getCompetitor(){
			return c;
		}
		
		public String getNome(){
			return nome;
		}

		@Override
		public int compareTo(Object arg) {
			Double d = c.getTotalCash();
			return d.compareTo(((ComparableCompetitor) arg).getTotalCash());
		}

		public double declareDonationTo(ComparableCompetitor c) {
			return this.c.declareDonationTo(c.getCompetitor());
		}
		
		public void informDonationFrom(ComparableCompetitor c, double donation) {
			this.c.informDonationFrom(c.getCompetitor(), donation);
		}
		
		public void addCash(double amount) {
			c.addCash(amount);
		}

		public double getTotalCash() {
			return c.getTotalCash();
		}
		
		public String toString(){
			return c.getClass().getSimpleName() + " " + nome + " - " + c.getTotalCash();
		}
	}
}
