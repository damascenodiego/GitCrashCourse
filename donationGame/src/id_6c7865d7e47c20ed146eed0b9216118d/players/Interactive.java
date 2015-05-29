package id_6c7865d7e47c20ed146eed0b9216118d.players;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

import br.usp.icmc.ssc01032015.Competitor;

public class Interactive implements Competitor {
    private Stack<String> names;
    private HashMap<Competitor, PlayerHistory> players;
    private double cash;

    private class PlayerHistory {
        public String name;
        public Stack<Double> donations;

        PlayerHistory(String name) {
            this.name = name;
            donations = new Stack<Double>();
        }
    }

    public Interactive() throws FileNotFoundException, IOException {
        players = new HashMap<Competitor, PlayerHistory>();
        cash = 0;
        names = new Stack<String>();
        BufferedReader input = null;

        try {
            input = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/names")));

            String readName;
            while((readName = input.readLine()) != null) {
                names.push(readName);
            }

            Collections.shuffle(names);
        } finally {
            if(input != null) {
                input.close();
            }
        }
    }

    public double declareDonationTo(Competitor c) {
        PlayerHistory h = players.get(c);
        Scanner s = new Scanner(System.in);

        if(h == null) {
            h = new PlayerHistory(names.pop());
            players.put(c, h);
            System.out.format("First donation to \"%s\": ", h.name);
        } else {
            printLastDonations(h, 5);
            System.out.format("How much to donate to \"%s\"? ", h.name);
        }

        double donation = s.nextDouble();
        System.out.println();
        return donation;
    }

	public void informDonationFrom(Competitor c, double donation) {
        PlayerHistory h = players.get(c);
        if(h != null) {
            h.donations.push(donation);
        } else {
            System.err.println("Aviso! Simula????o injusta!");
        }
    }

	public void addCash(double amount) {
        cash += amount;
    }

	public double getTotalCash() {
        return cash;
    }

    private void printLastDonations(PlayerHistory h, int n) {
        int rounds = h.donations.size();
        if(rounds <= n) {
            System.out.format("Last %d donation(s) from \"%s\":%n", 
                              rounds, h.name);
            int i = 1;
            for(Double donation : h.donations) {
                System.out.format("%d:\t%02.2f%n", i++, donation);
            }
        } else {
            System.out.format("Last %d donations from \"%s\":%n", n, h.name);
            int startPoint = rounds - n;
            Iterator<Double> itr = h.donations.listIterator(startPoint);

            while(itr.hasNext()) {
                System.out.format("%d:\t%02.2f%n", ++startPoint, itr.next());
            }
        }
    }
}
