/*Faça a tabela de simulação do void executar( ) e da 
função somapar( ), depois execute normalmente sem herança.*/
package aulas11;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class Classe2 {

    protected double somapar(double inicio, double fim) {
        int somapares = 0;
        while (inicio <= fim) {
            if (inicio % 2 == 0) {
                somapares += inicio;
            }
            inicio++;
        }
        return somapares;
    }
    
    public void entrada(Scanner leitor) {
        System.out.print("\n\tDigite o 1º Número: ");
        double a = leitor.nextDouble();
        System.out.print("\tDigite o 2º Número: ");
        double b = leitor.nextDouble();
        
        double pares = somapar(a, b);
        System.out.println("\tSoma de números pares: " + pares);
    }
    
//    public void saida(double inicio, double fim) {
//        double pares = somapar(inicio, fim);
//        System.out.println("\n\tSoma de números pares: " + pares);
//    }
}
