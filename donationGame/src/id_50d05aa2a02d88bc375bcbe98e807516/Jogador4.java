package id_50d05aa2a02d88bc375bcbe98e807516;

import br.usp.icmc.ssc01032015.Competitor;

public class Jogador4 extends Jogador {

    public Jogador4() {
        this.Cash = 0;
        this.Tipo = 4;
    }

    @Override
    public double declareDonationTo(Competitor c) {
        this.addCash(3);
        return 7;
    }

}
