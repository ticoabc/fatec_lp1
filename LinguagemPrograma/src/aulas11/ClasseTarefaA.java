
package aulas11;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class ClasseTarefaA {
    
    String sexo;
    public double cont = 0, cont1 = 0, cont2 = 0;
    public double salario, salario1, salario2;
    public double media1 = 0, media2 = 0;
    public double saldo1 = 0, saldo2 = 0, saldot = 0;
    
    public void leitura(Scanner leitor) {
        int tecla = 0;
        while (tecla != 4) {
        System.out.print( "\n\t[5] Leitura"
                        + "\n\t[6] Saldo e Média"
                        + "\n\t[0] Sair"
                        + "\n\t[-] Item: ");
            tecla = leitor.nextInt();
            switch (tecla) {
            case 5:
                 LerSexo(leitor);
            break;
            case 6:
                exibirSaldos();
            break;
            case 0:
                System.out.print("\n\tPrograma Finalizado!\n");
                System.exit(0);
            break;
            }
        }
    }
    
    public void LerSexo(Scanner leitor){
        System.out.println();
        System.out.print("\tSexo [M] para Masculino e [F] Para feminino: ");
        sexo = leitor.next();
        
        if ("f".equalsIgnoreCase(sexo) || "m".equalsIgnoreCase(sexo)){
            if ("f".equalsIgnoreCase(sexo)) {
                cont1++;
                System.out.print("\tDigite o Salário: ");
                salario = leitor.nextDouble();			
                saldo1 += salario; // acumula o somatório de salários
                media1 = saldo1 / cont1; // calcula a médiaacumulada dos salários
            }
            if ("m".equalsIgnoreCase(sexo)){
                cont2++;
                System.out.print("\tDigite o Salário: ");
                salario = leitor.nextDouble();			
                saldo2 += salario; // acumula o somatório de salários
                media2 = saldo2 / cont2; // calcula a média acumulada dos salários
            }
        }else 
            System.out.print("\tSexo inválido, digite novamente!\n");
    }
    
    public void exibirSaldos() {
        System.out.print("\n\tQuantidade de homens: " + cont1);
        System.out.print("\n\tQuantidade de mulheres: " + cont2);
        System.out.printf("\n\tSalario medio mulheres: %.2f", media2);
        System.out.printf("\n\tSalario medio homens: %.2f", media1);
        System.out.printf("\n\tMedia total de todoso salarios: %.2f" + (media1 + media2));
        System.out.println();
    }
}