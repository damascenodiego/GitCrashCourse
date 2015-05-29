/**
 * Trab 1 - SSC0103 - Programa????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import java.util.ArrayList;
import java.util.Collections;

public class Tournament {
    /**
     *
     * @param Players vetor de jogadores
     * @param iterations_number numero de itera????es
     *
     */
    public void PlayTournament(ArrayList<Player> Players, int iterations_number) {
        // Este ?? o loop do jogo em si
        for(int i = 0; i < iterations_number; i ++) {

            for(int j = 0; j < Players.size(); j ++) {
                // Escolhe o primeiro jogador
                Player p = Players.get(j);

                for(int k = j+1; k < Players.size(); k ++) {
                    // O escolhido joga com todos os outros jogadores
                    Player p2 = Players.get(k);

                    // Cada jogador declara o quanto ira doar
                    double amountDonatedFromP = p.declareDonationTo(p2);
                    double amountDonatedFromP2 = p2.declareDonationTo(p);
                    // Cada jogador ?? informado da doa????o do outro
                    p.informDonationFrom(p2, amountDonatedFromP2);
                    p2.informDonationFrom(p, amountDonatedFromP);
                    //Recebem o dinheiro de acordo com as especifica??oes
                    p.addCash(10 - amountDonatedFromP + 2*(amountDonatedFromP2));
                    p2.addCash(10 - amountDonatedFromP2 + 2*(amountDonatedFromP));

                }
            }
        }
    }

    /**
     *
     * @param Players vetor de jogadores
     * Imprime as pontua????es fianis dos jogadores do maior para o menor, assim como
     *                  suas estrategias e seus indices
     */
    public void Classification(ArrayList<Player> Players) {

        Collections.sort(Players, new TotalCashComparator());

        System.out.println("Classificacao final:");
        // Cada jogador imprime as proprias informa????es
        for( Player p : Players) {
            System.out.print("Jogador ");
            p.printInfo();
            System.out.println("\n");
        }
    }
}
