/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

import br.usp.icmc.ssc01032015.Competitor;

public abstract class Strategist implements Competitor, Comparable<Strategist> {

    private double totalCash = 0.0;
    double donationIn, donationOut; //doa????o recebida e doa????o enviada
    double gains;//ganhos da rodada
    public String strategyName;


    @Override
    public abstract double declareDonationTo(Competitor c);
    //valor entre 0.00 e 10.00 que o jogador decidiu doar

    @Override
    public void informDonationFrom(Competitor c, double donation)
    { //recebe o valor que o oponente decidiu doar
        donationIn = donation;
        thisRoundGains();
        addCash(gains);
    }


    public void thisRoundGains()
    { //calcula os ganhos dessa rodada
        gains = 10.00 - donationOut + donationIn * 2;
    }


    @Override
    public void addCash(double amount) //adiciona os ganhos ao caixa
    {
        totalCash += amount;
    }


    @Override
    public double getTotalCash() //retorna o caixa total
    {
        return totalCash;
    }


    @Override
    public int compareTo(Strategist s2)
    {
        return (int) (s2.getTotalCash() - this.totalCash) * 100;
    }

}
