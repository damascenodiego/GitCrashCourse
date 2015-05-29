/*------------------------------------------------------------
 *                      === DonationGame ===
 *  
 *  
 *  @author  Barbara Darques (ICMC-USP)
 *             
 *-----------------------------------------------------------*/
package id_9455a0c737e7256d2e3fc975c2a7cb06;

import java.util.Arrays;

public class DonationGame {

    public static int n; //n??????mero de rodadas
    public static int s1, s2, s3, s4, s5; //n??????mero de jogadores de cada estrat??????gia
    public static int total; // total de jogadores
    public static Strategist[] players; //lista de jogadores


    public static void newRound()
    {
        Match m;
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                m = new Match(players[i], players[j]);
            }
        }
    }


    public static void printScore()
    {
        for (Strategist player : players) {
            System.out.println(player.strategyName + "      " + player.getTotalCash());
        }
    }


    public static void main(String[] args)
    {
        n = Integer.parseInt(args[0]);
        s1 = Integer.parseInt(args[1]);
        s2 = Integer.parseInt(args[2]);
        s3 = Integer.parseInt(args[3]);
        s4 = Integer.parseInt(args[4]);
        s5 = Integer.parseInt(args[5]);
        total = s1 + s2 + s3 + s4 + s5;
        players = new Strategist[total];

        //================ preenche a lista de jogadores =================
        int x = 0;
        while (s1 != 0) {
            players[x] = new Strategist1();
            x++;
            s1--;
        }
        while (s2 != 0) {
            players[x] = new Strategist2();
            x++;
            s2--;
        }
        while (s3 != 0) {
            players[x] = new Strategist3();
            x++;
            s3--;
        }
        while (s4 != 0) {
            players[x] = new Strategist4();
            x++;
            s4--;
        }
        while (s5 != 0) {
            players[x] = new Strategist5();
            x++;
            s5--;
        }
        //================================================================

        for (int i = 1; i <= n; i++) {
            newRound();
        }
        
        Arrays.sort(players); //ordena baseado no valor do totalCash
        printScore();
    }

}
