package id_f0a8b5160d64da3473414b6ea1247ba6.classes;

import java.util.Scanner;

import br.usp.icmc.ssc01032015.Competitor;

public class Player implements Competitor {
	
	private double cash;
	private String name;
	private double donated;
	
	public Player(String name) {
		this.name = name;
		this.cash = 0d;
		this.donated = 0d;
	}
	
	public double declareDonationTo(Competitor c) {
		Scanner in = new Scanner(System.in);
		double donation = in.nextDouble();
		in.close();
		
		Player aux = (Player)c;
		aux.setDonated(donation);
		return donation;
	}

	public void informDonationFrom(Competitor c, double donation) {
		Player aux = (Player)c;
		System.out.println(donation + "U$ donated from player '" + aux.getName() + "' to "
				+ this.name);
	}

	public void addCash(double amount) {
		this.cash += amount;
	}

	public double getCash() {
		return this.cash;
	}

	public String getName() {
		return name;
	}
	
	public double getDonated() {
		return this.donated;
	}
	
	public void setDonated(double amount) {
		this.donated = amount;
	}
} 
