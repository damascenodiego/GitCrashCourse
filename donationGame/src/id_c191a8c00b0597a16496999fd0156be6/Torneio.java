package id_c191a8c00b0597a16496999fd0156be6;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Torneio: onde a disputa entre os objetos ?? feita
 * Implementa os m??todos
 * public static ArrayList<Competitor> CreatePlayerList(int num, int type)
 * public void main(String[] void)
 * private Competitor TorneioStart(List<Competitor>, int)
 * private Player GreaterCash(List <Competitor>)
 */
public class Torneio {

    /**
     * m??todo que cria uma lista de players do tipo type de quantidade num
     * @param num tamanho da lista
     * @param type tipo do player
     * @return lista de num player
     */
    public static ArrayList<Competitor> CreatePlayersList(int num, int type) throws NullPointerException {

        if (num == 0) return null; //caso ele digitar zero, aquele player n??o joga
        ArrayList<Competitor> playersList = null;

        // vemos o tipo de player e criamoos um arraylist de tamanho
        switch(type) {
            case '1': // players tipo 1
                for (int i = 0; i < num; i++)
                    playersList.add(new Player1());
                break;
            case '2':
                for (int i = 0; i < num; i++)
                    playersList.add(new Player2());

                break;
            case '3':
                for (int i = 0; i < num; i++)
                    playersList.add(new Player3());

                break;
            case '4':
                for (int i = 0; i < num; i++)
                    playersList.add(new Player4());

                break;
            case '5':
                for (int i = 0; i < num; i++)
                    playersList.add(new Player5());

                break;
            default:
                break;
        }
        return playersList;
    }


    /**
     * Fun????o main
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {

        int rounds;
        int nplayers1;
        int nplayers2;
        int nplayers3;
        int nplayers4;
        int nplayers5;
        int totalPlayers;

        // preparamos o input
        Scanner in = new Scanner(System.in);

        //pegamos o round
        System.out.println("Digite a quantidade de rounds: ");
        do {
            rounds = in.nextInt();
        } while (rounds == 0);

        //
        // apartir daqui pegamos a quantidade de players de cada tipo
        //
        System.out.println("Digite a quantidade de player tipo #1: ");
        do {
            nplayers1 = in.nextInt();
        } while(nplayers1 < 0);

        System.out.println("Digite a quantidade de player tipo #2: ");
        do {
            nplayers2 = in.nextInt();
        } while(nplayers2 < 0);

        System.out.println("Digite a quantidade de player tipo #3: ");
        do {
            nplayers3 = in.nextInt();
        } while(nplayers3 < 0);

        System.out.println("Digite a quantidade de player tipo #4: ");
        do {
            nplayers4 = in.nextInt();
        } while(nplayers4 < 0);

        System.out.println("Digite a quantidade de player tipo #5: ");
        do {
            nplayers5 = in.nextInt();
        } while(nplayers5 < 0);
        System.out.println("Deseja que seja verboso(mostre mensagems de doa????es, entre outras) ?(Sim/N??o)");
        String flag = in.next();

        if (flag.toLowerCase().equals("sim")) {
            Player.DEBUG = true;
        }

        /**
         * criamos a lista de objetos
         */
        List<Competitor> playersList  = new ArrayList<Competitor>();
        try {
            for(int i = 0; i < nplayers1; i++)
                playersList.add(new Player1());
            for(int i = 0; i < nplayers2; i++)
                playersList.add(new Player2());
            for(int i = 0; i < nplayers3; i++)
                playersList.add(new Player3());
            for(int i = 0; i < nplayers4; i++)
                playersList.add(new Player4());
            for(int i = 0; i < nplayers5; i++)
                playersList.add(new Player5());
        } catch(NullPointerException e) {
            System.out.println("[ERROR] na aloca????o de jogadores, [DESC ERROR]:" + e.getLocalizedMessage());
        }

        /**
         * decidimos qual player foi o vencedor e retornamos seu hist??rico
         */
        Player winner = (Player)TorneioStart(playersList, rounds);

        System.out.println("Vencedor: " + winner.getClass().getSimpleName() + " com montante: " + winner.getTotalCash() + " .Deseja ver o hist??rico do campe??o (Sim/N??o)?: ");
        String c = in.next();
        if (c.toLowerCase().equals("sim")) {
            winner.printfHistoricListGived();
            winner.printfHistoricListReceived();
        }
        System.out.println("Deseja ver o ranking da partida? (Sim/N??o)?: ");
        c = in.next();
        if (c.toLowerCase().equals("sim")) {
            printListTotalCash(playersList);
        }
    }

    /**
     * Fun??a?? que inicia o torneio, ela vai pegar uma subclasse do objeto Competitor e competir com todas as outras
     * em n rounds
     * @param listCompetitor lista de objetos do tipo Competidor/Player
     * @param rounds quantidade de rounds
     * @return Competitor vencedor
     */
    private static Competitor TorneioStart(List<Competitor> listCompetitor, int rounds) {

        for(int i = 0; i < rounds; i++) { // loop dos rounds
            for(Competitor compTurn : listCompetitor) { // loops do players 'principal'

                // pegamos uma slice pra frente do player 'principal'
                List<Competitor> subListCompetitor = listCompetitor.subList(
                        listCompetitor.indexOf(compTurn),
                        listCompetitor.size()
                );

                for(Competitor comp: subListCompetitor) { // player 'principal' contra todos
                    if (comp == compTurn) continue; // comparo referencias para evitar jogador jogando com ele mesmo
                    if (Player.DEBUG)
                        System.out.println(
                            "Round #" + i + " de " + rounds + " Tipo: " + compTurn.getClass().getSimpleName()  +
                            " contra " +  comp.getClass().getSimpleName()
                        );
                    /*
                    Come??o as doa????es
                     */
                    double doacaoComp = comp.declareDonationTo(compTurn);
                    double doacaoCompTurn = compTurn.declareDonationTo(comp);
                    // verifico se uma das estrat??gias deu erro
                    if (doacaoComp > 10 || doacaoCompTurn > 10 || doacaoComp < 0 || doacaoCompTurn < 0) {
                        System.out.println("*****************************[ERRO] foi feita uma doa????o acima de 10");
                        System.exit(-1);
                    }
                    //o jogador recebe ((10 - a doa??a?? dele) + (duas vezes a doa??a?? do rival)
                    comp.informDonationFrom(compTurn, 10 - doacaoComp + (doacaoCompTurn*2));
                    compTurn.informDonationFrom(comp, 10 - doacaoCompTurn + (doacaoComp*2));
                } // fim do turno do rival
            } // fim do turno do 'principal'
        } // fim dos rounds

        return GreaterCash(listCompetitor);
    }

    /**
     * Fun????o que procura o maior montante numa lista de Competitor
     * @param listCompetitor lista de Competitor/Player
     * @return Player (subclasse de Competitor) com o maior montante
     */
    private static Player GreaterCash(List<Competitor> listCompetitor) {

        double cash = -100000.0;
        Player winner = null;
        for(Competitor c : listCompetitor) {
            if (c.getTotalCash() > cash ) {
                cash = c.getTotalCash();
                winner = (Player)c;
            }
        }
        sortCompetitorByCash(listCompetitor);

        return winner;
    }

    /**
     * Ordena a lista de competidores em ordem decrecente
     * @param listCompetitor lista de competidores do tipo Competitor/Player
     */
    private static void sortCompetitorByCash(List<Competitor> listCompetitor) {
       Collections.sort(listCompetitor, new playerComparatorCash());
    }

    /**
     * Imprime uma lista de competidores
     * @param listCompetitor
     */
    public static void printListTotalCash(List<Competitor> listCompetitor) {

        sortCompetitorByCash(listCompetitor);

        System.out.println("Montates dos Players: ");
        for (Competitor c : listCompetitor) {
            System.out.println(c.getClass().getSimpleName() + " de ref:" + c.toString() + " montante " + c.getTotalCash());
        }
    }

}











