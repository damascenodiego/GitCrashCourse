package id_50d05aa2a02d88bc375bcbe98e807516;

import java.util.Scanner;

public class Display {

    private int rodadas, totaljogadores;
    private int[] jogadores;
    private Scanner S;

    //Construtor
    public Display() {
        this.S = new Scanner(System.in);
    }

    //Pergunta ao usu??rio quantas rodadas ser??o feitas.
    int perguntarodadas() {
        System.out.println("Quantas rodadas ser??o executadas?");
        rodadas = this.S.nextInt();
        return rodadas;
    }

    //Pergunta ao usu??rio quantos jogadores ser??o utilizados.
    int perguntajogadores() {
        System.out.println("Quantos jogadores ter?? o torneio?");
        totaljogadores = this.S.nextInt();
        jogadores = new int[5];
        return totaljogadores;
    }

    //Fun????o auxiliar que pergunta ao usu??rio quantos jogadores de cada estrat??gia ser??o utilizados.
    private int[] perguntaTipoJogadoresAUX() {
        System.out.println("Quantos jogadores do tipo 1?");
        jogadores[0] = this.S.nextInt();

        System.out.println("Quantos jogadores do tipo 2?");
        jogadores[1] = this.S.nextInt();

        System.out.println("Quantos jogadores do tipo 3?");
        jogadores[2] = this.S.nextInt();

        System.out.println("Quantos jogadores do tipo 4?");
        jogadores[3] = this.S.nextInt();

        System.out.println("Quantos jogadores do tipo 5?");
        jogadores[4] = this.S.nextInt();

        return jogadores;

    }

    //Fun????o utilizada para tratar o erro caso a soma das estrat??gias seja diferente do total de jogadores
    private boolean erro() {
        return (jogadores[0] + jogadores[1] + jogadores[2] + jogadores[3] + jogadores[4]) != this.totaljogadores;
    }

    //Fun????o utilizada para setar as estrat??gias de cada jogador. Caso erro seja encontrado a pergunta ?? feita novamente.
    int[] perguntaTipoJogadores() {

        do {
            jogadores = this.perguntaTipoJogadoresAUX();
        } while (this.erro());

        return jogadores;
    }
}
