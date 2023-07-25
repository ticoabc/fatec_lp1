package aulas12;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 24/07/2023
 */
public class ClasseA12Controle {
    
    Scanner leitor = new Scanner(System.in);
    double a, b;
    int tecla=0;
    
    Classe1 cla1 = new Classe1();
    Classe2 cla2 = new Classe2();
    Classe3 cla3 = new Classe3();
    Classe4 cla4 = new Classe4();
    Classe5 cla5 = new Classe5();
    
    public void leituraControle(){
        while (true){
            System.out.print(""
                + "\n\t[X] Menu Aula 12"
                + "\n\t[1] Tabuada"
                + "\n\t[2] Não Divisível por 3"
                + "\n\t[3] Números Divisíveis por 3 e 4"
                + "\n\t[4] Tarefa 1"
                + "\n\t[5] Tarefa 2"
                + "\n\t[0] Finalizar a Aula"
                + "\n\titem: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
                cla1.executar(leitor);
            break;
            case 2:
                System.out.print("\n\tNúmeros NÃO divisiveis por 3");
                cla2.nãoDivisiveispor3(leitor);                
            break;
            case 3:
                System.out.print("\n\t"
                        + "Soma dos números divisiveis por 3 e 4");
                cla3.numDivisiveispor3e4(leitor);
            break;
            case 4:
                cla4.get_soma(leitor);
                cla4.exibir();
            break;
            case 5:
                cla5.get_fat(leitor);
            break;
            case 0:
            System.out.println("\n\tO programa será finalizado!");
            System.exit(0);
            break;
            }
        }
    }    
}
