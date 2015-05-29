package id_c5b7ce60bf5c77af02586d7614010e80;

import java.util.HashMap;
import java.util.Map;

import br.usp.icmc.ssc01032015.Competitor;

public class AlternateCompetitor extends AbstractCompetitor
{
    Map<Competitor, Boolean> cooperate = new HashMap<Competitor, Boolean>();

    @Override
    public double declareDonationTo(Competitor c)
    {
        Boolean bCooperate = cooperate.get(c);
        if (bCooperate == null || bCooperate == false)
        {
            cooperate.put(c, true);
            return 0.0;
        } else
        {
            cooperate.put(c, false);
            return 10.0;
        }
    }

    @Override
    public void informDonationFrom(Competitor c, double donation)
    {

    }
}
