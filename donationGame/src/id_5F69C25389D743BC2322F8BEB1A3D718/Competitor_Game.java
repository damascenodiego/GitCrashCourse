
package id_5F69C25389D743BC2322F8BEB1A3D718;

import br.usp.icmc.ssc01032015.Competitor;

public interface Competitor_Game extends Competitor
{
    // inform to the competitor in which round/turn he is
    public void informRound(int round);
    // return the ID of the competitor
    public int getID();
    // return the type of the competitor
    public int getType();
}
