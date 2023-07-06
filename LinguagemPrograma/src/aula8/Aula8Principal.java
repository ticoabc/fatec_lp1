/* Boa prática de programação
Algumas organizações exigem que todo programa comece com um comentário
que informa o objetivo e o autor dele, a data e a hora em que foi 
modificado pela última vez

Aula - 8 Java - Operações com Sub-Rotinas
*/
package aula8;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class Aula8Principal {
    
    Scanner leitor = new Scanner(System.in);
    int item = 0;
    
    ClassControle cntr = new ClassControle();
    //ClassBascara bskr = new ClassBascara();
    
     public void leituraA8() {
        while (true) {
            System.out.print("\n"
                    + "\n\t1 Controle"
                    + "\n\t2 Bascara"
                    + "\n\t3 "
                    + "\n\t4 "
                    + "\n\t5 "
                    + "\n\t0 Sair"
                    + "\n\tItem: ");
            item = leitor.nextInt();
            switch (item) {                
                case 1:
                    cntr.leituraControle();
                    
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                
                case 4:
                break;
                
                case 5:
                break;
                
                case 0:
                    System.out.println("\n\tPrograma Finalizado!");
                    System.exit(0);
                break;
            }
        }
     }
}
