/*
Em uma época de pouco dinheiro, os comerciantes estão procurando aumentar
    suas vendas oferecendo desconto. Faça um programa que possa entrar 
        com o nome de um produto e seu valor unitário e calcular e exibir
            um novo valor com um desconto de 9%.

1)	Nome, Valor = 0, reajuste = 0,09
2)	Produto, valor
3)	novo = sal - (sal * reajuste)
4)	Valor Reajustado
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassExercicio_1 {

    String produto_nome;
    double valor_novo;
    float valor_inicial;
    final double reajuste = 0.09;

    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);        
        System.out.print("\nCálculo de produto com desconto");
        
        System.out.print("\nDigite o nome do Produto: ");
        produto_nome = leitor.next();
        
        System.out.print("Digite o Valor R$: ");
        valor_inicial = leitor.nextFloat();
    }
    
    //Método calcular
    public void calcular(){
        valor_novo = valor_inicial - (valor_inicial * reajuste);
    }
    
    //Método exibir
    public void exibir(){
        System.out.println("\nValor atual R$: " + valor_inicial);
        System.out.println("Desconto de 9%");
        System.out.println("Valor reajustado R$: " + valor_novo);
    }
}
