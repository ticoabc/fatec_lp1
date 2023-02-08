/*

 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassVetExercicio_3 {    
    
    static int n;
    static String[] nome = new String[n];
    static double[] preco = new double[n];
    static int linha = -1;
    
    public static void armazenar(Scanner leitor){

        for (int i = 0; i < n; i++){
            linha += 1; // criando uma nova linha
            System.out.print("\nDigite o nome e preço: ");
            nome[linha] = leitor.next();
            preco[linha] = leitor.nextDouble();
        }
        
        double soma = 0;
            for (int i = 0; i < n; i++){
                soma += n;
            }
    }
    
    public static void mostrar() {
        
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
