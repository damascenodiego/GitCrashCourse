/**
 * Trab 1 - SSC0103 - Programa????????????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import br.usp.icmc.ssc01032015.Competitor;


/*
Jogador que utiliza a estrat??????gia tipo 1( TitForTatDoBem ):
Come??????a doando 10, e a partir dai , doa o valor doado a ele na rodada anterior
*/
public class Strategy1_player extends Player{

	public String ID = "1371da62d1a33762ef96541d44c551f4";
	
    private double WhatIReceivedLastRound;
    private boolean isFirstRound;

    public Strategy1_player(int ID) {
        super(ID);
        isFirstRound = true;
    }

    @Override
    public double declareDonationTo(Competitor c) {
        if(isFirstRound) {
            isFirstRound = false;
            return 10;
        }
        return WhatIReceivedLastRound;
    }

    @Override
    public String getType() {
        return " TitForTatDoBem";
    }
    @Override
    public void informDonationFrom(Competitor c, double donation) {
        WhatIReceivedLastRound = donation;
    }
}
