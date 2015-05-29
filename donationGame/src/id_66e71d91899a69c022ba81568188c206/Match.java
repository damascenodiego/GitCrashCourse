
/*
* 
* Thu Apr  2 19:55:51 BRT 2015
* author: Joao Gustavo Cabral de Marins
* e-mail: jgcmarins@gmail.com
* 
*/

package id_66e71d91899a69c022ba81568188c206;

public class Match {

	public MyCompetitor A;

	public MyCompetitor B;

	public Match(MyCompetitor A, MyCompetitor B) {
		this.A = A;
		this.B = B;

		this.A.CreateHistoryTable(B);
		this.B.CreateHistoryTable(A);
	}

	public void DoMatch() {
		this.Recharge();

		double donationToB = this.A.declareDonationTo(this.B);
		double donationToA = this.B.declareDonationTo(this.A);

		this.A.DoDebit((donationToB));
		this.B.DoDebit((donationToA));

		this.A.informDonationFrom(this.B, (2*donationToA));
		this.B.informDonationFrom(this.A, (2*donationToB));
	}

	public void Recharge() {
		this.A.Recharge();
		this.B.Recharge();
	}
}
