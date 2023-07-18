package aulas10;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 17/07/2023
*/
public class ClasseA10Controle {
    Scanner leitor = new Scanner(System.in);
    int tecla=0;
    
    //Classe1 cl1 = new Classe1();
    Classe2 cl2 = new Classe2();
    Classe3 cl3 = new Classe3();
  //Classe10bf clbf = new Classe10bf();
    
    public void leituraControle(){
        while (tecla !=2){
            System.out.print(""
                + "\n\t[X] Menu Aula 10"
                + "\n\t[1] Exemplo 1"
                + "\n\t[2] Exemplo 2"
                + "\n\t[3] Exemplo 3"
                + "\n\t[0] Finalizar a Aula"
                + "\n\titem: ");
            tecla = leitor.nextInt();
            switch (tecla){
            case 1:
                Classe1.calcular();
                Classe1.exibir();
            break;
            case 2:
                cl2.ler();
                cl2.exibir();
            break;
            case 3:
                cl3.ler();
                cl3.calcular();
                cl3.exibir();
            break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
            break;
            }
        }
    }
}
