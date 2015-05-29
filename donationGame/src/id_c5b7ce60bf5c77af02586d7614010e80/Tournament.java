//package id_c5b7ce60bf5c77af02586d7614010e80;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
////import javafx.util.Pair;
//
//public class Tournament
//{
//    private List<Competitor> competitors;
//
//    public Tournament(Pair<Class, Integer>[] pairs)
//    {
//        //Pre-calculate number of competitors to avoid List reallocation
//        int competitorsCount = 0;
//        for (Pair<Class, Integer> pair : pairs)
//        {
//            competitorsCount += pair.getValue();
//        }
//
//        competitors = new ArrayList<Competitor>(competitorsCount);
//
//        for (Pair<Class, Integer> pair : pairs)
//        {
//            addCompetitorsOfType(pair.getKey(), pair.getValue());
//        }
//    }
//
//    private void addCompetitorsOfType(Class type, int count)
//    {
//
//        for (int iCompetitors = 0; iCompetitors < count; ++iCompetitors)
//        {
//            try
//            {
//                competitors.add((Competitor) type.newInstance());
//            } catch (InstantiationException e)
//            {
//                e.printStackTrace();
//            } catch (IllegalAccessException e)
//            {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void playRounds(int roundsCount)
//    {
//        for (int iRound = 0; iRound < roundsCount; iRound++)
//        {
//            for (int p1 = 0; p1 < competitors.size(); ++p1)
//            {
//                for (int p2 = p1 + 1; p2 < competitors.size(); ++p2)
//                {
//                    playTurn(competitors.get(p1), competitors.get(p2));
//                }
//            }
//        }
//    }
//
//    public void playTurn(Competitor c1, Competitor c2)
//    {
//        double c1Donation = c1.declareDonationTo(c2);
//        double c2Donation = c2.declareDonationTo(c1);
//
//        c1.informDonationFrom(c2, c2Donation);
//        c2.informDonationFrom(c1, c1Donation);
//
//        c1.addCash(10.0 - c1Donation + 2 * c2Donation);
//        c2.addCash(10.0 - c2Donation + 2 * c1Donation);
//    }
//
//    public void printRanking()
//    {
//        Collections.sort(competitors, new Comparator<Competitor>()
//        {
//            @Override
//            public int compare(Competitor c1, Competitor c2)
//            {
//                //account only for the two first decimal cases
//                return (int) (c2.getTotalCash() * 100) - (int) (c1.getTotalCash() * 100);
//            }
//        });
//
//        for (Competitor competitor : competitors)
//        {
//            System.out.println(competitor);
//        }
//    }
//}
