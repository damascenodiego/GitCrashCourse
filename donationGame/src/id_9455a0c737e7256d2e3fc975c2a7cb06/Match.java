/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

public class Match {

    Competitor p1, p2;
    private double donationP1, donationP2;


    public Match(Competitor player1, Competitor player2)
    {
        this.p1 = player1;
        this.p2 = player2;
        this.start();
    }


    private void start()
    {
        donationP1 = p1.declareDonationTo(p2);//doa de p1 para p2
        donationP2 = p2.declareDonationTo(p1);//doa de p2 para p1
        p1.informDonationFrom(p2, donationP2);
        p2.informDonationFrom(p1, donationP1);
    }

}
