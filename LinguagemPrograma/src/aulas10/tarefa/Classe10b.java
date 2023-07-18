/* */
package aulas10.tarefa;

import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 18/07/2023
*/
public class Classe10b extends Object{
    
    Scanner leitor = new Scanner(System.in);
    public String resp = "s";
    public double valor;
    public int dias;
    public double taxamulta = 0.02;
    public double taxajuros = 0.00033;
    
    public double lerValorOper(Scanner Leitor) {
        System.out.print("Digite o Valor da Prestação: R$ ");
        valor = leitor.nextDouble();
        System.out.print("Digite o Total de Dias em Atraso: ");
        dias = leitor.nextInt();
        return apagar();
    }
    public double multa() {
        return valor * taxamulta;
    }
    
    public double juros() {
        return taxajuros * dias * valor;
    }
    
    public double apagar() {
        return valor + multa() + juros();
    }
}
