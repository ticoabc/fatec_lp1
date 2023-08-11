package aulas16;

import java.util.Scanner;

/**
 * @author Tiago de Freitas 
 * Data: 09/08/2023
 */
public class ClasseA16Controle {
    
    ClasseA16 cla1 = new ClasseA16();
    
    int tecla = 0;

    public void leituraControle(Scanner leitor) {        
        while (true) {
            System.out.print(""
                    + "\n\t[X] Menu Aula 16"
                    + "\n\t[1] Exemplo 1"
                    + "\n\t[2] Tarefa"
                    + "\n\t[0] Finalizar a Aula"
                    + "\n\t[-] item: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
            break;
            case 2:
            break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
            break;                
            }
        }
    }
}
