
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