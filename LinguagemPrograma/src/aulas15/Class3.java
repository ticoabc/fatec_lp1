package aulas15;

import java.util.Scanner;

/**
 * @author Tiago de Freitas 
 * Data: 02/08/2023
 */
public class Class3 {
    // atributos
    private static double valor[] = new double[4];
    private static int dias[] = new int[4];
    private static int linha = -1;
    private static double taxamulta = 0.02;
    private static double taxajuros = 0.00033;
    
    public static void armazenar(Scanner leitor) {
        System.out.println("\n\tEntrada de dados");
        for (int i = 1; i < 4; ++i) {
            linha += 1; // criando uma nova linha
            System.out.print("\tDigite o Valor da " + i + "ª Prestação: R$ ");
            valor[linha] = leitor.nextDouble();
            System.out.print("\tDigite o Total de Dias em Atraso: ");
            dias[linha] = leitor.nextInt(); 
        }
    }
    
    public static void get_multa() {
		double multa = 0, juros = 0, acc = 0, saldo = 0;
		int qtprest = 0,cont = 0;
		System.out.println("\n\tResultados");
		for (int i = 0; i <= linha; i++) {
                    cont++;
                    multa = valor[i] * taxamulta; // multa de 2%
                    juros = taxajuros * dias [i] * valor[i] ;
                    acc = valor[i] + multa + juros;
                    saldo += acc;
                    qtprest = cont;
                    System.out.print("\t"
                        + " - Valor R$ " + String.format("%.2f",valor[i])
                        + " - Dias: " + dias[i]
                        + " - Saldo: " + String.format("%.2f", saldo)
                        + " - Prestações; " + qtprest
                        + " - Média: " + String.format("%.2f", saldo / qtprest));
                        System.out.print("\n");
		}
	}
}
