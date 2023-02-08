/*

 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassVetExercicio_2 {
    
    static String[] nome = new String[5];
    static double[] ida = new double[5];
    static double[] sal = new double[5];
    static int linha = -1;
    static int maior = 18;
    
    public static void armazenar(Scanner leitor) {
        for (int i = 0; i < 5; ++i) {
            linha += 1; // criando uma nova linha
            System.out.print("\nDigite o nome; idade; salário: ");
            nome[linha] = leitor.next();
            ida[linha] = leitor.nextInt();
            sal[linha] = leitor.nextDouble();
        }
    }
    
    public static void mostrar() {
        double aux = 0;
        for (int i = 0; i <= linha; i++) {
            if (i < maior) {
                aux = sal[i] * 1.08; // aumento de 8%
            }            
            if (i >= maior) {
                aux = sal[i] * 1.15; // aumento de 15%
            }
            System.out.print(
                "\nNome: " + nome[i]
              + " - Idade - " + ida[i]
              + " - Salário Inicial R$ " + String.format("%.1f",sal[i])
              + " - Salário Reajustado R$: " + String.format("%.1f", aux));
            System.out.print("\n");
        }
    }
    
    public static void controle(Scanner leitor) {
        int itemmenu;
        while(true){
            System.out.print("\n>>> Exercicio com Vetores ");
            System.out.print("\n1 Ler\n2 Mostrar\n3 Sair\nitem:");
            itemmenu = leitor.nextInt();
        if(itemmenu == 1){
            armazenar(leitor); // inserir nova linha
        }else if (itemmenu == 2){
            mostrar();
        }else if (itemmenu == 3) {
            break;
            }
        }
    }
}
