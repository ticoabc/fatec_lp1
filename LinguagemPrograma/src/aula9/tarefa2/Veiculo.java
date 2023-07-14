package aula9.tarefa2;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class Veiculo extends Object{
    
    Scanner leitor = new Scanner(System.in);
    
    public String marca;
    public String modelo;
    public double anofab;

    public Veiculo() { }

    public Veiculo(String marca, String modelo, double anofab) {
        this.marca = marca;
        this.modelo = modelo;
        this.anofab = anofab;
    }
    
    public void entrada(Scanner Leitor) {
		
        System.out.print("informe a Marca: ");
        marca = leitor.nextLine();

        System.out.print("informe o Modelo: ");
        modelo = leitor.nextLine();

        System.out.print("informe o Ano de Fabricação: ");
        anofab = leitor.nextDouble();
    }
    
    public void saida(Scanner leitor) {		
        System.out.print("A Marca digitada é: " + marca);
        System.out.print("\nO Modelo digitado é: " + modelo);
        System.out.print("\nO Ano de Fabricação é: " + String.format("%.0f", anofab));
        System.out.print("\n");
    }
}
