/**
 * Trab 1 - SSC0103 - Programa????????????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import br.usp.icmc.ssc01032015.Competitor;


/*
Jogador que utiliza a estrat??????gia tipo 2( greedy ):
Nunca ira doar algo, ou seja, sempre doar?????? 0 reais.
*/
public class Strategy2_player extends Player{

	public String ID = "1371da62d1a33762ef96541d44c551f4";
	
    public Strategy2_player(int ID) {
        super(ID);
    }
    
    public Strategy2_player() {
		this(0);
	}

    @Override
    public double declareDonationTo(Competitor c) {
        return 0;
    }


    @Override
    public String getType() {
        return " Greedy";
    }
}