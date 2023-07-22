package aulas11;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class ClasseTarefaBfilha extends ClasseTarefaB{
   
    public void leitura(Scanner leitor) {
        int tecla = 0;
        while (tecla != 4) {
            System.out.print( "\n\t[6] Leitura"
                            + "\n\t[7] Saldo e Média"
                            + "\n\t[0] Sair"
                            + "\n\t[-] Item: ");
            tecla = leitor.nextInt();
            switch (tecla) {
            case 6:
                LerIdade(leitor);
            break;
            case 7:
                exibirSaldos();
            break;
            case 0:
                System.out.println("\n\tPrograma Finalizado!\n");
                System.exit(0);
            break;
            }
        }
    }
    
    public void exibirSaldos() {
        System.out.print("\n\tQuantidade de Pessoas 18<: " + this.cont1);
        System.out.print("\n\tSalario medio Pessoas 18<: " + this.media1);
        System.out.print("\n\tQuantidade de Pessoas >18: " + this.cont2);
        System.out.printf("\n\tSalario medio Pessoas >18: " + String.format("%.2f", this.media2));
        System.out.printf("\n\tMedia total de todos salarios: " + String.format("%.2f", this.media1 + this.media2));
        System.out.print("\n");
    }
}
