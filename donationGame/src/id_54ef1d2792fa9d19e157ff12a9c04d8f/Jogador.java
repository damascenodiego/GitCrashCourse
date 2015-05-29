package id_54ef1d2792fa9d19e157ff12a9c04d8f;

import java.util.LinkedList;
import java.util.Random;

public class Jogador implements Competitor{
	private int id;
	private double fundos = 0;
	private LinkedList<Doacao> log = new LinkedList<Doacao>();
	
	
	public Jogador(int id){
		this.id = id;
	}
	@Override
	public double declareDonationTo(Competitor c) {
		//metodos de cada jogador para doa??o. 5 jogadores, cada um com uma estrat?gia
		Jogador rec = (Jogador) c;
		switch(this.id){
			case 0: return 10; //jogador gente boa
			case 1: //devolve a m?dia do doado
				double soma = 0,rodadas = 0;
				for(Doacao d : log){
					if(d.jog.getId() == rec.getId()){
						soma += d.quantidade;
						rodadas++;
					}
				}
				if(rodadas == 0)
					return 0;
				else
					return soma/rodadas;
			case 2: 
				Random r = new Random();
				double nRandomico = r.nextDouble() * 10;
				return nRandomico;
			case 3: 
				double doado = 0;
				for(Doacao d : log){
					if(d.jog.getId() == rec.getId()){
						if(d.quantidade > doado)
							doado = d.quantidade;
					}
				}
				return 10 - doado;
				
			case 4: return 0; //jogador p?o duro
		}
		return 0;
	}

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		Doacao d = new Doacao();
		d.jog = (Jogador) c;
		d.quantidade = donation;
		this.log.add(d);
	}

	@Override
	public void addCash(double amount) {
		this.fundos += amount;
	}

	@Override
	public double getTotalCash() {
		return fundos;
	}
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public LinkedList<Doacao> getLog(){
		return this.log;
	}
	
}
