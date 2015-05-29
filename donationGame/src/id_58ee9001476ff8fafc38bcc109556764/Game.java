package id_58ee9001476ff8fafc38bcc109556764;

import java.util.Arrays;

import br.usp.icmc.ssc01032015.Competitor;

public class Game {

    Competitor[] list;
    int i;

    public void setUpGame(int[] sizes){
        int n1 = sizes[0];
        int n2 = sizes[0] + sizes[1];
        int n3 = sizes[0] + sizes[1] + sizes[2];
        int n4 = sizes[0] + sizes[1] + sizes[2] + sizes[3];
        int n5 = sizes[0] + sizes[1] + sizes[2] + sizes[3] + sizes[4];
        list = new Player[n5];

        // Filling with type 1 players
        for(i = 0; i < n1; i++){
            list[i] = new Strategy1();
        }
        // Filling with type 2 players
        for(i = n1; i < n2; i++){
            list[i] = new Strategy2();
        }
        // Filling with type 3 players
        for(i = n2; i < n3; i++){
            list[i] = new Strategy3();
        }
        // Filling with type 4 players
        for(i = n3; i < n4; i++){
            list[i] = new Strategy4();
        }
        // Filling with type 5 players
        for(i = n4; i < n5; i++){
            list[i] = new Strategy5();
        }
    }
    public void tournament(int rounds){
        int i = 0;
        int j, k;

        while(i < rounds){
            for(j = 0; j < list.length; j++){
                for(k = 0; k < list.length; k++){
                    if(j != k){// A player doesn't play with himself
                        encounter(list[j], list[k]);// Two players play with each other
                    }
                }
            }
            i++;
        }
    }
    public void encounter(Competitor one, Competitor two){
        double donation = 0;
        double donation2 = 0;

        // get the value of the donation player1 -> player2
        donation = one.declareDonationTo(two);
        two.informDonationFrom(one, donation);
        donation2 = two.declareDonationTo(one);
        one.informDonationFrom(two, donation);
        // Player1 plays with Player2 and vice-versa, so divide by 2
        one.addCash(((10 - donation) + (donation2 * 2))/2);
        two.addCash(((10 - donation2) + (donation * 2))/2);
    }
    public void print(){
        int i;
        double total;
        // Sort the Array
        Arrays.sort(list);
        for(i = 0; i < list.length; i++){
            Object o = list[i];
            if(o instanceof Strategy1){
                total = list[i].getTotalCash();
                System.out.println(total + " Strategy One");
            }
            else if(o instanceof Strategy2){
                total = list[i].getTotalCash();
                System.out.println(total + " Strategy Two");
            }
            else if(o instanceof Strategy3){
                total = list[i].getTotalCash();
                System.out.println(total + " Strategy Three");
            }
            else if(o instanceof Strategy4){
                total = list[i].getTotalCash();
                System.out.println(total + " Strategy Four");
            }
            else if(o instanceof Strategy5){
                total = list[i].getTotalCash();
                System.out.println(total + " Strategy Five");
            }
        }
    }
}
