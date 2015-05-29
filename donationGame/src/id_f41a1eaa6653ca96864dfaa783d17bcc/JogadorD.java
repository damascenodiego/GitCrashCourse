package id_f41a1eaa6653ca96864dfaa783d17bcc;
 
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

/* TRABALHO 1 - PORGRAMA????O ORIENTADA A OBJETOS - PROFESSOR ADENILSO
 * C??DIGO CRIADO POR:
 * FELIPE KAZUYOSHI TAKARA, 8921026
 * LEONARDO MELLIN MOREIRA FERREIRA, 7982767
 */
 
public class JogadorD extends Jogador {
	public JogadorD(){
		this.estrategia = 'D'; /*Jogador 8 ou 80. Dependendo do seu humor ou doa o m??ximo ou n??o doa nada.*/
	}

	@Override 
	public double declareDonationTo (Competitor c){
		Random rand = new Random();
		int humor=rand.nextInt(2);
		if(humor == 0){
			return 0;
		}
		return 10;
	}

}
