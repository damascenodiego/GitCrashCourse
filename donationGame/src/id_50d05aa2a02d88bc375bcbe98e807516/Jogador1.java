package id_50d05aa2a02d88bc375bcbe98e807516;

public class Jogador1 extends Jogador {

    public Jogador1() {
        this.Cash = 0;
        this.Tipo = 1;
    }

    @Override
    public double declareDonationTo(Competitor c) {
        return 10;
    }

}
