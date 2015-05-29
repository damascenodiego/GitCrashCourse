package id_f48e66ad4d196743b49e55a7fd991109;

import java.util.Deque;
import java.util.LinkedList;

public class CrazyM extends CompetitorPrototype implements Competitor{
    private boolean fourth = true;
    private boolean third = true;
    private boolean second = true;
    private boolean cycled = false;
    private int masterID = -2;
    private int lenght = 0;
    private int iterator = 0;
    private Deque<Double> l = new LinkedList<>();
    private Deque<Boolean> b = new LinkedList<>();
    public CrazyM(){
    }
    public double declareDonationTo(Competitor c){
        if(fourth==false)
            {
            if (b.getFirst())
                return l.getFirst();
            else
                return 0;
            }
        else
            {
            if(cycled==false)
                return 0.00001337;
            else
                {
                if(second)
                    return 0;
                else
                    {
                    if (b.getFirst())
                        return 10;
                    else
                        return 0;
                    }
                }
            }
        }
    public void informDonationFrom(Competitor c, double donation){
        if(fourth==false)
            {
            b.addLast(b.removeFirst());
            l.removeFirst();
            l.addLast(donation);
            if (iterator==lenght-1)
                iterator=-1;
            iterator++;
            }
        else
            {
            if(cycled==false)
                {
                if(opponents.add(c))
                    {
                    l.addLast(donation);
                    b.addLast(false);
                    lenght++;
                    iterator++;
                    }
                else
                    {
                    if(donation == 0.00001337)
                        {
                        b.removeFirst();
                        b.addLast(true);
                        }
                    else
                        b.addLast(b.removeFirst());
                    l.removeFirst();
                    l.addLast(donation);
                    iterator = 1;
                    cycled=true;
                    }
                }
            else
                {
                if(second)
                    {
                    if(donation == 0.00001337)
                        {
                        b.removeFirst();
                        b.addLast(true);
                        }
                    else
                        b.addLast(b.removeFirst());
                    l.removeFirst();
                    l.addLast(donation);
                    if(iterator==lenght-1)
                        {
                        iterator = -1;
                        second=false;
                        }
                    iterator++;
                    }
                else
                    {
                    if(third)
                        {
                        b.addLast(b.removeFirst());
                        l.removeFirst();
                        l.addLast(donation);
                        if (iterator==lenght-1)
                            {
                            iterator=-1;
                            third=false;
                            }
                        iterator++;
                        }
                    else
                        {
                        b.addLast(b.removeFirst());
                        l.removeFirst();
                        l.addLast(donation);
                        if (iterator==lenght-1)
                            {
                            iterator=-1;
                            fourth=false;
                            }
                        iterator++;
                        }
                    }
                }
            }
        }
}
