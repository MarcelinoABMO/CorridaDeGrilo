/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridadegrilo;

import java.util.Scanner;

/**
 *
 * @author Gustavo Eliseu, Lucas, Marcelino
 */
public class CorridaDeGrilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pegando os inputs
            //pegando a quantidade de grilos
        System.out.print("Quantos grilos devem correr? ");
        Scanner scan = new Scanner(System.in);
        int quantGrilos = scan.nextInt();
            //pegando a posição da linha de chegada
        System.out.print("Qual a distancia para a chegada? ");
        int distanciaTotal = scan.nextInt();
        
        //
        
        //imprimir o resultado final
        System.out.println("\nResultado Final:");
        //
    }
}
