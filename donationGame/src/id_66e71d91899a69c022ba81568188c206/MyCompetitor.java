
/*
* 
* Thu Apr  2 19:00:26 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

import java.util.Hashtable;

public class MyCompetitor implements Competitor {

	protected String name;

	protected double cash;

	protected Hashtable<Competitor, History> historyTable;

	public MyCompetitor() {
		this.cash = 0.0;
		this.historyTable = new Hashtable<Competitor, History>();

		this.name = new String("My Competitor");
	}

	public void Recharge() {
		this.cash += 10.0;
	}

	public void DoDebit(double debit) { this.cash -= debit;}

	public void DoCredit(double credit) { this.addCash(credit); }

	public void CreateHistoryTable(Competitor c) {
		this.historyTable.put(c, new History());
	}

	public int compareTo(MyCompetitor mc) {
		return Double.compare(mc.getTotalCash(), this.getTotalCash());
	}

	public String getName() { return this.name; }

	public double declareDonationTo(Competitor c) { //Indicates how much to donate to Competitor c
		History h = this.historyTable.get(c);
		h.getDonationHistory().add(0.0);

		return 0.0;
	}

	public void informDonationFrom(Competitor c, double donation) { //Indicates how much was donated from Competitor c
		this.DoCredit(donation);

		History h = this.historyTable.get(c);
		h.getReceiptHistory().add(donation);
	}

	public void addCash(double amount) { //Adds the amount of cash
		this.cash += amount;
	}

	public double getTotalCash() { //Get the amount of cash this Competitor has
		return this.cash;
	}
}
