/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) A área do triângulo retângulo que tem A por base e C por altura. 
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClasseTriangulo {
    
    public double a;
    public double b;
    public double c;
    public double at;
    
     //Método leitura
    public void leitura(){
        Scanner leitor = new Scanner(System.in);
        
        //System.out.print("Digite o dados: ");
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        //c = leitor.nextDouble();
    }
    
    //Método calcular
    public void calcular(){
        at = (b * a) / 2;
       // Math.sqrt((at - a) * (at - b) * (at - c));
    }
    
    //Método exibir
    public void exibir(){
        System.out.println("Resultado: ");
        System.out.println("***Área do Triângulo - Ret***");
        System.out.println(at);
    }
}
