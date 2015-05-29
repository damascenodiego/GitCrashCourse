/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_823f8912a4d502ff866453d2c1bf00fa;
import java.util.Scanner;
/**
 *
 * @author Adriller, Allan, Hikaro
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int rounds = entrada.nextInt();
        int qtC1 = entrada.nextInt();
        int qtC2 = entrada.nextInt();
        int qtC3 = entrada.nextInt();
        int qtC4 = entrada.nextInt();
        int qtC5 = entrada.nextInt();
        
        Tournment tournment = new Tournment(rounds, qtC1, qtC2, qtC3, qtC4, qtC5);
        tournment.Create();
        tournment.Begin();
        tournment.Finish();
    }
}
