/*i) método para ler um número inteiro positivo N;
  ii) método para calcular o fatorial de N;
  iii) método para calcular o somatório dos números primos de 1 até N;
  iv) método para exibir os números primos de 1 até N. */
package aulas13;

import java.util.Scanner;

/**
 * @author Tiago de Freitas
 * Data: 27/07/2023
 */
public class Classe4 {
    
    protected int valor;
    protected int primo;
    protected int soma=0;
    
    public int entrada(Scanner leitor) {
        System.out.print("\n\t[1]Digite um número inteiro positivo: ");
        valor = leitor.nextInt();
        return valor;
    }
    
    public void fatorial() {
    int i, f = 1;
    System.out.print("\n\t[2]Fatorial!");
        for (i = valor; i > 0; i--) {
            f *= i;
        }System.out.print("\n\tO Fatorial do número digitado será: " + f + "\n");
    }
    
    public void somaPrimo(){
        int i, primo=0, soma=0;
            for (i=1; i<=valor; i++){
                for (int j=1; j<=i; j++){
                    if (i%j==0){
                        primo++;
                    }
                }
                if (primo == 2){
                    soma += i;
                }primo = 0;
        }System.out.println("\n\t[3]Soma dos nºs primos de 1 até N: " + soma);
    }
    
    public void exibePrimos(){
        System.out.println("\n\t[4]Exibe nºs primos de 1 até N");
        for (int i=1; i<=valor; i++){
            for (int j=1; j<=i; j++){
                if (i % j == 0){
                    primo++;
                }
            }
            if (primo == 2){
                System.out.println("\t" + i + " é primo!");				
            }primo = 0;
        }
    }
}
