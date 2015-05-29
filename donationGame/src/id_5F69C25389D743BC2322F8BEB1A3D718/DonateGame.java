
package id_5F69C25389D743BC2322F8BEB1A3D718;

import java.util.Scanner;

public class DonateGame
{
    private static final int numberOfTypes = 5;       // defines how many types of players there will be in the game  
    
    public static void main(String[] args)
    {
        int rounds;                                   // stores how much rounds the tournament has
        int numberPlayers[] = new int[numberOfTypes]; // per example: numberPlayers[x] gives how many players "type x" are in the game
        int totalPlayers = 1;                         // stores how much players are in the tournament
        
        String watchMeetings = "";                    // used to control if the user wants to watch every meeting        
        String rankPerRound = "";                     // used to control if the user wants to see a rank in the end of each round
        
        Competitor_Game[] players;                    // used to store the players
        
        Scanner input = new Scanner(System.in);       // used to read from the console
        
        System.out.printf("Bem vindo ao DonateGame!\n");        
        System.out.printf("Digite quantas rodadas o torneio tera: ");

        try
        {
            rounds = input.nextInt();
        }
        catch (Exception e)
        {
            rounds = numberOfTypes * numberOfTypes;
            System.out.printf("\n###@@@ A quantidade de rodadas do torneio sera a quantidade padrao, ou seja, %d rodadas @@@###\n", rounds);
            
            myTimer(4000);
        }
        
        
        while (totalPlayers < 2)
        {
            System.out.printf("\nObservacao: insira a quantidade de jogadores de forma\n"
                              + "que haja PELO MENOS 2 jogadores!\n\n");
            
            totalPlayers = 0;
            
            for (int i = 0; i < numberOfTypes; i++)
            {
                System.out.printf("Digite quantos competidores do tipo %d tera: ", i + 1);
                
                try
                {
                    numberPlayers[i] = input.nextInt();
                }
                catch (Exception e)
                {
                    numberPlayers[i] = numberOfTypes;
                    System.out.printf("\n###@@@ A quantidade de competidores do tipo %d sera a "
                                        + "quantidade padrao, ou seja, %d competidores @@@###\n\n", i + 1, numberPlayers[i]);
                    
                    myTimer(4000);
                }
                
                totalPlayers += numberPlayers[i];
            }
        }
        
        System.out.printf("\nCriando jogadores...");
        /* initializing the vector of players */
        players = new Competitor_Game[totalPlayers];
        // create the structure that will store the players
        createArray(players, numberPlayers, rounds);
        
        myTimer(2000);

        
        System.out.printf(  "\n\n--> Deseja acompanhar todos os encontros entre os jogadores?" 
                            + "\nCaso opte por SIM, em cada encontro isso seria impresso, por exemplo:"
                            + "\n    Encontro:   player 3 (tipo 2) e player 9 (tipo 5)\n"
                
                            + "\n                 ## Doacoes:"
                            + "\n                      - player 3 (tipo 2) doou 5.67"
                            + "\n                      - player 9 (tipo 5) doou 7.34"
                
                          + "\n\n                 ## Dinheiro recebido:"
                            + "\n                      - player 3 (tipo 2) recebeu 19.01"
                            + "\n                      - player 9 (tipo 5) recebeu 14.00"
                         );

        
        while ((checkYes(watchMeetings) == false) && (checkNo(watchMeetings) == false)) // while (the input is invalid)
        {
            System.out.printf("\nSIM(S) ou NAO(N): ");
            try
            {
                watchMeetings = input.next().toUpperCase();
            }
            catch (Exception e)
            {
                System.out.printf("\n###@@@ Erro na leitura do teclado, portanto adotaremos que a resposta seja afirmativa. @@@###");
                watchMeetings = "S";
                myTimer(4000);
            }
        }
            
        
        System.out.printf("\n\n--> Deseja ver um ranking dos jogadores no final de cada rodada?");
        
        while ((checkYes(rankPerRound) == false) && (checkNo(rankPerRound) == false)) // while (the input is invalid)
        {
            System.out.printf("\nSIM(S) ou NAO(N): ");
            try
            {
                rankPerRound = input.next().toUpperCase();
            }
            catch (Exception e)
            {
                System.out.printf("\n###@@@ Erro na leitura do teclado, portanto adotaremos que a resposta seja afirmativa. @@@###");
                rankPerRound = "S";
                myTimer(4000);
            }
        }
        
        System.out.printf("\nIniciando o torneio...");
        myTimer(2000);
        
        /***************************
            LOOP = FOR EACH ROUND
        ***************************/
        
        for (int count_round = 0; count_round < rounds; count_round++)
        {
            informRound_to_Players(players, count_round); // each player needs to be informed, so they can store a historic
            
            if (checkYes(watchMeetings) == true)
                System.out.printf("\n\nRodada %d#", count_round + 1);
            

            /***************************
                LOOP - FOR EACH PAIR
            ***************************/
            
            for (int i = 0; i < totalPlayers - 1; i++) // for each player, all possible meetings (combinations) 
            {                                          // will be generated for him
                Competitor_Game Player1 = players[i];
                
                for (int j = i + 1; j < totalPlayers; j++)
                {
                    Competitor_Game Player2 = players[j];
                    
                    meeting(Player1, Player2, watchMeetings);
                }
            }
            
            if (checkYes(rankPerRound) == true)
            {
                System.out.printf("\n\n\tRanking %d.a rodada:\n", count_round + 1);
                printRanking(players);
            }
        }
        
        System.out.printf("\n\n\t--------------------\n");
        System.out.printf(    "\t-- Ranking final: --\n");
        System.out.printf(    "\t--------------------\n");
        printRanking(players);
        
        System.out.printf("\n\n2015 DonateGame.\n\n");
    }
    
    private static void meeting (Competitor_Game Player1, Competitor_Game Player2, String wannaWatch)
    {        
        double donation_P1_to_P2, donation_P2_to_P1; // (P1 = player1 and P2 = player2) 
        double amountP1, amountP2;                   
                   
        donation_P1_to_P2 = Player1.declareDonationTo(Player2);
        donation_P2_to_P1 = Player2.declareDonationTo(Player1);

        Player1.informDonationFrom(Player2, donation_P2_to_P1);
        Player2.informDonationFrom(Player1, donation_P1_to_P2);

        amountP1 = 10 - donation_P1_to_P2 + 2 * donation_P2_to_P1;
        amountP2 = 10 - donation_P2_to_P1 + 2 * donation_P1_to_P2;

        Player1.addCash(amountP1);
        Player2.addCash(amountP2);
        
        if (checkYes(wannaWatch) == true)
        {
            System.out.printf("\n\n    Encontro:   player %d (tipo %d) e player %d (tipo %d)\n", 
                                Player1.getID() + 1, Player1.getType() + 1, Player2.getID() + 1, Player2.getType() + 1);
            System.out.printf("\n                 ## Doacoes:");
            System.out.printf("\n                      - player %d (tipo %d) doou " + 
                    double2DecimalPlaces(donation_P1_to_P2), Player1.getID() + 1, Player1.getType() + 1);
            System.out.printf("\n                      - player %d (tipo %d) doou " + 
                    double2DecimalPlaces(donation_P2_to_P1), Player2.getID() + 1, Player2.getType() + 1);
            System.out.printf("\n\n                 ## Dinheiro recebido:");
            System.out.printf("\n                      - player %d (tipo %d) recebeu " + 
                    double2DecimalPlaces(amountP1), Player1.getID() + 1, Player1.getType() + 1);
            System.out.printf("\n                      - player %d (tipo %d) recebeu " + 
                    double2DecimalPlaces(amountP2), Player2.getID() + 1, Player2.getType() + 1);
        }
    }
    
    private static void createArray (Competitor_Game[] players, int[] numberPlayers, int rounds)
    {
        /***************************
            CREATING THE PLAYERS!
        ***************************/       
        
        int sum = numberPlayers[0];
        
        /* initializing all type 0 */
        for (int j = 0; j < sum; j++)
            players[j] = new PlayerType0(j, 0, rounds); 
        
        /* initializing all type 1 */
        sum += numberPlayers[1];
        for (int j = sum - numberPlayers[1]; j < sum; j++)
            players[j] = new PlayerType1(j, 1, rounds); 
        
        /* initializing all type 2 */
        sum += numberPlayers[2];
        for (int j = sum - numberPlayers[2]; j < sum; j++)
            players[j] = new PlayerType2(j, 2, rounds); 
        
        /* initializing all type 3 */
        sum += numberPlayers[3];
        for (int j = sum - numberPlayers[3]; j < sum; j++)
            players[j] = new PlayerType3(j, 3, rounds); 

        /* initializing all type 4 */
        sum += numberPlayers[4];
        for (int j = sum - numberPlayers[4]; j < sum; j++)
            players[j] = new PlayerType4(j, 4, rounds); 
    }
    
    private static void printRanking (Competitor_Game[] players)
    {
        SortCompetitor ranking = new SortCompetitor(players);
        
        ranking.sortByAmount();
        
        ranking.print();
    } 
    
    private static void informRound_to_Players (Competitor_Game[] players, int round)
    {
            for (Competitor_Game player : players) // for each player in the array
                player.informRound(round);         // inform the current round
    }
    
    public static String double2DecimalPlaces(double value) 
    {  
        String str;
        try
        {
            str = String.format("%.2f", value);
        }
        catch (Exception e)
        {
            str = "0.00";
        }
        return (str);  
    }  
    
    private static void myTimer(long milisec)
    {
        long current = System.currentTimeMillis();
        long time = current + milisec;
        for (long i = current; i < time; i = System.currentTimeMillis());
    }
    
    private static boolean checkYes (String str)
    {
        if ((str.equals("S"))   || 
            (str.equals("SIM")) || 
            (str.equals("SI"))  ||
            (str.equals("Y"))   || 
            (str.equals("YES"))
           )
            return (true);
        else
            return (false);
    }
    
    private static boolean checkNo (String str)
    {
        if ((str.equals("N"))   || 
            (str.equals("NAO")) || 
            (str.equals("NO"))
           )
            return (true);
        else
            return (false);
    }
    
}

