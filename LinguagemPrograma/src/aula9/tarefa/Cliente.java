package aula9.tarefa;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class Cliente extends Object{
    
    Scanner leitor = new Scanner(System.in);
	
    public String tipo; //Tipo de Pessoa: Física ou Jurídica
    public double telefone; //Pessoa Física ou Jurídica

    public Cliente() { }

    public Cliente(String tipo, double telefone) {
        this.tipo = new String();// atributo interno
        this.tipo = tipo;
        this.telefone = telefone;
    }
    
    public void entrada(Scanner leitor) {		
        System.out.print("Informe o Telefone: ");
        telefone = leitor.nextDouble();
    }
    
    public void saida(Scanner leitor) {
        System.out.print("O Telefone digitado é: " + String.format("%.0f", telefone));
        System.out.println();
    }
}
