/*1)Faça um menu com switch, indente e coloque o código em um void ();
 *2)Simule o código no alterando os intervalos para 3 e 8;
 *3)Faça um menu com switch, indente e coloque o código em um void ();
 *4)Instancie um objeto e execute no main(), verifique o valor final da
variável produto se bate com as simulações. */
package aulas13;

import java.util.Scanner;

/**
 * @author Tiago de Freitas
 * Data: 27/07/2023
 */
public class Classe1 {    
    public void acumuladorFor(Scanner leitor) {
        double inicio=0, produto = 1;//Não pode ser inicializada com '0'
        System.out.print("\n\tDigite um número: ");
        inicio=leitor.nextInt();
        
        for (int i=1; i<inicio; i++){
            produto *= i; // produto = produto * i
        }System.out.print("\tProduto acumulado: " + produto + "\n"); 
    }
}
