/* a) Altere a ClassExemploA4_2.java, Após a identificação do TIPO do 
triângulo, calcule o Semiperímetro (S) = (A+B+C)/2;
depois calcule a área do triângulo (AR) = RAIZ(S*(S-A)*(S-B)*(S-C));
Ao final, exiba A,B,C,TIPO,S e AR; 
Faça um menu com opções:
1 Ler, 2 Calcular, 3 Exibir e 4 Finalizar execução, use:
Select Case e o comando do while */
package aula4;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassTarefaA4_T1 {
    
    public double A, B, C, S, AR;
    public String TIPO;
    
    //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        do {
            System.out.print(""
                + "\n\t>>>Tipos de Triângulo e Cálculos<<<\n"
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
        
        if (A == B && B == C){
            TIPO = "Triângulo - Equilátero!";
        }else if (A != B && A != C && B != C){
            TIPO = "Triângulo - Escaleno!";
        }else{
            TIPO = "Triângulo - Isósceles!";
        }   S = (A+B+C)/2;
            AR = Math.sqrt((S*(S-A)*(S-B)*(S-C)));
    }
    
    //Método exibir
    public void exibir(){
        System.out.print("\n\tA: " + A);
        System.out.print("\n\tB: " + B);
        System.out.print("\n\tC: " + C);
        System.out.print("\n\t" + TIPO);
        System.out.print("\n\tS: " + S);
        System.out.print("\n\tAR: " + String.format("%.2f", AR) + "\n");
    }    
}
