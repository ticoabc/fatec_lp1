/*2 Encontre o TIPO do poligono:
Escreva um programa para ler o número de lados de um polígono
regular e a medida do lado (em cm).
− Caso o número de lados seja inferior a 3 escrever NÃO É UM
POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO
NÃO IDENTIFICADO.
− Se o número de lados for igual a 3 o tipo será “TRIÂNGULO”,
calcule e mostre a área do triângulo heron
− Se o número de lados for igual a 4 o tipo será “QUADRADO”,
calcule e mostre a área do quadrado.
− Se o número de lados for igual a 5 o tipo será “PENTÁGONO”,
calcule e mostre a área do pentágono
 */
package aula6;

import java.util.Scanner;

/**
 * 07/06/2023
 * @author Tiago de Freitas
 */
public class ClassTarefaA6_T2 {

    protected double L, A, a, b, c, d, e;
    protected double p;
    protected String T;
    
    void entrada(Scanner leitor) {
        
        System.out.print("\n\tDigite o N° de Lados: ");
        L = leitor.nextDouble();
        if (L < 3){
            System.out.print("\tNão é um Polígono.");
            System.exit(0);
        }else if (L == 3){
            System.out.print("\tDigite o 1° Lado: ");
            a = leitor.nextDouble();
            System.out.print("\tDigite o 2° Lado: ");
            b = leitor.nextDouble();
            System.out.print("\tDigite o 3° Lado: ");
            c = leitor.nextDouble();
        }else if (L == 4){
            System.out.print("\tInforme a Medida do Lado: ");
            a = leitor.nextDouble();
        }else if (L == 5){
            System.out.print("\tInforme a Medida do 1° Lado: ");
            a = leitor.nextDouble();
            System.out.print("\tInforme a Medida do 2° Lado: ");
            b = leitor.nextDouble();
            System.out.print("\tInforme a Medida do 3° Lado: ");
            c = leitor.nextDouble();
            System.out.print("\tInforme a Medida do 4° Lado: ");
            d = leitor.nextDouble();
            System.out.print("\tInforme a Medida do 5° Lado: ");
            e = leitor.nextDouble();
        }
        if (L > 5){
            System.out.println("\tPolígono não identificado.");
            System.exit(0);
        }
    }
    
    protected double tipo(){
        double identidade = 0;
        if (L == 3){
            T = "\n\t[***TRIÂNGULO***]";
        }
        if (L == 4){
            T = "\n\tQUADRADO.";
        }
        if (L == 5){
            T = "\n\tPENTÁGONO.";
        }
        return identidade;
    }
    
    protected double area(){
        
        double calc = 0;
        if (L == 3){
            p = (a + b + c) / 2;
            calc = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf(T + "\n\tA Área do Triângulo é: "
                    + String.format("%.2f", calc) + "\n");
        }
        if (L == 4){
            calc = Math.pow(a, 2);
            System.out.printf(T + "\n\tA Área do Quadrado é: "
                    + String.format("%.2f", calc) + "\n");
        }
        if (L == 5){
            calc = 1.72 * Math.pow(L,2) ;
            System.out.printf(T + "\n\tA Área do Pentágono é: "+
            String.format("%.2f",calc) + "\n");
        }
        return calc;
    }   
}
