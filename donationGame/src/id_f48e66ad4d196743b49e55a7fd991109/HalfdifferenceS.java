package id_f48e66ad4d196743b49e55a7fd991109;

import java.util.Deque;
import java.util.LinkedList;

import br.usp.icmc.ssc01032015.Competitor;

public class HalfdifferenceS extends CompetitorPrototype implements Competitor{
    private boolean cycled = false;
    private int masterID = -2;
    private int lenght = 0;
    private int iterator = 0;
    private double planDonation = 3;
    private Deque<Double> l = new LinkedList<>();
    public HalfdifferenceS(){
    }
    public double declareDonationTo(Competitor c){
        if (iterator == masterID)
            return 10;
        else
            {
            if(cycled==false)
                return planDonation;
            else
                {
                planDonation = l.getFirst();
                return planDonation;
                }
            }
        }
    public void informDonationFrom(Competitor c, double donation){
        if(cycled==false)
            {
            if(opponents.add(c))
                {
                l.addLast(Math.abs((donation-planDonation)/2));
                lenght++;
                if(donation == 0.00001337)
                    masterID = iterator;
                iterator++;
                }
            else
                {
                l.removeFirst();
                l.addLast(donation);
                iterator = 1;
                cycled=true;
                }
            }
        else
            {
            l.removeFirst();
            l.addLast(donation);
            if (iterator==lenght-1)
                iterator=-1;
            iterator++;
            }
        }
}
