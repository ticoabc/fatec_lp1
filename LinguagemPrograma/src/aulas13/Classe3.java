/*Algoritmo para identificar se um número é primo ou não. 
 *Para que seja primo o número deve ser divisível somente
por 1 e por ele mesmo */
package aulas13;

import java.util.Scanner;

/**
 * @author Tiago de Freitas
 * Data: 27/07/2023
 */
public class Classe3 {
    public void primoNumro(Scanner leitor) {
        int num, contdiv=0;
        System.out.print("\n\tDigite o número: ");
        num = leitor.nextInt();
        for (int i = 1; i <= num ; i++){
            if ( num % i == 0 )
                contdiv ++;
        }
        if ( contdiv == 2 )
            System.out.print("\t"+ num + " é primo!\n");
        else
            System.out.print("\t"+ num + " não é primo!\n");
    }    
}
