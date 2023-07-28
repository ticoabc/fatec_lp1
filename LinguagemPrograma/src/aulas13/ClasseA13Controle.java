package aulas13;

import java.util.Scanner;

/*
* @author Tiago de Freitas
* Data: 27/07/2023
*/
public class ClasseA13Controle {
    
    Scanner leitor = new Scanner(System.in);
    Classe1 cla1 = new Classe1();
    Classe2 cla2 = new Classe2();
    Classe3 cla3 = new Classe3();
    Classe5 cla5 = new Classe5();
    
    int tecla=0;    
    public void leituraControle(){
        while (true){
            System.out.print(""
                + "\n\t[X] Menu Aula 13"
                + "\n\t[1] Exemplo 1 - Acumulador"
                + "\n\t[2] Exemplo 2 - Uso de Mod"
                + "\n\t[3] Exemplo 3 - Número Primo"
                + "\n\t[4] Tarefa"
                + "\n\t[0] Finalizar a Aula"
                + "\n\t[-] item: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
                cla1.acumuladorFor(leitor);
            break;
            case 2:
                cla2.modUse(leitor);
            break;
            case 3:
                cla3.primoNumro(leitor);
            break;
            case 4:
                cla5.leitura(leitor);
            break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
            break;
            }
        }
    }
}
