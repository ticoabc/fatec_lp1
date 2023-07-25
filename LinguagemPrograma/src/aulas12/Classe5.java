/*Função tendo como parâmetro de entrada um Número inteiro NUM, dentro
o comando FOR para calcular e armazenar o Fatorial de NUM.
Finalmente crie mais uma sub rotina para executar tanto o void quanto
a função Fatorial, contendo um menu de controle para executar o void e 
exibir o Fatorial de um número que deverá ser lido dentro do int main pelo teclado.*/
package aulas12;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 25/07/2023
 */
public class Classe5 {
    
    public void get_fat(Scanner leitor) {
        int n, i, f = 1;
        System.out.print("\n\tDigite um Número inteiro: ");
        n = leitor.nextInt();
        for (i = 1; i <= n; i++) {
            f *= i;
        }System.out.println("\t"
                + "O Fatorial do número digitado será: " + f + "\n");
    }
}
