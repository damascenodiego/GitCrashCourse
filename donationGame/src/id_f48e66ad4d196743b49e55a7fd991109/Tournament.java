package id_f48e66ad4d196743b49e55a7fd991109;

import java.util.Arrays;

import br.usp.icmc.ssc01032015.Competitor;

public class Tournament{
    public static void main(String[] arg)
        {
    	String []args = {"10", "2", "2", "2", "2", "2"};
        if (args.length != 6)
            {
            System.out.println("Formato do comando:java Tournament <Numero de rodadas> <Numero de competidores tipo 1> <Numero de competidores tipo 2> <Numero de competidores tipo 3> <Numero de competidores tipo 4> <Numero de competidores tipo 5>");
            return;
            }
        int i, j=0;
        double temp1, temp2;
        int roundCntr = Integer.parseInt(args[0]);
        int bigCntr = Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4])+Integer.parseInt(args[5]);
        Playerdata[] ranker = new Playerdata[bigCntr];
        Competitor[] bigArray = new Competitor[bigCntr];
        for(i=0;i<Integer.parseInt(args[1]);i++)
            {
            bigArray[j] = new ScroogeS();
            ranker[j] = new Playerdata();
            ranker[j].id = j+1;
            ranker[j].type = 1;
            j++;
            }
        for(i=0;i<Integer.parseInt(args[2]);i++)
            {
            bigArray[j] = new HalfreflectionS();
            ranker[j] = new Playerdata();
            ranker[j].id = j+1;
            ranker[j].type = 2;
            j++;
            }
        for(i=0;i<Integer.parseInt(args[3]);i++)
            {
            bigArray[j] = new HalfdifferenceS();
            ranker[j] = new Playerdata();
            ranker[j].id = j+1;
            ranker[j].type = 3;
            j++;
            }
        for(i=0;i<Integer.parseInt(args[4]);i++)
            {
            bigArray[j] = new HalfsumS();
            ranker[j] = new Playerdata();
            ranker[j].id = j+1;
            ranker[j].type = 4;
            j++;
            }
        for(i=0;i<Integer.parseInt(args[5]);i++)
            {
            bigArray[j] = new CrazyM();
            ranker[j] = new Playerdata();
            ranker[j].id = j+1;
            ranker[j].type = 5;
            j++;
            }
        for(;roundCntr>0;roundCntr--)
            {
            for(i=0;i<bigCntr-1;i++)
                {
                for(j=i+1;j<bigCntr;j++)
                    {
                    temp1=bigArray[i].declareDonationTo(bigArray[j]);
                    temp2=bigArray[j].declareDonationTo(bigArray[i]);
                    bigArray[i].informDonationFrom(bigArray[j], temp2);
                    bigArray[j].informDonationFrom(bigArray[i], temp1);
                    bigArray[i].addCash(10-temp1 + temp2*2);
                    bigArray[j].addCash(10-temp2 + temp1*2);
                    }
                }
            }
        for(i=0;i<bigCntr;i++)
            {
            ranker[i].score = bigArray[i].getTotalCash();
            }
        Arrays.sort(ranker);
        for(i=0;i<bigCntr;i++)
            System.out.println("Rank " + (i+1) + ". ID: " + ranker[i].id + " type: " + ranker[i].type + " score: " + ranker[i].score);
        }
}
