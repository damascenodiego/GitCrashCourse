package id_f0a8b5160d64da3473414b6ea1247ba6;

import id_f0a8b5160d64da3473414b6ea1247ba6.classes.CustomComparator;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Iterator;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.Player;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S1Player;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S2Player;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S3Player;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S4Player;
import id_f0a8b5160d64da3473414b6ea1247ba6.classes.strategies.S5Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> nameList = new LinkedList<String>();
		
		System.out.println("Enter with the number of players: ");
		int nPlayers = in.nextInt();
		
		System.out.println("Enter with the number of rounds: ");
		int nRounds = in.nextInt();
		
		HashMap<String, Player> map = new HashMap<String, Player>(nPlayers);
		String name = null;
		int strategy = 0;
		for (int i = 1; i <= nPlayers; i++) {
			System.out.println("\nEnter with the name of the " + i + "o player: ");
			
			try {
				name = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			nameList.add(name);
			
			System.out.println("Enter with the desired strategy 1=0.0, 2=2.5, 3=5.0, "
					+ "4=7.5, 5=10.0");
			strategy = in.nextInt();
			
			map.put(name, playerSelector(name, strategy));
		}
		
		Iterator it = new Iterator();
		String player1 = null;
		String player2 = null;
		for (int i = 1; i <= nRounds; i++) {
			System.out.println("\nRound " + i + "!");
			
			System.out.println("Enter with the name of the first player: ");
			
			try {
				player1 = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			while (!nameList.contains(player1)) {
				System.out.println("The name was entered incorrectly or is not recorded. Please try again: ");
				try {
					player1 = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("Enter with the name of the second player: ");
			
			try {
				player2 = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			while (!nameList.contains(player2)) {
				System.out.println("The name was entered incorrectly or is not recorded. Please try again: ");
				try {
					player2 = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			it.round(map.get(player1), map.get(player2));
		}
		
		Comparator<Map.Entry<String, Player>> comp = new CustomComparator();
		
		List<Map.Entry<String, Player>> entries = new ArrayList<Map.Entry<String,Player>>();
		entries.addAll(map.entrySet());
		Collections.sort(entries, comp);
		
		System.out.println("\n\nRounds are over! Final ranking:");
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		for (int i = 1; i <= nPlayers; i++) {
			System.out.println(i + "o: " + (entries.get(i-1)).getValue().getName()
					+ " " + formatter.format((entries.get(i-1)).getValue().getTotalCash()) + " U$");
		}
		
		System.out.println("\nThank you for playing!");
		in.close();
	}
	
	private static Player playerSelector(String name, int sel) {
		switch (sel) {
		case 1:
			return new S1Player(name);
		case 2:
			return new S2Player(name);
		case 3:
			return new S3Player(name);
		case 4:
			return new S4Player(name);
		case 5:
			return new S5Player(name);
		default:
			return null;
		}
	}

}
