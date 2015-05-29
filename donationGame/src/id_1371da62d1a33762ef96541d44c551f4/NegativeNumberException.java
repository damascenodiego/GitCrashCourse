/**
 * Trab 1 - SSC0103 - Programa????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

/**
 * Exce????o que ?? lan??ada quando um nu??mero digitado foi < 0, e envia uma mensagem de erro ao usuario
 */
public class NegativeNumberException extends Exception {

    public NegativeNumberException(int number) {
        message(number);
    }
    public void message(int number) {
        System.out.println("Error: " + number + " less than 0");
    }
}
