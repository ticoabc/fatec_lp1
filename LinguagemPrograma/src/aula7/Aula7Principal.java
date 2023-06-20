/* Boa prática de programação 2.1
Algumas organizações exigem que todo programa comece com um comentário
que informa o objetivo e o autor dele, a data e a hora em que foi 
modificado pela última vez

Aula - 7 Java: Escopo, Métodos e Parâmetros
*/
package aula7;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class Aula7Principal {
    
    Scanner leitor = new Scanner(System.in);
    int item = 0;
    
    ClassExemploA7_1 cla71 = new ClassExemploA7_1();
    ClassExemploA7_2 cla72 = new ClassExemploA7_2();
    ClassTarefaI tarl = new ClassTarefaI();
    ClassTarefaJ tar2 = new ClassTarefaJ();
    ClassTarefaL tar3 = new ClassTarefaL();
    
    public void leituraA7() {
        while (true) {
            System.out.print("\n"
                    + "\n\t1 Atributo global e local"
                    + "\n\t2 Método não void ou function"
                    + "\n\t3 Tarefa I - Option Pane"
                    + "\n\t4 Tarefa J - Option Pane"
                    + "\n\t5 Tarefa L - Option Pane"
                    + "\n\t0 Sair"
                    + "\n\tItem: ");
            item = leitor.nextInt();
            switch (item) {
                case 1:                    
                    cla71.listar();
                    cla71.mostrar();
                break;
                case 2:
//                    cla72.lerPres(leitor);
//                    cla72.calcMulta(item);
//                    cla72.mostrar(item, item);
                break;
                case 3:
                    tarl.leitura();
                    tarl.exibição();
                break;
                case 4:
                    tar2.leitura();
                    tar2.exibição();
                break;
                case 5:
                    tar3.leitura();
                    tar3.exibição();
                break;
                case 0:
                    System.out.println("\n\tPrograma Finalizado!");
                    System.exit(0);
                break;
            }
        }
    }
}
