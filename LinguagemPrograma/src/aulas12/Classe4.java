/*
1) Método tendo como parâmetros de leitura dois intervalos A e B, 
para através do comando FOR calcular e exibir o somatório de todos 
os números ímpares entre A e B*/
package aulas12;

import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 25/07/2023
 */
public class Classe4{
    int x = 0, y = 0, soma = 0;
    public int get_soma(Scanner leitor) {
        System.out.print("\n\tDigite 1º número: ");
        x = leitor.nextInt();
        System.out.print("\tDigite 2º número: ");
        y = leitor.nextInt();
        for (int i=x; i<=y; i+=1) {
            if (i % 3 == 0){
            soma += i; // soma = soma + i
            }
        }return soma;
    }
    
    public void exibir() {
	System.out.print("\tSoma de todos os números ímpares: " + soma + "\n");
    }
}
