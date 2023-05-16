/* b) Faça Código da fórmula de Bhaskara (Equação do 2Grau) Lógica:
    Ler os coeficientes A, B, C de uma equação do segundo grau onde;
*(A, B e C devem ser diferentes de zero);
*Não precisa usar "while"(somente IF ELSE) e "A deve ser diferente de 0";
*Calcular o Delta=(B * B - 4 * A * C);
*SE o Delta for positivo calcule também as raízes
    X1 = -b + raiz(delta)/2*a , x2 = -b - raiz (delta) / 2*a, 
*SENÃO SE o Delta for negativo, mostre a mensagem:
    “Sem solução no conjunto dos números Reais!”;
*Ao final mostre A,B,C e Delta na tela:
    SE Delta for maior ou igual a zero, mostre X1 e X2 também;
*Faça um menu com opções:
    1 Ler, 2 Calcular, 3 Exibir e 4 Finalizar execução
*Use Select Case e o comando dowhile  
    (Ler/exibir com Scanner ou JOptionPane, pode escolher) */
package aula4;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassTarefaA4_T2 {
    
    public double A, B, C, Delta, RaizA, RaizB;
    public String saida;
    
     //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        do {
            System.out.print(""
                + "\n\t>>>Bháskara<<<\n"
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

        Delta = Math.pow(B, 2) - 4 * A * C;
        RaizA = (-B + Math.sqrt(Delta)) / (2 * A);
        RaizB = (-B - Math.sqrt(Delta)) / (2 * A);
    }
    
    //Método exibir
    public void exibir(){
        if (Delta >= 0 ){
            System.out.print ("\n\tDelta" + String.format(" = %.2f", Delta));
            System.out.print ("\n\tRaizA" + String.format(" = %.2f",RaizA));
            System.out.print ("\n\tRaizB" + String.format(" = %.2f",RaizB));
            System.out.println();
        }else{
            System.out.print("\n\tSem solução no conjunto dos números Reais!");
            System.out.println();
        }
    }
}