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
public class ClassTarefaA3_T2 {
    
    public double Num, Mod;
    public String saida;
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\tEfetuar a leitura de um valor inteiro positivo ou negativo e apresentar\n" +
                         "\to número lido como sendo um valor positivo, ou seja, o programa deverá\n" +
                         "\tapresentar o módulo de um número fornecido. Lembre-se de verificar se o \n" +
                         "\tnúmero fornecido é menor que zero; sendo, multiplique-o por -1\n");
        System.out.print("\n\tDigite um Número : ");
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
        
        saida = "\n\tNúmero digitado: " + Num;
        saida += "\n\tSeu Módulo será: " + String.format("= %.2f", Mod);
        System.out.println(saida);
        System.out.println(); 
        
    }    
}
