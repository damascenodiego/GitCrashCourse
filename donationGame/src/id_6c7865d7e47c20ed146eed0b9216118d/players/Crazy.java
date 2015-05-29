package id_6c7865d7e47c20ed146eed0b9216118d.players;
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Player;

public class Crazy extends Basic {
    private static Random rnd;
    private double cash;

    static {
        rnd = new Random();
    }

	public double declareDonationTo(Competitor c) {
        return rnd.nextDouble() * 10;
    }
}
