package id_54ef1d2792fa9d19e157ff12a9c04d8f;

public class Main {
	public static void main(String[] args)
	{
			if(args.length != 6){
				System.out.println("Somente s?o aceitos 6 parametros. (N?mero de rodadas + quantidade de jogador por ordem crescente");
				System.exit(0);
			}
			else{
				Torneio torneio = new Torneio(args);
				torneio.start(args);
				torneio.winner();
			}
	}
}
