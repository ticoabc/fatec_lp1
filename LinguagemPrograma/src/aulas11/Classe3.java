/* Crie a classe com os atributos indicados, o código utiliza o while
do menu para armazenar o maior e menor salário e também a calcula a média
de salarios digitados de uma lista digitada de salários. a) Faça a tabela de
simulação do void salarios ( ), da função somapar ( ), coloque um menu no 
void main ( ), depois execute no IDE normalmente sem herança. 
Classe3 ( Use os valores de entrada: 1500, 2000, 1320, 4000 )*/
package aulas11;

import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class Classe3 {

    double cont = 0, salario, salariomaior = 0,
            salariomenor = 0, media = 0, saldo = 0;
    Scanner leitor = new Scanner(System.in);

    public void salarios(Scanner leitor) {
        System.out.print("\tDigite o Salário: ");
        salario = leitor.nextDouble();
        cont++;
        if (cont == 1) {
            salariomenor = salario;
            salariomaior = salario;
        }
        if (salario < salariomenor)
            salariomenor = salario;
        if (salario > salariomaior)
            salariomaior = salario;
            saldo += salario;
            media = saldo / cont;
    }
    
    public void exibir(){
        System.out.print("\n\tSalário Menor: " + salariomenor);
        System.out.print("\n\tSalário Maior: " + salariomaior);
        System.out.print("\n\tMédia de Salários: " + media);
        System.out.print("\n\tSaldo dos Salários: " + saldo + "\n");
    }
}
