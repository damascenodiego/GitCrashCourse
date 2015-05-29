package id_6c7865d7e47c20ed146eed0b9216118d.players;
import java.util.ArrayList;
import java.util.HashMap;

import br.usp.icmc.ssc01032015.Competitor;

public class TitTat extends Basic {
    private HashMap<Competitor, Double> movingExpAvg;
    private double myFingerPrint;
    private double whiteFingerPrint;

    protected ArrayList<Competitor> whiteList;
    protected ArrayList<Competitor> regularList;


    public TitTat() {
        movingExpAvg = new HashMap<Competitor, Double>();
        whiteList = new ArrayList<Competitor>();
        regularList = new ArrayList<Competitor>();
        myFingerPrint = 9.991337;
        whiteFingerPrint = 9.991338;
    }

    public TitTat(double mfp, double wfp) {
        movingExpAvg = new HashMap<Competitor, Double>();
        whiteList = new ArrayList<Competitor>();
        regularList = new ArrayList<Competitor>();
        myFingerPrint = mfp;
        whiteFingerPrint = wfp;
    }

	public double declareDonationTo(Competitor c) {
        if(whiteList.contains(c)) return 0;

        Double avg = movingExpAvg.get(c);
        if(avg == null) {
            return myFingerPrint;
        } else {
            return avg > 10.0 ? 10.0 : avg < 4.2 ? 0 : avg;
        }
    }

	public void informDonationFrom(Competitor c, double donation) {
        Double avg = movingExpAvg.get(c);
        if(avg != null) {
            movingExpAvg.put(c, avg + 0.80085 * (donation - avg));
        } else {
            movingExpAvg.put(c, donation);
        }

        if(!(regularList.contains(c) || whiteList.contains(c))) {
            if(donation == whiteFingerPrint)
                whiteList.add(c);
            else
                regularList.add(c);
        }
    }
}
