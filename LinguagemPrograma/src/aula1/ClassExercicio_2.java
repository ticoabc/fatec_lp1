/*
Para vários tributos, a base de cálculo é o salário mínimo. 
    Fazer um programa que leia o valor do salário mínimo e o valor do salário de uma pessoa. 
        Calcular e mostrar quantos salários mínimos ela ganha.
1)	Salário = 0, Base = 1100, mínimos =0
2)	Sálario
3)	mínimos = salario / base
4)	Quantidade
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassExercicio_2 {
    public double salario;
    public double quantidade;
    final double base = 1302;//Ano - 2023
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nCalcular e mostrar quantos salários mínimos");
        
        System.out.print("\nDigite o Salário R$: ");
        salario = leitor.nextDouble();
    }
    
    //Método calcular
    public void calcular(){
       quantidade = salario / base; 
    }
    
    //Método exibir
    public void exibir(){
        System.out.printf("\nSalário atual R$: " + salario);
        System.out.printf("\nSalário base  R$: " + base);
        System.out.printf("\nQuantidade de Mínimos:  %.2f%n", quantidade);
    }    
}
