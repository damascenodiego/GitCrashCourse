/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

import java.util.HashMap;
import java.util.Random;

import br.usp.icmc.ssc01032015.Competitor;

class Strategist5 extends Strategist {
    //jogador que tenta se adequar baseando-se na diferen??a entre as doa????es feitas e recebidas
    //inclusive, n??o doa se nada se n??o tiver recebeido nada na ??ltima rodada
    //na primeira rodada ele doa um valor aleat??rio

    HashMap<Competitor, Double> lastRoundReceived;
    HashMap<Competitor, Double> lastRoundGiven;
    Random r;


    public Strategist5()
    {
        lastRoundReceived = new HashMap<>();
        lastRoundGiven = new HashMap<>();
        r = new Random();
        strategyName = "estrat??gia_5";
    }


    @Override
    public void informDonationFrom(Competitor c, double donation)
    { //recebe o valor que o oponente decidiu doar
        lastRoundReceived.put(c, donation);
        donationIn = donation;
        thisRoundGains();
        addCash(gains);
    }


    @Override
    public double declareDonationTo(Competitor c)
    {
        double dif;

        if (lastRoundReceived.containsKey(c))//ainda t?? armazenando a doa????o da ??ltima rodada
        {

            double lastOut = lastRoundGiven.get(c);
            double lastIn = lastRoundReceived.get(c);
            if (lastIn == 0) {//se mesmo depois de ter doado alguma coisa ainda n??o receber nada
                //n??o doa nada tamb??m at?? receber algo
                return 0;
            }
            dif = lastOut - lastIn;//diferen??a entre o que foi doado e o que foi recebido na ??ltima rodada
            if (dif >= 0) {//se doou menos que recebeu
                if ((lastOut - 2 * dif) >= 0) {
                    donationOut = lastOut - 2 * dif;
                } else {
                    donationOut = (double)((int)lastOut) / 2; //2 casts pra manter os valores finais nas 2 casas decimais
                }
            } else { //se recebeu mais que doou(dif<0)
                donationOut = lastOut - (double)((int)dif) / 2;//2 casts pra manter os valores finais nas 2 casas decimais
            }

        } else {//se for a primeira rodada
            this.donationOut = r.nextInt(11);
        }

        lastRoundGiven.put(c, donationOut);
        return donationOut;
    }

}
