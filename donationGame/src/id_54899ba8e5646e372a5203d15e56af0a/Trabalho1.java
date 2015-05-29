package id_54899ba8e5646e372a5203d15e56af0a;

public class Trabalho1{

	public static void main (String[] args){

		if (args.length != 6){
			System.out.println("Invalid number of arguments!!!");
		}

		else {
			int nRodadas = Integer.parseInt(args[0]);
			int[] nCompetitors = new int[5];
			int totalCompetitors = 0, k = 0;

			for(int i=0; i<5; i++){
				nCompetitors[i] = Integer.parseInt(args[i+1]);
				totalCompetitors+=nCompetitors[i];
			}

			Player[] players = new Player[totalCompetitors];

			for(int i=0;i<5;i++){
				for(int j=0;j<nCompetitors[i];j++){
					if(i==0){
						players[k] = new Strategy_1(k);
					} else if (i==1){
						players[k] = new Strategy_2(k);
					} else if (i==2){
						players[k] = new Strategy_3(k);
					} else if (i==3){
						players[k] = new Strategy_4(k);
					} else if (i==4){
						players[k] = new Strategy_5(k);
					}
					k++;
				}
			}

			Tournament tournament = new Tournament();

			tournament.encounters(players, totalCompetitors);
			tournament.results(players, totalCompetitors);
		}
	}
}