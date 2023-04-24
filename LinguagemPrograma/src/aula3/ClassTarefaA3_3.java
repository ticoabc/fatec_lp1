/*
Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo 
da equação completa de segundo grau, apresentando as duas raízes, se para os
valores informados for possível efetuar o referido cálculo. 
Lembre-se de que a variável A deve ser diferente de zero.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA3_3 {
    
    public double NumA, NumB, NumC, Delta, RaizA, RaizB;
    String saida;
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Equação completa de segundo grau");
        System.out.print("Digite o Número A: ");
        NumA = leitor.nextDouble();
        System.out.print("Digite o Número B: ");
        NumB = leitor.nextDouble();
        System.out.print("Digite o Número C: ");
        NumC = leitor.nextDouble();
    }
    
    public void calcular() {
        
        Delta = Math.pow(NumB, 2) - 4 * NumA * NumC;
        RaizA = (-NumB + Math.sqrt(Delta)) / (2 * NumA);
        RaizB = (-NumB - Math.sqrt(Delta)) / (2 * NumA);
    }
    
    public void exibir() {
        saida = saida + "\n\tA" + String.format(" = %.2f",RaizA);
        saida = saida + "\n\tB" + String.format(" = %.2f",RaizB);
        saida = saida + "\n\tDelta" + String.format(" = %.2f", Delta);
        System.out.println(saida);
        System.out.println();
     }   
}
