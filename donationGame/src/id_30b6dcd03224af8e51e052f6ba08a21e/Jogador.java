package id_30b6dcd03224af8e51e052f6ba08a21e;

import java.util.Arrays;

public abstract class Jogador {
	/*
	 * Esta classe ?? a classe-base para os Jogadores1~5.
	 * As ??nicas fun????es particulares aos jogadores s??o declareDonationTo(), toString(), e o contrutor
	 */
	
    private double valorAtual = 0;
    private historico[][] hist = null;
    
    public Jogador () {
    	this.hist = new historico[1][];
    }

	//fun????o a ser implementada pelas estrat??gias
	public abstract double declareDonationTo(Competitor c);
	
	private int findCompetitor (Competitor c) {
		int i = 0;
		try{	
			for (; i < this.hist.length; i++) {
				//ao encontrar o competidor ent??o mais uma coluna deve ser alocado para ele
				if (this.hist[i][0].getFrom() == c) {
					this.hist[i] = (historico []) Arrays.copyOf(this.hist[i], this.hist[i].length + 1);
					this.hist[i][this.hist[i].length - 1] = new historico();
					return i;
				}//if
			}//for
			
		//caso este throws ?? lan??ada, ent??o esta ?? a primeira execu????o (construtor: this.hist = new historico[1][])
		}catch(NullPointerException e){
			this.hist[i] = new historico[1];
			this.hist[i][0] = new historico();
			return i;//ZERO
		}//catch
		
		//se n??o encontrou o elemento no vetor, ent??o este competidor ?? novo
		this.hist = (historico[][]) Arrays.copyOf(this.hist, this.hist.length + 1);
		this.hist[this.hist.length - 1] = new historico[1];
		this.hist[this.hist.length - 1][0] = new historico();
		return this.hist.length - 1; //Ultima linha da matriz
	}//findCompetitor
	
    public void informDonationFrom(Competitor c, double donation) {
    	int aux = findCompetitor (c);
    	this.hist[aux][this.hist[aux].length - 1].setFrom (c);
    	this.hist[aux][this.hist[aux].length - 1].setReceive(donation);
    }//informDonationFrom
    
    public void addCash(double amount) {
        this.valorAtual += amount;
    }
    
    public double getTotalCash() {//se flag=0 ?? a primeira rodada, se flag=1 ja sao outras
        return this.valorAtual;
    }
    
/* Fun????o que verifica o hist??rico completo do jogador  (criar na interface Competitor a fun????o para esta chamada, ou usar poli/heran??a)  
    public void printHistorico(){
    	for(int i = 0; i < this.hist.length; i++){
    		for(int j = 0; j < this.hist[i].length; j++){
    			System.out.print(this.hist[i][j].getFrom() + " " + this.hist[i][j].getReceive() + "// ");
    		}System.out.println("");
    	}
    }
*/
}//Jogador
