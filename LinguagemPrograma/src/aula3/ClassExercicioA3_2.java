/*
Exercício do Livro - Java para Iniciantes da ORACLE
 */
package aula3;

import java.util.Scanner;
/*@author Tiago de Freitas*/
public class ClassExercicioA3_2 {
    
    final double constante = 3.7854;
    public double gallons, liters;
    
    
     //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\n\tExercício do Livro - Java para Iniciantes da ORACLE");
        System.out.print("\n\tDigite a quantidade de Gallons: ");
        gallons = leitor.nextDouble();
    }
    
    //Método calcular
    public void calcular(){        
        liters = gallons * constante;
    }
    
    //Método exibir
    public void exibir(){        
        System.out.printf("\tA quantidade de Liters: %.2f%n\n", liters);        
    }    
}
