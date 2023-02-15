/*
b. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar
o número lido como sendo um valor positivo, ou seja, o programa deverá
apresentar o módulo de um número fornecido. Lembre-se de verificar se o 
número fornecido é menor que zero; sendo, multiplique-o por -1
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA3_2 {
    
    public double Num, Mod;
    public String saida;
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um Número : ");
        Num = leitor.nextDouble();        
    }
    
    //Método calcular
    public void calcular(){
        
        if (Num > 0) {
            exibir(); 
        }else {
            Mod = Num * (- 1 ); 
        }        
    }
    
    //Método exibir
    public void exibir(){
        
        saida = "\nNúmero digitado: " + Num;
        saida += "\nSeu Módulo será: " + String.format("= %.2f", Mod);
        System.out.println(saida);
        System.out.println(); 
        
    }    
}
