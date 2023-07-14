package aula9.tarefa2;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class ExecutaTarefa2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Veiculo vel = new Veiculo();
        Carro crr = new Carro();
        
        int tecla = 0;
	while (tecla != 3) {
            System.out.print("\n");
            System.out.print("Tarefa 2 Aula 9");
            System.out.print("\n[1] Entrada de Dados"
                           + "\n[2] Exibir"
                           + "\n[3] Sair"
                           + "\n Item: ");
            tecla = leitor.nextInt();
            switch (tecla) {
                case 1:
                    vel.entrada(leitor);
                    crr.entrada(leitor);
                break;
                case 2:
                    vel.saida(leitor);
                    crr.saida(leitor);
		break;
                case 3:
                    System.out.println("\nPrograma Finalizado!\n");
                    System.exit(0);
		break;
            }
        }        
    }
}