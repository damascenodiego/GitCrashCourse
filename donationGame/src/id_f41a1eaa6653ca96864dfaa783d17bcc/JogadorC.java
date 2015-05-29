package id_f41a1eaa6653ca96864dfaa783d17bcc;

import br.usp.icmc.ssc01032015.Competitor;

/* TRABALHO 1 - PORGRAMA????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */
 
public class JogadorC extends Jogador {
	public JogadorC(){
		this.estrategia = 'C'; 
		/*Do Contra. Se recebe muito doa metade do que recebeu e se recebeu pouco
		  doa o dobro.*/

	}

	@Override 
	public double declareDonationTo (Competitor c){
		if(this.dinheiroRecebido <= 5)
			return this.dinheiroRecebido*2;
		return this.dinheiroRecebido/2;
	}
}
