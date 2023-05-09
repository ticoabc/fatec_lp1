/*
Faça um classe que contenha os ATRIBUTOS: hipotenusa,
CatetoA e CatetoB; A classe deverá conter um método para ler os catetos,
um método para calcular a hipotenusa e um método para exibir os atributos
lidos e calculados

Hipotenusa double
CatetoA double
CatetoB double
Saida String
lerCatetos() void
calcularHipotenusa() void
exibirTudo() void

 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassExercicioA3_3 {
    
    // atributos
    public double CatetoA, CatetoB, Hipotenusa;
    public String saida;
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\n\tCalcular a Hipotenusa");
        System.out.print("\tDigite os catetos A: ");
        CatetoA = leitor.nextDouble();
        System.out.print("\n\tDigite os catetos B: ");
        CatetoB = leitor.nextDouble();
        
    }
    
    //Método calcular
    public void calcular(){
        
        Hipotenusa = Math.sqrt(Math.pow(CatetoA,2) + Math.pow(CatetoB,2) );
    }
    
    //Método exibir
    public void exibir(){
        
        saida = "\n\tCatetoA: " + CatetoA;
        saida += "\n\tCatetoB: " + CatetoB;
        saida += "\n\tHipotenusa: " + String.format("= %.2f", Hipotenusa);
        System.out.println(saida );
        System.out.println(); 
        
    }    
}
