/**
 * Trab 1 - SSC0103 - Programa????o Orientada a Objetos
 * Matheus Gomes da Silva Horta - 8532321
 * Matheus Tornelli Andrade de Santana - 8516611
 */
package id_1371da62d1a33762ef96541d44c551f4;

import br.usp.icmc.ssc01032015.Competitor;

/*
Classe que representa um jogador generico. Todos
os outros tipos de jogadores com estrat??gias especificas extendem
essa classe.
Cada jogador tem um identificador ( ID )e a quantidade de dinheiro que possue ( totalCash )

*/
public class Player implements Competitor {

    private double totalCash;
    private int ID;

    public Player(int IDnum) {
        totalCash = 0;
        setID(IDnum);
    }

    /* Get e Set para o ID do jogador */
    public void setID(int IDnum) {
        this.ID = IDnum;
    }
    public int getID() {
        return ID;
    }

    public double declareDonationTo(Competitor c) {
        return 0;
    }

    public void informDonationFrom(Competitor c, double donation) {
    }

    public void addCash(double amount) {
        totalCash = totalCash + amount;
    }

    public double getTotalCash() {
        return totalCash;
    }

    /*
    Retorna uma string informando a estrategia que ?? usada pelo jogador.
    */
    public String getType() {
        return "";
    }

    // Imprime as informa????es pertinentes em rela????o a cada candidato
    public void printInfo() {
        System.out.format("%d %.2f %s",ID,totalCash,getType());
    }
}

