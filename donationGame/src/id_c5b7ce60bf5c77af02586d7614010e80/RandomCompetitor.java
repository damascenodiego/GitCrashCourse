package id_c5b7ce60bf5c77af02586d7614010e80;

import br.usp.icmc.ssc01032015.Competitor;


public class RandomCompetitor extends AbstractCompetitor
{

    @Override
    public double declareDonationTo(Competitor c)
    {
        return Math.min(11.0 * Math.pow(Math.random(), 2.0), 10.0);
    }

    @Override
    public void informDonationFrom(Competitor c, double donation)
    {

    }
}
