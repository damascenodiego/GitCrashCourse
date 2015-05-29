/**
 * Trab 1 - SSC0103 - Programa????????????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import java.util.ArrayList;
/*
Jogador que utiliza a estrat??????gia tipo 5( GoodMemory ):
O jogador come??????a doando 0, porem, ele possue uma boa memoria representada por um vetor de Pares,
em que ele guarda o que cad jogador doou para ele em cada rodada, e reproduz essa doa????????????o na rodada seguinte
*/
public class Strategy5_player extends Player{

	public String ID = "1371da62d1a33762ef96541d44c551f4";
	
    private ArrayList<Pair<Competitor,Double>> memory;
    private boolean isFirstRound;

    public Strategy5_player(int ID) {
        super(ID);
        isFirstRound = true;
        memory = new ArrayList<Pair<Competitor, Double>>();
    }


    @Override
    public double declareDonationTo(Competitor c) {
        if(isFirstRound) {
            isFirstRound = false;
            return 0;
        }

        for( int i = 0; i < memory.size();i++) {
            if( c == memory.get(i).getL()){
                return memory.get(i).getR();
            }
        }

        return 0;
    }


    @Override
    public String getType() {
        return " GoodMemory";
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) {

        for( int i = 0; i < memory.size(); i++) {
            // Se ele lembra daquele competidor, altera para a doa????????????o mais recente
            if( c == memory.get(i).getL()){
                memory.get(i).setR(donation);
                break;
            }
            if(i == memory.size() - 1) {
                // Se n??????o, passa a lembrar dele
                memory.add(new Pair<Competitor, Double>(c,donation));
                break;
            }
        }
    }

}