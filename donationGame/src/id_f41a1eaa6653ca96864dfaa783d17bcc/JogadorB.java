package id_f41a1eaa6653ca96864dfaa783d17bcc;

import br.usp.icmc.ssc01032015.Competitor;

/* TRABALHO 1 - PORGRAMA????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */
 
public class JogadorB extends Jogador {
	public JogadorB(){
		this.estrategia = 'B'; /*N??o doa nenhum centavo.*/
	}

	@Override 
	public double declareDonationTo (Competitor c){
		return 0;
	}

}
