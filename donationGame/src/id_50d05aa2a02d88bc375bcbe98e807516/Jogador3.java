package id_50d05aa2a02d88bc375bcbe98e807516;

public class Jogador3 extends Jogador {

    public Jogador3() {
        this.Cash = 0;
        this.Tipo = 3;
    }

    @Override
    public double declareDonationTo(Competitor c) {
        this.addCash(5);
        return 5;
    }

}
