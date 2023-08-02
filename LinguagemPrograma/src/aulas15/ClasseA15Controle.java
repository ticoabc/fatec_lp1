package aulas15;

import java.util.Scanner;
/**
 * @author Tiago de Freitas 
 * Data: 02/08/2023
 */
public class ClasseA15Controle {
    
    Classe1 cla1 = new Classe1();
    Classe2 cla2 = new Classe2();
    
    int tecla = 0;

    public void leituraControle(Scanner leitor) {
        while (true) {
            System.out.print(""
                    + "\n\t[X] Menu Aula 15"
                    + "\n\t[1] Exemplo 1 - maior valor e o menor valor"
                    + "\n\t[2] Tarefa - (Necessário leitura)"
                    + "\n\t[0] Finalizar a Aula"
                    + "\n\t[-] item: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
                cla1.maiorMenor();
            break;
            case 2:
                cla2.menuTarefa(leitor);
            break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
            break;
            }
        }
    }
}
