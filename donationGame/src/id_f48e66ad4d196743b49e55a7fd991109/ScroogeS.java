package id_f48e66ad4d196743b49e55a7fd991109;

import br.usp.icmc.ssc01032015.Competitor;

public class ScroogeS extends CompetitorPrototype implements Competitor{
    private boolean cycled = false;
    private int masterID = -2;
    private int lenght = 0;
    private int iterator = 0;
    public ScroogeS(){
    }
    public double declareDonationTo(Competitor c){
        if (iterator == masterID)
            return 10;
        else
            return 0;
        }
    public void informDonationFrom(Competitor c, double donation){
        if(cycled==false)
            {
            if(opponents.add(c))
                {
                lenght++;
                if(donation == 0.00001337)
                    masterID = iterator;
                iterator++;
                }
            else
                {
                iterator = 1;
                cycled=true;
                }
            }
        else
            {
            if (iterator==lenght-1)
                iterator=-1;
            iterator++;
            }
        }
}
