/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

import java.util.HashMap;

import br.usp.icmc.ssc01032015.Competitor;

class Strategist4 extends Strategist {
    // inicialmente doa 5
    // mas a partir da segunda rodada doa o que o outro tinha doado na ultima rodada 

    HashMap<Competitor, Double> lastRoundDonations;


    public Strategist4()
    {
        lastRoundDonations = new HashMap<>();
        strategyName = "estrat??gia_4";
    }


    @Override
    public void informDonationFrom(Competitor c, double donation)
    { //recebe o valor que o oponente decidiu doar
        lastRoundDonations.put(c, donation);
        donationIn = donation;
        thisRoundGains();
        addCash(gains);
    }


    @Override
    public double declareDonationTo(Competitor c)
    {
        if (lastRoundDonations.containsKey(c))//ainda t?? armazenando a doa????o da ??ltima rodada
        {
            this.donationOut = lastRoundDonations.get(c);
        } else {
            this.donationOut = 5;
        }
        return donationOut;
    }

}
