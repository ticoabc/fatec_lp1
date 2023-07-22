package aulas11;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class ClasseA11Controle {
    Scanner leitor = new Scanner(System.in);
    double a, b;
    int tecla=0;
    
    Classe1 cla1 = new Classe1();
    Classe2 cla2 = new Classe2();
    Classe3 cla3 = new Classe3();
    ClasseTarefaA cla4 = new ClasseTarefaA();
    ClasseTarefaB cla5 = new ClasseTarefaB();
    ClasseTarefaBfilha cla6 = new ClasseTarefaBfilha();
    
    public void leituraControle(){
        while (tecla !=2){
            System.out.print(""
                + "\n\t[X] Menu Aula 11"
                + "\n\t[1] Exemplo 1 - ContaZeros"
                + "\n\t[2] Exemplo 2 - SomaPares"
                + "\n\t[3] Exemplo 3 - Salários"
                + "\n\t[4] Tarefa A - Média de Salários"
                + "\n\t[5] Tarefa B - Maior e Menor Salário"
                + "\n\t[0] Finalizar a Aula"
                + "\n\titem: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
                cla1.entrada(leitor);
            break;
            case 2:
                cla2.entrada(leitor);
            break;
            case 3:
                cla3.salarios(leitor);
                cla3.salarios(leitor);
                cla3.salarios(leitor);
                cla3.salarios(leitor);
                cla3.exibir();
            break;
            case 4:
                cla4.leitura(leitor);
            break;
            case 5:
                cla6.leitura(leitor);
            break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
            break;
            }
        }
    }
}
