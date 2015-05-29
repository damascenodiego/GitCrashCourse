/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

import java.util.Random;

public class Strategist1 extends Strategist {
    //jogador aleat??rio

    Random r;


    public Strategist1()
    {
        strategyName = "estrat??gia_1";
        r = new Random();
    }


    @Override
    public double declareDonationTo(Competitor c)
    {
        this.donationOut = r.nextInt(11);        
        return donationOut;
    }

}
