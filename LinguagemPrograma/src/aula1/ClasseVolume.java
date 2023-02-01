/*
Montando o Quadro Resumo das 4 partes:
1) Você define todas as variáveis e constantes que deverão ser criadas
volume =0, comprimento = 10, lado =0, altura = 0.
2) Você identifica as variáveis de leitura que deverão ser digitadas pelo usuário
lado, altura
3) Você monta as fórmulas que serão computadas no programa
volume = comprimento * lado * altura
4) Aqui você define as variáveis de saída que serão exibidas ao usuário
volume
*/
package aula1;
/**
 *
 * @author Tiago de Freitas
 */
import java.util.Scanner;
public class ClasseVolume {
    //Atributos
    public double volume;
    public double lado, altura;
    final double comprimento = 10;
    
    //Método leitura
    public void leitura(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o lado: ");
        lado = leitor.nextDouble();
        
        System.out.print("Digite o altura: ");
        altura = leitor.nextDouble();
    }
    
    //Método calcular
    public void calcular(){
        
        volume = comprimento * lado * altura;
        
    }
   
    //Método exibir
    public void exibir(){
        System.out.print("O Volume é: ");
        System.out.print(volume);
        System.out.println();
    }
}
