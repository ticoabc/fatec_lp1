package aula9.tarefa;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class Empresa extends Cliente{
    Scanner leitor = new Scanner(System.in);
    
    String tipoj; //Pessoa Juridica
    public double cnpj;

    public Empresa() { }

    public Empresa(String tipo, double telefone){
        super(tipo, telefone);
    }

    public Empresa(String tipoj, double cnpj, String tipo, double telefone) {
        super(tipo, telefone);
        this.tipoj = tipoj;
        this.cnpj = cnpj;
    }
    
    public void entrada(Scanner leitor) {
        System.out.print("Informe o CNPJ: ");
        cnpj = leitor.nextDouble();
    }
    
    public void saida(Scanner leitor) {
        System.out.print("O CNPJ digitado é: " + String.format("%.0f", cnpj));
        System.out.println();
    }   
}