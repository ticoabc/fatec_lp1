package aula9.tarefa2;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class Carro extends Veiculo{
    Scanner leitor = new Scanner(System.in);
	
    public String placa;
    public String cor;
    public double renavam;

    public Carro() { }

    public Carro(String placa, String cor, double renavam) {
        this.placa = placa;
        this.cor = cor;
        this.renavam = renavam;
    }

    public Carro(String placa, String cor, double renavam, String marca, String modelo, double anofab) {
        super(marca, modelo, anofab);
        this.placa = placa;
        this.cor = cor;
        this.renavam = renavam;
    }
    
    public void entrada(Scanner Leitor) {
        System.out.print("informe a Placa:");
        placa = leitor.nextLine();

        System.out.print("informe a Cor: ");
        cor = leitor.nextLine();

        System.out.print("informe o Renavam: ");
        renavam = leitor.nextDouble();		
    }
    
    public void saida() {
        System.out.print("A Placa digitada é: " + placa);
        System.out.print("\nA Cor digitada é: " + cor);
        System.out.print("\nO Renavam digitado é: " + String.format("%.0f", renavam));
        System.out.print("\n");
    }
}