/**
 * Interface exigida para o Trabalho 1 - Jogo da Doa????o
 *
 * Integrantes:
 * Marcos Vinicius Barros
 * Gustavo Santiago
 * Henrique Freitas
 */

package id_c191a8c00b0597a16496999fd0156be6;

public interface Competitor {

    // indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);

    // indicates how much was donate from Competitor c
    void informDonationFrom(Competitor c, double donation);

    //add the amounts of cash
    void addCash(double amount);

    // get the amount of cash this competitor has
    double getTotalCash();


}