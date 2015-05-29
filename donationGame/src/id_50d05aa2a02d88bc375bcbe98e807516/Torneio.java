package id_50d05aa2a02d88bc375bcbe98e807516;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Torneio {

    private final int rodadas, totalJogadores;
    private int auxjogadores;
    private final int[] jogadores; // Armazena quantos jogadores de cada tipo ser??o utilizados
    private List<Jogador> Competidores; // Lista de Jogadores
    private Display display; // Respons??vel por receber a entrada do teclado

    //Respons??vel por inicializar as vari??veis da classe. Algumas delas ser??o feitas por entradas do usu??rio, com o auxilio
    //da class display. Ap??s os dados serem coletados todos os jogadores s??o inicializados e colocados em uma fila.
    
    public Torneio() {

        this.auxjogadores = 0;

        this.display = new Display();

        this.rodadas = display.perguntarodadas();

        this.totalJogadores = display.perguntajogadores();

        this.jogadores = display.perguntaTipoJogadores();

        this.Competidores = new ArrayList<>();

        this.criaJogadores(jogadores);
    }

    // Fun????o Auxiliar respons??vel por criar os jogadores de cada tipo de estrat??gia
    private void criaJogadores(int[] jogadores) {

        for (int i = 0; i < this.jogadores[0]; i++) {
            Competidores.add(new Jogador1());
        }

        for (int i = 0; i < this.jogadores[1]; i++) {
            Competidores.add(new Jogador2());
        }

        for (int i = 0; i < this.jogadores[2]; i++) {
            Competidores.add(new Jogador3());
        }

        for (int i = 0; i < this.jogadores[3]; i++) {
            Competidores.add(new Jogador4());
        }

        for (int i = 0; i < this.jogadores[4]; i++) {
            Competidores.add(new Jogador5());
        }
    }

     //Fun????o que simula o torneio e ao final printa o resultado. O primeiro FOR ?? respons??vel por dizer quantas
    //rodadas ser??o feitas.
    void simula() {
        for (int i = 0; i < this.rodadas; i++) {
            for (int j = 0; j < this.totalJogadores - 1; j++) {
                this.simulaRodadaJogador(j);
            }
        }

        this.resultado();
    }

    //Fun????o auxiliar de simulacao do torneio. Passado determinado jogador, ele far?? um embate contra todos que
    //estiverem a abaixo dele. Jogador 2 enfrenteria 3,4 e 5. Jogador 3 enfrentaria 4 e 5 e assim por diante.
    private void simulaRodadaJogador(int j) {
        for (int i = j + 1; i < this.totalJogadores; i++) {
            this.Competidores.get(j).addCash(2 * this.Competidores.get(i).declareDonationTo(null));
            this.Competidores.get(i).addCash(2 * this.Competidores.get(j).declareDonationTo(null));
        }
    }

    //Ap??s ordenar todos os jogadores por ordem decrescente pelo valor de Cash, esta fun????o printa o resultado na tela
    //especificando o tipo da estrat??gia e o valor total arrecadado.
    private void resultado() {
        Collections.sort(this.Competidores);

        for (int i = 0; i < this.totalJogadores; i++) {
            System.out.println((i + 1) + "- Tipo " + this.Competidores.get(i).getTipo() + " = " + this.Competidores.get(i).getTotalCash());
        }

    }
}
