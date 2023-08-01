/* Faça uma classe que armazene os seguintes vetores:
 * lista de nomes[], de idades[], salarios[] e novoSal[]. 
 * Depos crie um FOR para processar e exibir os vetores:
 * nomes[], salarios[], idades[] e novoSal[].
 * Este último deverá conter o calculo de 15% do salario para pessoas
 * com mais de 18 anos e 8% para pessoas com menos de 18 anos.*/
package aulas14;

import java.util.Scanner;

/*
 * @author Tiago de Freitas
 * Data: 01/08/2023
 */
public class Classe3 {
    
    private String[] nome = new String[5];
    private int[] ida = new int[5];
    private double[] sal = new double[5];
    private int linha = -1;
    private int maior = 18;
    
    public void armazenar(Scanner leitor) {
        for (int i = 0; i < 5; ++i) {
            linha += 1; // criando uma nova linha
            System.out.print("\tDigite o nome - idade - salário: ");
            nome[linha] = leitor.next();
            ida[linha] = leitor.nextInt();
            sal[linha] = leitor.nextDouble();
        }
    }
    
    public void mostrar() {
        System.out.println();
        double aux = 0;
        for (int i = 0; i <= linha; i++){
            if (i < maior) {
                aux = sal[i] * 1.08; // aumento de 8%
            }
            if (i >= maior) {
              aux = sal[i] * 1.15; // aumento de 15%  
            }
            System.out.print(""
                    + "\tNome: " + nome[i]
                    + " - Idade - " + ida[i]
                    + " - Salário Inicial R$ " + String.format("%.2f", sal[i])
                    + " - Salário Reajustado R$: " + String.format("%.2f", aux));
                    System.out.println();
        }
    }
}
