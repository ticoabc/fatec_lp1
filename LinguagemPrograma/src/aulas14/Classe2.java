/* Este exemplo cria a constatne n=3, depois cria vetores double SAL[] e
 * int IDA[] que serão lidos diretamente no laço for.
 * No último loop for os vetores poderão ser exibidos todos junto.
 * O salário é exibido com 10% de aumento.*/
package aulas14;

import java.util.Scanner;

/*
 * @author Tiago de Freitas
 * Data: 01/08/2023
 */
public class Classe2 {
    
    private final int n=3;
    private double sal[] = new double[n];
    private int [] ida = new int[n];
    private double aux;
    
    public void entrada(Scanner leitor) {
        System.out.print("\t---------------------------------------------------\n");
        for (int i = 0; i < n ; i ++) {
            System.out.print("\tDigite salário e idade separados por espaço: ");
            sal[i] = leitor.nextDouble();
            ida[i] = leitor.nextInt();
        }
    }
    
    public void saida() {
        System.out.print("\t---------------------------------------------------\n");
        for ( int i=0; i<n; i++){
            aux = sal[i] * 1.1;
            System.out.printf("\tSalário Reajustado: %.2f", aux);
            System.out.println();
        }
        System.out.print("\t---------------------------------------------------\n");
    }
}
