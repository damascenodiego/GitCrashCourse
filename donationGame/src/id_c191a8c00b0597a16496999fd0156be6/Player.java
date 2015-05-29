
package id_c191a8c00b0597a16496999fd0156be6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;



public class Player implements  Competitor {

    public static boolean DEBUG = false;
    //atributos
    protected double totalCash; // montante
    protected double donationLastTurn; // ultima doa????o
    protected double donationReceived; // ultima doa????o recebida
    protected List<Double> historicListReceived = new ArrayList<Double>(); // historico de doa????es recebidas
    protected List<Double> historicListGived = new ArrayList<Double>(); //historido de doa????es dadas
    protected static int numberOfPlayers; // numeros de objetos instanciados
    public int id; // id do player


    /**
     * Construtor
     * seta o montante inicial para 10, cria uma lista para o hist??rico de doa????es
     * e d?? o objeto um ID ??nico
     */
    public Player() {
        double totalCash = 0;
        id = ++numberOfPlayers;
        historicListReceived.add(0.0);
    }


    /**
     * Getter
     * retorna o montante total do jogador
     *
     * @return totalCash: total do montante
     */
    public double getTotalCash() {
        return totalCash;
    }

    /**
     * Getter
     *
     * @return retorna o id do objeto
     */
    public int returnId() {
        return this.id;
    }


    /**
     * Adiciona o valor doado pelo outro player/competidor
     * guarda o valor da ultima doa??a?? recebida e adiciona ela no hist??rico (lista)
     *
     * @param amount valor doado pelo outro competidor (j?? duplicado)
     */
    //add the amounts of cash
    public void addCash(double amount) {
        totalCash += amount;
        donationReceived = amount;
        historicListReceived.add(amount);
    }

    // indicates how much was donate from Competitor c

    /**
     * Informa ao competidor quanto o rival doou
     *
     * @param c        competidor que doou
     * @param donation valor doado
     */
    public void informDonationFrom(Competitor c, double donation) {
        addCash(donation);
        donationReceived = donation;
        historicListReceived.add(donation);
//        if (DEBUG) {
//            System.out.println("***DEBUG:adicionando " + donation + " ao montante de " + totalCash + " ultima doada: " + donationLastTurn +
//                    " ultima recebida: " + donationReceived);
//        }
    }

    /**
     * Declara uma doa????o para o competidor c (chama o m??todo informDonationFrom para avisar o outro Competidor do
     * valoR da doa????o)
     *
     * @param c competidor que ir?? receber a doa????o
     * @return retorna o valor da doa??ao
     */
    public double declareDonationTo(Competitor c) {
        return 0.0;
    }

    /**
     * Imprime o hist??rico(lista) de doa????es recebidas
     */
    public void printfHistoricListReceived() {
        System.out.println("Hist??rico de doa????es Recebidas: ");
        for (int i = 0; i < historicListReceived.size(); i++) {
            System.out.format("Doa????o [%d] R$:%f recebida%n", i, historicListReceived.get(i));
        }
    }

    /**
     * Imprime o hist??rico(lista) de doa????es ganhas
     */
    public void printfHistoricListGived() {
        System.out.println("Hist??rico de doa????es doadas: ");
        for (int i = 0; i < historicListGived.size(); i++) {
            System.out.format("Doa????o [%d] R$:%f doada%n", i, historicListGived.get(i));
        }
    }

    /**
     * Adiciona uma doa????o a lista de doa????es ganhas
     * @param donationGived doa????o ganha
     */
    public void addHistoricListGived(double donationGived) {
        historicListGived.add(donationGived);
    }
}


/**
 * Subclasse de Player
 */
    class Player1 extends Player {

    /**
     * T??tica 1: o limite da minha doa????o sempre vai ser entre a subtra????o do que eu recebi e o que eu doei
     * tendo o limite superior a raiz da doa????o recebida
     */
        public double declareDonationTo(Competitor c) {

            double donation = 0.0;

            if (donationLastTurn >= donationReceived) {
                if (donationReceived == 10)
                    donation = 1.0002;
                else if (donationLastTurn - donationReceived > 0 && donationLastTurn - donationReceived < Math.sqrt(donationReceived))
                    donation = Math.sqrt(donationReceived) + 0.0009;
                else if (donationReceived - donationLastTurn > 0 && donationReceived - donationLastTurn < Math.sqrt(donationReceived))
                    donation = Math.sqrt(donationLastTurn) + 0.0009;
                else
                    donation = donationLastTurn + 0.00009;

            } else if (donationLastTurn - 1.0009 > 0) {
                donation = donationLastTurn + 0.0009;

            } else if (donationLastTurn == 0 || donationReceived == 0) { // alguem 'traiu'
                donation += 0.009;
            } else
                donation = 3.00;

            if (donation > 10) {
                donation = Double.MIN_VALUE;
            }
            // sejamos mais honestos
            if (donation > 0 && donation < 1) {
                donation *= 1 + (donation * 2);
            }

            addHistoricListGived(donation);
            donationLastTurn = donation;
            if (DEBUG) {
                System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
            }
            return donation;
        }
    }


class Player2 extends Player {

    /**
     * T??tica 2: m??dia de todas as doa????es feitas pelo player
     * doamos a parte decimal dessa m??dia
     * @param c competidor que ir?? receber a doa????o
     * @return valor da doa????o
     */
    public double declareDonationTo(Competitor c) {

        double media = 0.0;
        double j = 1;
        double donation = 0.0;
        long imedia;

            for (int i = 0; i < historicListReceived.size(); i++) {
                if (historicListReceived.get(i) > 0) {
                    media += historicListReceived.get(i) / j;

                    media = media - (long) media;
                }

                j++;
            }
            if (media <= 10 && media >= 0)
                donation = media;

            if (DEBUG) {
                System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
            }
        // sejamos mais honestos
        if (donation > 0 && donation < 1) {
            donation *= 1 + (donation * 2);
        }

        return donation;
        }
    }

class Player3 extends Player {

    private boolean equilibrio = false;

    /**
     * T??tica 3: simplifica????o do 'equilibro de Nash'
     * consideramos equilibrio quando um jogador n??o aumenta sua doa????o (s?? diminui ou mantem)
     * enquanto esse equilibrio for mantido, mandamos continuamos com o mesmo valor.
     * caso o equilibrio tenha quebrado, mandamos o minimo valor possivel
     * @param c competidor que ir?? receber a doa????o
     * @return doa????o
     */
    public double declareDonationTo(Competitor c) {

            double donation = 0.0;
        if (equilibrio ) { //na?? h?? equilibrio, logo vou ser o pior poss??vel
            donation = Double.MIN_VALUE;
        } else if (donationLastTurn > donationReceived && equilibrio) {
            equilibrio = true;
            donation = donationLastTurn;
        }else if (donationLastTurn == donationReceived && equilibrio) {
            equilibrio = true;
            donation = donationLastTurn;
        } else  if (donationLastTurn < donationReceived && equilibrio) {
            equilibrio = false;
            donation = donationLastTurn % donationReceived;
        }

        if(donation == 0 || (donation * 2) > 10 ) {
            donation = 0.5;
        }

        if (DEBUG) {
            System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
        }
        // sejamos mais honestos
        if (donation > 0 && donation < 1) {
            donation *= 1 + (donation * 2);
        }

        if (donation >= 0 && donation <= 10) {
                addHistoricListGived(donation);
                return donation;
            } else {
                addHistoricListGived(donation);
                return Double.MIN_VALUE;
            }
        }
    }


    class Player4 extends Player {


        /**
         * T??tica 4: manda o menor valor poss??vel caso o player que iremos doar tenha um montante maior que o nosso
         * caso n??o, doamos um valor constante.
         * @param c competidor que ir?? receber a doa????o
         * @return doa????o
         */
        public double declareDonationTo(Competitor c) {

            double donation;
            if (c.getTotalCash() > getTotalCash()) {
                donation = Double.MIN_VALUE;
            } else {
                donation = Math.log(Math.PI);
            }

            if (DEBUG) {
                System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");
            }
            // sejamos mais honestos
            if (donation > 0 && donation < 1) {
                donation *= 1 + (donation * 2);
            }
            if (donation >= 0 && donation <= 10) {
                addHistoricListGived(donation);
                return donation;
            } else {
                addHistoricListGived(donation);
                donation = Double.MIN_VALUE;
                return donation;
            }
        }

    }

    class Player5 extends Player {

        public double declareDonationTo(Competitor c) {
            // implementa????o de m??dia
            double donation;
            double min = 0.0000001;
            double max = 9.9999999;
            Random rn = new Random();

            donation = rn.nextDouble() + min;

            if (donation >= donationLastTurn) {
                if (Math.log(donationLastTurn) > 0 && Math.exp(donationLastTurn) < 10)
                    donation = donationLastTurn - Math.log(donationLastTurn);
                else if ( (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)))) <= 10 && donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)))  >= 0)
                    donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));
            } else if (donation >= donationReceived) {
                if (Math.log(donationReceived) > 0 && Math.log(donationReceived) <= 10)
                    donation = donationReceived * Math.log(donationReceived);
                else if (Math.tan(Math.log(Math.sqrt(donationReceived))) * donationReceived <= 10 && Math.tan(Math.log(Math.sqrt(donationReceived))) * donationReceived <= 0)
                    donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));
            } else if (donation >= (donationReceived % donationLastTurn)) {
                if (Math.log(donationReceived % donationLastTurn) >= 0 && Math.log(donationReceived % donationLastTurn) <= 10)
                    donation = donationReceived * Math.log(donationReceived % donationLastTurn);
                else if (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) <= 10 && donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) >= 0)
                    donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));

            } else if (donation >= (Math.sqrt(donationReceived) + donationLastTurn)) {
                if (Math.log(Math.sqrt(donationReceived)) >= 0 && Math.log(Math.sqrt(donationReceived)) <= 10)
                    donation = Math.log(Math.sqrt(donationReceived));
                else if (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) <= 10)
                    donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));
            } else if (donation >= (Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn))) {
                if ((Math.log(Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn))) >= 0 && Math.log(Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn)) <= 10)
                    donation = Math.log(Math.sqrt(donationReceived) + Math.sqrt(donationLastTurn));
                else if (donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived))) > 0)
                    donation = donationReceived * Math.tan(Math.log(Math.sqrt(donationReceived)));


            } else if (donation <= donationReceived)
                donation = donation * 0.0002;



            if (DEBUG) {
                System.out.println("***DEBUG: Player: " + this.getClass().getSimpleName() + " doando " + donation + "***");

            }
            // sejamos mais honestos
            if (donation > 0 && donation < 1) {
                donation *= 1 + (donation * 2);
            }



            if (donation >= 0 && donation <= 10) {
                addHistoricListGived(donation);
                return donation;
            } else {
                System.out.println("(((((((((((((((((((((((DOACAO MAIOR QUE DEZ OU MENOR QUE ZERO =>" + donation);
                donation = Double.MIN_VALUE;
                addHistoricListGived(donation);
                return donation;
            }
        }
    }

/**
 * Comparator criado para podermos utilizar Collections.sort(ArrayList<Competitor>)
 */
class playerComparatorCash implements Comparator<Competitor> {
    @Override
    public int compare(Competitor o1, Competitor o2) {
        if (o1.getTotalCash() < o2.getTotalCash()){
            return 1;
        } else {
            return -1;
        }
    }
}