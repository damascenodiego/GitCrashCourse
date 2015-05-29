package id_6c7865d7e47c20ed146eed0b9216118d.players;

import br.usp.icmc.ssc01032015.Competitor;

public class MeanTitTat extends TitTat {
    public MeanTitTat() {
        super(9.991338, 9.991337);
    }

    public double declareDonationTo(Competitor c) {
        if(whiteList.contains(c)) {
            return 10;
        } else {
            return super.declareDonationTo(c);
        }
    }
}
