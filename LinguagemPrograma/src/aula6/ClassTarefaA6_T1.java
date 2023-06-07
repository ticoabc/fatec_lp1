/*1 - Lendo a altura e o sexo (forma: 1:feminino 2:masculino), 
faça um programa, calcule e exiba o peso ideal.
formula para homens: PESOIDEAL = (72.7 * Altura) – 58
fórmula para mulheres: PESOIDEAL = (62.1 * Altura) – 44.7*/
package aula6;

import java.util.Scanner;

/**
 * 07/06/2023
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA6_T1 {

    public double H;
    public int N;

    public void entrada(Scanner leitor) {
        System.out.print("\n\tTecla 1 = M - 2 = F: ");
        N = leitor.nextInt();
        System.out.print("\tDigite a Altura: ");
        H = leitor.nextDouble();
    }
    
    public double peso(){
        double peso = 0;
        if(N==1){
            peso = (72.7 * H) - 58 ;
            System.out.print("\tO Peso será: " 
                    + String.format("%.2f",peso) + "\n");
        }
        else if(N==2){
            peso = (62.1 *H ) - 44.7;
            System.out.print("\tO Peso será: " 
                    + String.format("%.2f",peso) + "\n");
        }
        return peso;
    }
}
