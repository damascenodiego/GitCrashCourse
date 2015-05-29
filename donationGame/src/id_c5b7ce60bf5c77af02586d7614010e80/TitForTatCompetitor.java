package id_c5b7ce60bf5c77af02586d7614010e80;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

public class TitForTatCompetitor extends AbstractCompetitor
{

    Map<Competitor, Double> nextDonation = new HashMap<Competitor, Double>();
    double initialDonation = 10.0;

    @Override
    public double declareDonationTo(Competitor c)
    {
        Double donation = nextDonation.get(c);
        return donation == null ? initialDonation : donation;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation)
    {
        nextDonation.put(c, donation);
    }
}
