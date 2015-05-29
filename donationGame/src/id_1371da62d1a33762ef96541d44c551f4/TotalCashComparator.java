/**
 * Trab 1 - SSC0103 - Programa????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import java.util.Comparator;
/*
Claase que implementa a interface Comparator para que os jogadores possam
ser ordenados pela quatidade de dinheiro que cada um possue ao fim do jogo
*/
public class TotalCashComparator implements Comparator<Player>{

    public int compare(Player p1, Player p2) {
        if (p1.getTotalCash() < p2.getTotalCash()) return 1;
        if (p1.getTotalCash() > p2.getTotalCash()) return -1;
        return 0;
    }
}
