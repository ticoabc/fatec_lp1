/* Boa prática de programação 2.1
Algumas organizações exigem que todo programa comece com um comentário
que informa o objetivo e o autor dele, a data e a hora em que foi 
modificado pela última vez
*/
package aula6;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class Aula6Principal {

    Scanner leitor = new Scanner(System.in);
    int item = 0;
    
    ClassExemploA6_1 media = new ClassExemploA6_1();
    ClassTarefaA6_T1 peso = new ClassTarefaA6_T1();
    ClassExemploA6_2 areat = new ClassExemploA6_2();
    ClassTarefaA6_T2 tipot = new ClassTarefaA6_T2();
    ClassTarefaA6_T3 angulo = new ClassTarefaA6_T3();
    
    public void leitura() {
        while (true) {
            System.out.print(""
                    + "\n\t1 Calcular Média"
                    + "\n\t2 Calcular Peso ideal"
                    + "\n\t3 Calcular Área do Triângulo"                    
                    + "\n\t4 Calcular Tipo de Triângulo"
                    + "\n\t5 Calcular Ângulo do Triângulo"
                    + "\n\t0 Sair"
                    + "\n\tItem: ");
            item = leitor.nextInt();
            switch (item) {
                case 1:
                    media.ler(leitor);
                    media.getMedia();
                    break;
                case 2:
                    peso.entrada(leitor);
                    peso.peso();
                    break;
                case 3:
                    areat.ler(leitor);
                    areat.getArea();
                    break;               
                case 4:
                    tipot.entrada(leitor);
                    tipot.tipo();
                    tipot.area();
                    break;
                case 5:
                    angulo.entrada(leitor);
                    angulo.exibir();
                    break;
                case 0:
                    System.out.println("\n\tPrograma Finalizado!");
                    System.exit(0);
                    break;
            }
        }
    }
}
