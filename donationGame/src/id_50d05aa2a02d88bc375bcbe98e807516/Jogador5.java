package id_50d05aa2a02d88bc375bcbe98e807516;

import java.util.Random;

public class Jogador5 extends Jogador {

    Random rand;

    public Jogador5() {
        this.Cash = 0;
        this.Tipo = 5;
        rand = new Random();
    }

    @Override
    public double declareDonationTo(Competitor c) {
        double donat = rand.nextInt(10);
        this.addCash(10 - donat);
        return donat;
    }

}
