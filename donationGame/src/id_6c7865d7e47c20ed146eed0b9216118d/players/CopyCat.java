package id_6c7865d7e47c20ed146eed0b9216118d.players;
import java.util.HashMap;

import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Player;
import br.usp.icmc.ssc01032015.Competitor;

public class CopyCat extends Basic { 
    private static double initialDonation; 
    private HashMap<Competitor, Double> lastDonation;

    public CopyCat() {
        initialDonation = 10;
        lastDonation = new HashMap<Competitor, Double>();
    }

    public CopyCat(double init) {
        initialDonation = init >= 0 && init <= 10 ? init : 10;
        lastDonation = new HashMap<Competitor, Double>();
    }

	public double declareDonationTo(Competitor c) {
        Double val = lastDonation.get(c);
        return val != null ? val : initialDonation;
    }

	public void informDonationFrom(Competitor c, double donation) {
        lastDonation.put(c, donation);
    }
}
