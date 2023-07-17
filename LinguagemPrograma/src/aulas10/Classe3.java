/*O loop abaixo vai contar e acumular o valor lido 10 vezes.
Quando cont for 10, a média será calculada é o SALDO será impresso.*/
package aulas10;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 17/07/2023
*/
public class Classe3 {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    float valor = 0, saldo = 0, media = 0;
    
    public void ler() {
        while (cont < 10) {
            System.out.print("\tDigite o " + cont + "º Valor: ");
            valor = leitor.nextFloat();
            saldo = saldo + valor;//acumulador
            cont = cont + 1; // contador
        }
    }

    public void calcular() {
        media = saldo / cont;
    }

    public void exibir() {
        System.out.printf("\n\tSaldo: " + String.format("%.2f", saldo));
        System.out.printf("\n\tMédia: " + String.format("%.1f", media));
        System.out.println();
        System.exit(0);
    }
}
