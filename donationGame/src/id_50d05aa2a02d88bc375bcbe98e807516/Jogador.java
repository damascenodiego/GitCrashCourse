package id_50d05aa2a02d88bc375bcbe98e807516;

public abstract class Jogador implements Competitor, Comparable<Jogador> {

    protected double Cash;
    protected int Tipo;
    protected int ID;

    // Construtor
    public Jogador() {
        this.Cash = 0;
        this.Tipo = 0;
    }

    //Declara quanto o jogador ir?? doar
    public double declareDonationTo(Competitor C) {
        return 0;
    }

    public void informDonationFrom(Competitor C, double donation) {
    }

    
    // Adiciona a quantia amount no valor total do jogador
    public void addCash(double amount) {
        this.Cash = amount + this.Cash;
    }

    //Retorna a quantia total do jogador
    public double getTotalCash() {
        return this.Cash;
    }

    //Retorna o tipo de estrat??gia do Jogador
    public int getTipo() {
        return this.Tipo;
    }

    //M??todo utilizado para implementar a interface Comparable, respons??vel por ordenar os jogadores
    //pela quantia total que eles possuem
    @Override
    public int compareTo(Jogador outroJogador) {
        if (this.Cash > outroJogador.getTotalCash()) {
            return -1;
        }

        if (this.Cash < outroJogador.getTotalCash()) {
            return 1;
        }

        return 0;
    }

}
