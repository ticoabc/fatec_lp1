/* Ler os lados A, B e C de um triângulo, compará-los para depois
identificar e informar o TIPO do triângulo “equilátero”, “escaleno” 
ou “isósceles”. */
package aula4;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA4_2 {
    
    public double A,B,C;
    public String TIPO;
    
    //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        do {
            System.out.print(""
                + "\t>>>Tipos de Triângulo<<<\n"
                + "\t1 - Ler, calcular e exibir"
                + "\n\t2 - Sair"
                + "\n\tItem: ");
        tecla = leitor.nextInt();//Lê INT e converte p/ CHAR
            switch (tecla) {
                case 1:
                entrada();
                calcular();
                exibir();
                break;
                
                case 2:
                System.out.print("\n\tPrograma Finalizado!\n");
                System.exit(0);
                break;
            }
        }while (tecla != 2);
    }

    //Método entrada de dados
    public void entrada() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\tDigite lados A, B e C: ");
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
    }
    
    //Método calcular
    public void calcular(){
        if (A == B && B == C)
            TIPO = "\tTriângulo - Equilátero!\n";
        else if (A != B && A != C && B != C)
            TIPO = "\tTriângulo - Escaleno!\n";
        else
            TIPO = "\tTriângulo - Isósceles!\n";
    }
    
    //Método exibir
    public void exibir(){
        System.out.print(TIPO);
        System.out.print("\n");
    }
}
