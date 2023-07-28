/*Algoritmo, para exibir o 54º número par que está na lista de
números inteiros entre 148 e 2950 */
package aulas13;

import java.util.Scanner;

/**
 * @author Tiago de Freitas
 * Data: 27/07/2023
 */
public class Classe2 {
    public void modUse(Scanner leitor) {
        
        int inicio=0, fim=0, cont=0;
        
        System.out.print("\n\tNúmero inicial: ");
        inicio = leitor.nextInt();
        System.out.print("\tNúmero final: ");
        fim = leitor.nextInt();
        
        for (int i=inicio; i<fim; i++){
            if ( i % 2 == 0 ){
                cont++;
            }
            if (cont == 54){
                System.out.print("\t54º número par: " + i + "\n");
                break;
            }
        }
    }
}
