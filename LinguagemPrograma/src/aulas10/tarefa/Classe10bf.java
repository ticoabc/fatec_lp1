/* */
package aulas10.tarefa;

import aulas10.tarefa.Classe10b;
import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 17/07/2023
*/
public class Classe10bf extends Classe10b{
    
    public double saldo = 0;
    public double qtprest = 0;
    
    public double media(){
        return saldo / qtprest; 
    }
    
    public void exibirPrestacao(){
        System.out.print("\n>>> Valor da Prestação.: " +
                        String.format("R$ %.2f", valor));
        System.out.print("\n>>> Total de Dias em Atraso: " + dias);
        System.out.print("\n>>> Valor Total Multa: " +
                        String.format("R$ %.2f", multa()));
        System.out.print("\n>>> Valor Total Juros: " + 
                        String.format("R$%.2f", juros()));
        System.out.print("\n>>> Valor Final a Pagar: " +
                        String.format("R$ %.2f", apagar()));
        System.out.println();
    }

    public void exibirSaldos() {
        System.out.print("\n>>> Saldo Total.: " + 
                    String.format("R$%.2f", saldo));
        System.out.print("\n>>> Quantidade de Prestações: " + qtprest);
        System.out.print("\n>>> Saldo Médio: " + 
                    String.format("R$%.2f", media()));
        System.out.println(); 
    }
    
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        Classe10bf clbf = new Classe10bf();
        
        int tecla = 0;
        while (tecla != 4){
            System.out.print("\n");
            System.out.print("\nTarefa Aula 10");
            System.out.print("\n[1] Leitura"
                           + "\n[2] Exibir"
                           + "\n[3] Saldo e Média"
                           + "\n[4] Sair"
                           + "\n Item: ");
            tecla = leitor.nextInt();
            switch (tecla) {
                case 1:
                    clbf.saldo += clbf.lerValorOper(leitor);
                    clbf.qtprest++;
                break;
                case 2:
                    clbf.exibirPrestacao();
                break;
                case 3:
                    clbf.exibirSaldos();
                break;
                case 4:
                    System.out.print("\n>>>Programa Finalizado!\n");
                    System.exit(0);
                break;
            }
        }
    }
}
