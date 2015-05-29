/**
 * Trab 1 - SSC0103 - Programa????????????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

/*
Jogador que utiliza a estrat??????gia tipo 3( random ):
Ira doar um valor randomico entre 0 e 10 reais sempre
*/
public class Strategy3_player extends Player{

	public String ID = "1371da62d1a33762ef96541d44c551f4";
    private Random randomGenerator = new Random();

    public Strategy3_player(int ID) {
        super(ID);
    }

    @Override
    public double declareDonationTo(Competitor c) {
        int randomInt = randomGenerator.nextInt(11);
        return randomInt;
    }

    @Override
    public String getType() {
        return " Random";
    }
}