/*
a.Ler dois valores numéricos inteiros e apresentar o resultado da diferença
do maior pelo menor valor.

NumA double
NumB double
Dif double
Saida String

 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA3_T1 {
    
    public double NumA, NumB, Dif;
    public String saida;
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\tLer dois valores numéricos inteiros"
                            + " e apresentar o resultado da diferença\n" +
                                "\t\tdo maior pelo menor valor.\n");
        System.out.print("\n\tDigite o Número A: ");
        NumA = leitor.nextDouble();
        System.out.print("\tDigite o Número B: ");
        NumB = leitor.nextDouble();        
    }
    
    //Método calcular
    public void calcular(){

        if (NumA > NumB) {
            Dif = NumA - NumB;
        }else {
            Dif = NumB - NumA; } 
        }
    
    //Método exibir
    public void exibir(){
        
        saida = "\n\tNúmeroA: " + NumA;
        saida += "\n\tNúmeroB: " + NumB;
        saida += "\n\tDiferença: " + String.format("= %.2f", Dif);
        System.out.println(saida );
        System.out.println();
        
    }
    
}
