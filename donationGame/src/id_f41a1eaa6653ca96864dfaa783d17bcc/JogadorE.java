package id_f41a1eaa6653ca96864dfaa783d17bcc;

/* TRABALHO 1 - PORGRAMA????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */
 
public class JogadorE extends Jogador {
	public JogadorE(){
		this.estrategia = 'E'; /*Onde a vaca vai a outra vai atr??s. Doa o tanto que recebe.*/
	}

	@Override 
	public double declareDonationTo (Competitor c){
		return dinheiroRecebido;
	}

}
