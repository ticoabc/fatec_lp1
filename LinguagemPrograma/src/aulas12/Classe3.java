/*( LOOP FOR )
“Exibir a soma de todos os números divisíveis por 3 e 4 entre X e Y. .”
1) Monte o programa completando o código que falta e indentando;
2) Execute dentro do main; 
3) Faça a sondagem dentro do código;*/
package aulas12;

import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 25/07/2023
 */
public class Classe3 {

   public int numDivisiveispor3e4(Scanner leitor){
       int x = 0, y = 0, soma = 0;
            System.out.print("\n\tDigite o valor de X: ");
            x=leitor.nextInt();
            System.out.print("\tDigite o valor de Y: ");
            y=leitor.nextInt();
            for (int i=x; i<=y; i++) {
            if ( i % 3 == 0 && i % 4 == 0 ){
                soma += i;                
            }
        }System.out.print ("\tSoma: " + soma);
        return soma;
    }
}