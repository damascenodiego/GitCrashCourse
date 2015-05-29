package id_58ee9001476ff8fafc38bcc109556764;

public class Main {

    public static void main(String[] args){

        int[] sizes = new int[5];
        int rounds = Integer.parseInt(args[0]);

        sizes[0] = Integer.parseInt(args[1]);
        sizes[1] = Integer.parseInt(args[2]);
        sizes[2] = Integer.parseInt(args[3]);
        sizes[3] = Integer.parseInt(args[4]);
        sizes[4] = Integer.parseInt(args[5]);

        int n = sizes[0] + sizes[1] + sizes[2] + sizes[3] + sizes[4];

        Game game = new Game();
        game.setUpGame(sizes);
        game.tournament(rounds);
        game.print();
    }
}
