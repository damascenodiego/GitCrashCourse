/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

public class Strategist2 extends Strategist {
    //jogador que sempre doa tudo

    public Strategist2()
    {
        strategyName = "estrat??gia_2";
    }


    @Override
    public double declareDonationTo(Competitor c)
    {
        this.donationOut = 10;
        return donationOut;
    }

}
