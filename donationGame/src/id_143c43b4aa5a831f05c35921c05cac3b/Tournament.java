package id_143c43b4aa5a831f05c35921c05cac3b;
import java.util.Scanner;

class Tournament {
	public static void main(String args[]) {
		int players;
		int rounds;
		double amountX;
		double amountY;

		//Amount of players of each strategy
		int amount1, amount2, amount3, amount4, amount5;

		//Input of numbers of rounds, players and strategy
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rounds?");
		rounds = scan.nextInt();
		
		System.out.println("Total rounds: " + rounds);

		System.out.println("How many players of Strategy 1?");
		amount1 = scan.nextInt();
		
		System.out.println("How many players of Strategy 2? ");
		amount2 = scan.nextInt();
		
		System.out.println("How many players of Strategy 3?");
		amount3 = scan.nextInt();

		System.out.println("How many players of Strategy 4?");
		amount4 = scan.nextInt();

		System.out.println("How many players of Strategy 5?");
		amount5 = scan.nextInt();
		
		scan.close();

		players = amount1 + amount2 + amount3 + amount4 + amount5;

		System.out.println("Total players: " + players);

		Competitor[] bot = new Competitor[players];

		//list to mark the strategy of the players
		int[] list;
		list = new int[players];

		//count
		int i, j;

		//creating the players
		for(i=0; i<amount1; i++) {
			if(amount1 > 0) {
				bot[i] = new Strategy1();
				j = 1;
				list[i] = j;
			}
		}
		for(i=amount1; i<amount1+amount2; i++) {
			if(amount2 > 0) {
				bot[i] = new Strategy2();
				j = 2;
				list[i] = j;
			}
		}
		for(i=amount1+amount2; i<amount1+amount2+amount3; i++) {
			if(amount3 > 0) {
				bot[i] = new Strategy3();
				j = 3;
				list[i] = j;
			}
		}
		for(i=amount1+amount2+amount3; i<amount1+amount2+amount3+amount4; i++) {
			if(amount4 > 0) {
				bot[i] = new Strategy4();
				j = 4;
				list[i] = j;
			}
		}
		for(i=amount1+amount2+amount3+amount4; i<amount1+amount2+amount3+amount4+amount5; i++) {
			if(amount5 > 0) {
				bot[i] = new Strategy5();
				j = 5;
				list[i] = j;
			}
		}

		//rounds
		while(rounds != 0) {
			for(i=0; i<players-1; i++) {
				for(j=i+1; j<players; j++) {
					//How much to donate
					amountX = bot[i].declareDonationTo(bot[j]);
					amountY = bot[j].declareDonationTo(bot[i]);
					//How much was donated
					bot[i].informDonationFrom(bot[j], amountY);
					bot[j].informDonationFrom(bot[i], amountX);
					//How much cash the player won
					bot[i].addCash((10-amountX)+(2*amountY));
					bot[j].addCash((10-amountY)+(2*amountX));
				}
			}
			rounds--;
		}

		Competitor aux = new Strategy1();

		int x, y;

		//making the final score
		for(i=0; i<players-1; i++) {
			for(j=i+1; j<players; j++) {
				if(bot[i].getCash() < bot[j].getCash()) {
					aux = bot[j];
					bot[j] = bot[i];
					bot[i] = aux;
					x = list[i];
					y = list[j];
					list[j] = x;
					list[i] = y;
				}
			}
		}
		//printing the final score
		System.out.println("Final score:");
		for(i=0; i<players; i++) {
			System.out.println((i+1) + "-Total-cash: " + bot[i].getCash() + " Player-type:" + list[i]);
		}
	}
}
