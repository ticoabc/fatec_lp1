/* */
package aula6;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class Aula6Principal {

    Scanner leitor = new Scanner(System.in);
    int item = 0;
    
    ClassExemploA6_1 media = new ClassExemploA6_1();
    
    public void leitura() {
        while (true) {
            System.out.print(""
                    + "\n\t1 Calcular Média"
                    + "\n\t2 Calcular Área"
                    + "\n\t3 Sair"
                    + "\n\tItem: ");
            item = leitor.nextInt();
            switch (item) {
                case 1:
                    media.ler(leitor);
                    System.out.print("\tMédia: " + media.getMedia()+"\n");
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("\nPrograma Finalizado!");
                    System.exit(0);
                    break;
            }
        }
    }
}
