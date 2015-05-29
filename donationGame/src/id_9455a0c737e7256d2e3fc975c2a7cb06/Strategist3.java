/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

import br.usp.icmc.ssc01032015.Competitor;

class Strategist3 extends Strategist {
    //jogador que nunca doa nada

    public Strategist3()
    {
        strategyName = "estrat??gia_3";
    }


    @Override
    public double declareDonationTo(Competitor c)
    {
        this.donationOut = 0;
        return donationOut;
    }

}
