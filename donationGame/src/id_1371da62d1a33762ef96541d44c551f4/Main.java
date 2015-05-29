/**
 * Trab 1 - SSC0103 - Programa????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /* M??todo auxiliar que testa se um n??mero ?? negativo. Lan??a uma exce????o se for */
    public static int checkForLessThanZero(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException(number);
        }
        else {
            return number;
        }
    }
    public static void main ( String []args ) {

        Scanner sc = new Scanner(System.in);
        /* Vetor que recebe as entradas onde:
        input[0] = numero de rodadas
        input[1] = quatidade de jogadores estrategia 1
        input[2] = quantidade de jogadores estrategia 2
                    .
                    .
        input[5] = quantidade de jogadores estrategia 5 */
        int input[] = new int[6];

        /* loop para receber as entradas.
        Recebe os 6 numeros digitados pelo usuario(um de cada vez) e se algum for negativo, uma exce????o ?? lan??ada e ?? pedido que se digite
        o numero novamente, at?? que todos os n??meros forem digitados corretamente */
        int cont = 0;
        do {
            try {
                input[cont] = checkForLessThanZero(sc.nextInt());
            } catch (NegativeNumberException e) {
                System.out.println("Type a positive integer");
                cont--;
            }
            cont++;
        } while (cont < 6) ;

        /*
        Adiciona competidores em um grande arraylist
        Primeiro os da estrategia 1, depois os da estrategia 2 em ordem ate os da estrategia 5
        O construtor recebe como parametros o ID do participante
        */
        ArrayList<Player> Players = new ArrayList<Player>();

        for( int i = 0; i < input[1]; i ++) {

            Players.add(new Strategy1_player(i));
        }
        for(int i = 0; i < input[2] ; i ++) {

            Players.add(new Strategy2_player(i + input[1]));
        }

        for( int i = 0; i < input[3]; i ++) {

            Players.add(new Strategy3_player(i + input[2] + input[1]) );
        }

        for( int i = 0; i < input[4]; i ++) {

            Players.add(new Strategy4_player(i + input[3] + input[2] + input[1]));
        }
        for( int i = 0; i < input[5]; i ++) {
            Players.add(new Strategy5_player(i + input[4] + input[3] + input[2] + input[1]));
        }
        // Inicia o torneio
        Tournament t = new Tournament();
        t.PlayTournament(Players,input[0]);
        // Mostra as classifica????es
        t.Classification(Players);
    }
}
