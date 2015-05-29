
package id_4b4ef5b808a257d43d9fab537e427945;


public class TrabalhoPOO 
{
    public static void main(String[] arg) {
    	String[] args = {"10", "2", "2", "2", "2", "2"};
        
        int nRodadas = Integer.parseInt(args[0]);
        int Type1 = Integer.parseInt(args[1]);
        int Type2 = Integer.parseInt(args[2]);
        int Type3 = Integer.parseInt(args[3]);
        int Type4 = Integer.parseInt(args[4]);
        int Type5 = Integer.parseInt(args[5]);
        
        
        
         Torneio T = new Torneio(nRodadas);
        
         T.iniciarTorneio(Type1, Type2, Type3, Type4, Type5);
         
         T.escreveResultado();        
    }
}
