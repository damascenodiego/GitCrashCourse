/**
 * Trab 1 - SSC0103 - Programa????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

public interface Competitor {

    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);

    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);

    // Adds the amount of cash
    void addCash(double amount);

    // Get the amount of cash this competitor has
    double getTotalCash();

}
