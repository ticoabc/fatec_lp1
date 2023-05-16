/* Ler notas e faltas, calcular e exibir a média geométrica para 
identificar e exibir o status do aluno, “Aprovado” ou “Reprovado”. 
O aluno será reprovado se a média for menor que 6 ou faltas for 
maior que 20 */
package aula4;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA4_1 {
    
    public double N1, N2, MG, F;
    
    //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        do {
            System.out.print(""
                    + "\n\tMenu"
                    + "\n\t1 Ler, calcular e exibir"
                    + "\n\t2 sair"
                    + "\n\tItem: ");
            tecla = leitor.nextInt();//Lê INT e converte p/ CHAR
            switch (tecla) {
                case 1:
                    entrada();
                    calcular();
                    exibir();
                    break;
                case 2:
                    System.out.print("\n\tProgr. Finalizado!\n");
                    System.exit(0);
                    break;
            }
        } while (tecla != 2);
    }

    //Método entrada de dados
    public void entrada() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\n\tDigite 1ª nota: ");
        N1 = leitor.nextDouble();
        System.out.print("\tDigite 2ª nota: ");
        N2 = leitor.nextDouble();
        System.out.print("\tDigite qtd de faltas: ");
        F = leitor.nextDouble();
    }
    
    //Método calcular
    public void calcular(){
        MG = Math.sqrt(N1 * N2); }
    
    //Método exibir
    public void exibir(){
        if (MG < 6 || F > 20) {
            System.out.printf("\n\tReprovado!\n\tMédia %.2f%n", MG, "\n\tFaltas " + F);
        } else {
            System.out.printf("\n\tAprovado!\n\tMédia %.2f%n", MG, "\n\tFaltas " + F);
        }
    }
}
