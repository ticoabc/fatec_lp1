package aula9.tarefa;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class Pessoa extends Cliente{
    
    Scanner leitor = new Scanner(System.in);
    
    public String tipof; //Pessoa Física
    public double cpf;
    public double rg;
    public double idade;
    public double salario;

    public Pessoa() { }

    public Pessoa(String tipo, double telefone, String tipof, double cpf, double rg, double idade, double salario) {
        super(tipo, telefone);
        this.tipof = tipof;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String tipof, double cpf, double rg, double idade, double salario) {
        this.tipof = tipof;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.salario = salario;
    }
    
    public void entrada(Scanner leitor) {
		
        System.out.print("informe o CPF: ");
        cpf = leitor.nextDouble();

        System.out.print("informe o RG: ");
        rg = leitor.nextDouble();

        System.out.print("informe o Idade: ");
        idade = leitor.nextDouble();

        System.out.print("informe o Salário: ");
        salario = leitor.nextDouble();
    }
    
    public void saida(Scanner leitor) {
		
        System.out.print("O CPF digitado é: " + String.format("%.0f", cpf));
        System.out.print("\nO RG digitado é: " + String.format("%.0f", rg));
        System.out.print("\nO Idade digitada é: " + String.format("%.0f", idade));
        System.out.print("\nO Salário digitado é: " + String.format("%.0f", salario));
    }  
}