package aulas14;

import java.util.Scanner;

/**
 * @author Tiago de Freitas
 * Data: 31/07/2023
 */
public class ClasseA14Controle {
    
    Scanner leitor = new Scanner(System.in);
    Classe1 cla1 = new Classe1();
    Classe2 cla2 = new Classe2();
    Classe3 cla3 = new Classe3();
    
    int tecla=0;    
    public void leituraControle(){
        while (true){
//          System.out.println();
            System.out.print(""
                    + "\n\t[X] Menu Aula 14"
                    + "\n\t[1] Exemplo 1 - Vetor de forma explícita"
                    + "\n\t[2] Exemplo 2 - Vetores não Explícitos (Necessário leitura)"
                    + "\n\t[3] Tarefa - (Necessário leitura)"
                    + "\n\t[0] Finalizar a Aula"
                    + "\n\t[-] item: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
                cla1.Classe1();
            break;
            case 2:
                cla2.entrada(leitor);
                cla2.saida();
            break;
            case 3:
                cla3.armazenar(leitor);
                cla3.mostrar();
            break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
            break;
            }
        }
    }
}
