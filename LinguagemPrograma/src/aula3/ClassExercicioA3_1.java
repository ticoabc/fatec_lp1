/*
Faremos esta classe para demonstrar o uso de desvio ( IF ) e da classe
Math, para calcular o imc de uma pessoa. Leia o nome, peso e altura do
indivíduo, depois exiba uma mensagem exibindo a situação do peso em
relação ao imc conforme a tabela abaixo:

Formula: IMC = peso / altura * altura
IMC menor que 18,5 exibir “Abaixo do peso”
IMC entre 18,5 e 24,9 exibir “Peso normal”
IMC acima de 25 exibir “ tá com Sobrepeso”

 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassExercicioA3_1 {
    
    String nome;
    public double peso, altura, imc;

     //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\tFormula: IMC = peso / altura * altura\n" +
                        "\tIMC menor que 18,5 exibir “Abaixo do peso”\n" +
                        "\tIMC entre 18,5 e 24,9 exibir “Peso normal”\n" +
                        "\tIMC acima de 25 exibir “ tá com Sobrepeso”\n\n");
        
        System.out.print("\tDigite seu nome: ");
        nome = leitor.next();
        
        System.out.print("\tDigite seu peso: ");
        peso = leitor.nextDouble();
        
        System.out.print("\tDigite sua altura: ");
        altura = leitor.nextDouble();

    }
    
    //Método calcular
    public void calcular(){        
        imc = peso / Math.pow(altura, 2);
    }
    
    //Método exibir
    public void exibir(){
        if(imc < 18.5){
            System.out.printf("\n\tIMC: %.2f%n", imc);
            System.out.print("\tVocê está abaixo do peso\n");
        }else if (imc > 18.5 && imc < 24.9){
            System.out.printf("\n\tIMC: %.2f%n", imc);
            System.out.print("\tVocê está com peso normal\n");
        }else if(imc > 25){
            System.out.printf("\n\tIMC: %.2f%n", imc);
            System.out.print("\tVocê está com Sobrepeso\n");
        }
    }
}
