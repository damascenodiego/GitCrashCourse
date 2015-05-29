package id_f41a1eaa6653ca96864dfaa783d17bcc;

/* TRABALHO 1 - PORGRAMA????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */
 
public class Jogador implements Competitor, Comparable<Jogador>  {
	public double totalDinheiro=0, dinheiroRecebido=0; 
	public char estrategia;

	public double declareDonationTo (Competitor c){
		return 0;
	} 

	public void informDonationFrom (Competitor c, double donation){
		this.dinheiroRecebido=donation;
	}

	public void addCash (double amount){
		this.totalDinheiro += amount;
	}

	public double getTotalCash (){
		return totalDinheiro;
	}

	public int compareTo (Jogador j){
		//fun????o utilizada para ordenar o vetor posteriormente
		if(this.totalDinheiro-j.totalDinheiro>0)
			return 1;
		else if(this.totalDinheiro-j.totalDinheiro<0)
			return -1;
		return 0;
	}
}	
