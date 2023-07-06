/* */
package aula8;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassControle{
    Scanner leitor = new Scanner(System.in);
    double a, b, c; int tecla=0;
    
    ClassBascara bsk = new ClassBascara();
    ClasseA cla = new ClasseA();
    ClasseB clb = new ClasseB();
    ClasseC clc = new ClasseC();
    
    public void leituraControle(){
    while (tecla !=2){
        System.out.print(""
                + "\n\t[X] Menu Aula 8"
                + "\n\t[1] Exemplo Báskara"
                + "\n\t[2] Tarefa A"
                + "\n\t[3] Tarefa B"
                + "\n\t[4] Tarefa C"
                + "\n\t[0] Finalizar a Aula"
                + "\n\titem: ");
        tecla = leitor.nextInt();
        switch (tecla){
            case 1:
                System.out.print("\n\tDigite A: ");
                a = leitor.nextDouble();
                System.out.print("\tDigite B: ");
                b = leitor.nextDouble();
                System.out.print("\tDigite C: ");
                c = leitor.nextDouble();
                if (a == 0){
                    System.out.println("\n\tErro!'A' deve ser diferente de zero!\n");
                    System.out.println();
                }
                bsk.ler_A(a);
                bsk.ler_B(b);
                bsk.ler_C(c);
                bsk.exibir();
                break;
                
            case 2:
                cla.leituraA();
                cla.exibirA();
                break;
                
            case 3:
                clb.leituraB();
                clb.exibirB();
                break;
                
            case 4:
                clc.leituraC();
                clc.exibirC();
                break;
                
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
                break;
            }// Fim do Switch
        }// Fim do While
    }
}
