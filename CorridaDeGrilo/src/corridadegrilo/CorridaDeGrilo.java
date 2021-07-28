/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridadegrilo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Eliseu, Lucas, Marcelino
 */
public class CorridaDeGrilo {

    public static void main(String[] args) {
        
        //pegando os inputs
            //pegando a quantidade de grilos
        System.out.print("Quantos grilos devem correr? ");
        Scanner scan = new Scanner(System.in);
        int quantGrilos = scan.nextInt();
            //pegando a posição da linha de chegada
        System.out.print("Qual a distancia para a chegada? ");
        int distanciaTotal = scan.nextInt();
        
        //instanciando os grilos e armazenando em um array
        Grilo[] grilos = new Grilo[quantGrilos];
        for (int i = 0; i < quantGrilos; i++)
        {
            grilos[i] = new Grilo((i+1), distanciaTotal);
        }
        
        //executando as threads
        for (Grilo g : grilos)
            g.start();
        
        //aguardando as threads terminarem
        for (Grilo g : grilos)
        {
            try {
                g.join();
            } catch (InterruptedException ex) {
                System.out.println("Deu merda no join das threads.");
            }
        }
        
        //imprimindo o resultado final
        System.out.println("\nResultado Final:");
        for (int i = 0; i < quantGrilos; i++)
        {
            System.out.println("O Grilo_" + (i+1) + " percorreu um total de " +
                    grilos[i].getPosicao() + "cm com " + grilos[i].getPulos() );
        }
    }
}
