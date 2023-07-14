package aula9.tarefa;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class ExecutaTarefa {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);

        Cliente cli = new Cliente();
        Empresa emp = new Empresa();
        Pessoa pes = new Pessoa();

        int tecla = 0;
        while (tecla != 3) {
        System.out.print("\n");
        System.out.print("Tarefa Aula 9");
        System.out.print("\n[1] Entrada de Dados"
                       + "\n[2] Exibir"
                       + "\n[3] Sair"
                       + "\n Item: ");
        tecla = leitor.nextInt();
            switch (tecla) {
                case 1:
                System.out.print("\nEscolha:"
                               + "\n[4] - Pessoa"
                               + "\n[5] - Empresa"
                               + "\n[6] - Cliente"
                               + "\n Item: ");
                tecla = leitor.nextInt();
                switch (tecla) {
                    case 4:
                        System.out.println("\n>>>>Pessoa Física<<<<");
                        pes.entrada(leitor);
                    break;
                    case 5:
                        System.out.println("\n>>>>Empresa<<<<");
                        emp.entrada(leitor);
                    break;
                    case 6:
                        System.out.println("\n>>>>Cliente<<<<");
                        cli.entrada(leitor);
                    break;
                }
                break;
                case 2:
                    System.out.print("\nEscolha:"
                                   + "\n[4] - Pessoa"
                                   + "\n[5] - Empresa"
                                   + "\n[6] - Cliente"
                                   + "\n Item: ");
                tecla = leitor.nextInt();
                switch (tecla) {
                case 4:
                    System.out.println("\n>>>>Pessoa Física<<<<");
                    pes.saida(leitor);
                break;				
                case 5:
                    System.out.println("\n>>>>Empresa<<<<");
                    emp.saida(leitor);
                break;				
                case 6:
                    System.out.println("\n>>>>Cliente<<<<");
                    cli.saida(leitor);
                break;
                }
                break;
                case 3:
                    System.out.println("\nPrograma Finalizado!\n");
                    System.exit(0);
                break;
            }
        }
    }
}
