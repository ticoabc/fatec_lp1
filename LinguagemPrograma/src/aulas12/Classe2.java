/*( LOOP FOR )
“ Exibir os números inteiros não divisíveis por 3 entre entre X e Y. “ .
1) Monte o programa completando o código que falta e indentando; 
2) Execute dentro do main; 
3) Faça a sondagem dentro do código;
 */
package aulas12;

import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 24/07/2023
 */
public class Classe2 {
    
    public void nãoDivisiveispor3(Scanner leitor) {
        int i, x, y;
        System.out.print("\n\tDigite o valor de X: ");
        x=leitor.nextInt();
        System.out.print("\tDigite o valor de Y: ");
        y=leitor.nextInt();        
        for (i = x; i <= y; i += 1) {
            if (i % 3 != 0) {
                System.out.print("\t[ " + i + " ]");
            }
	}
    }
}