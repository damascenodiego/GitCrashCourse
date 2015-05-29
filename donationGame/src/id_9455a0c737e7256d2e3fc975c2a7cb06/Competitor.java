/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

public interface Competitor {

    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);


    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);


    // Adds the amount of cash
    void addCash(double amount);


    // Get the amount of cash this competitor has
    double getTotalCash();

}
