package id_2CD0139AA2F7EAD1FA54FFDF63658D6C;

import java.util.ArrayList;
import java.util.Arrays;

public class Tournament {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        if (args.length != 6) {
            System.out.println("Arguments: <Number of rounds> <N players using strat 1> <N players using strat 2> <N players using strat 3> <N players using strat 4> <N players using strat 5> ");
            System.exit(1);
        }
        list.addAll(Arrays.asList(args));

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list2.add(Integer.parseInt(list.get(i)));
        }

        ArrayList<Competitor> players = new ArrayList<>();
        for (int i = 0; i < list2.get(1); i++) {
            players.add(new S1());
        }
        for (int i = 0; i < list2.get(2); i++) {
            players.add(new S2());
        }
        for (int i = 0; i < list2.get(3); i++) {
            players.add(new S3());
        }
        for (int i = 0; i < list2.get(4); i++) {
            players.add(new S4());
        }
        for (int i = 0; i < list2.get(5); i++) {
            players.add(new S5());
        }

        int turns = list2.get(0);
        while (turns > 0) {
            for (int i = 0; i < players.size() - 1; i++) {
                for (int j = i + 1; j < players.size(); j++) {
                    double amount1 = players.get(i).declareDonationTo(players.get(j));
                    double amount2 = players.get(j).declareDonationTo(players.get(i));
                    players.get(i).informDonationFrom(players.get(j), amount2);
                    players.get(j).informDonationFrom(players.get(i), amount1);
                    players.get(i).addCash((10 - amount1) + (2 * amount2));
                    players.get(j).addCash((10 - amount2) + (2 * amount1));
                }
            }
            turns--;
        }

        boolean troca = true;
        Competitor aux = new S1();
        while (troca) {
            troca = false;
            for (int i = 0; i < players.size() - 1; i++) {
                if (players.get(i).getTotalCash() < players.get(i + 1).getTotalCash()) {
                    aux = players.get(i);
                    players.set(i, players.get(i + 1));
                    players.set(i + 1, aux);
                    troca = true;
                }
            }
        }

        System.out.println("Ranking: ");
        for (int i = 0; i < players.size(); i++) {
            String str = players.get(i).getClass().getName();
            System.out.println((i + 1) + " - " + "(Strategy " + str.substring(11) + "):  $" + players.get(i).getTotalCash());
        }
    }
}
