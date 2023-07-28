
package aulas13;

import java.util.Scanner;

/**
 * @author Tiago de Freitas
 * Data: 27/07/2023
 */
public class Classe5 extends Classe4{
    
    Classe4 trf = new Classe4();
    
    public void leitura(Scanner leitor) {
        int tecla = 0;
	while (true) {
            System.out.print(""
                            +"\n\t[X] Menu Tarefa"
                            +"\n\t[1] Ler um número inteiro positivo N"
                            +"\n\t[2] Calcular o fatorial de N"
                            +"\n\t[3] Calcular o somatório dos números primos de 1 até N"
                            +"\n\t[4] Exibir os números primos de 1 até N"
                            +"\n\t[5] Finalizar"
                            +"\n\t[-]Digite a operação desejada: ");
            tecla = leitor.nextInt();
            switch (tecla){
                case 1:
                    trf.entrada(leitor);
                    break;
                case 2:
                    trf.fatorial();
                    break;
                case 3:
                    trf.somaPrimo();
                    break;
                case 4:
                    trf.exibePrimos();
                    break;
                case 5:
                    System.out.println("\n\tPrograma Finalizado!\n");
                    System.exit(0);
                    break;                
            }
        }
    }
}
