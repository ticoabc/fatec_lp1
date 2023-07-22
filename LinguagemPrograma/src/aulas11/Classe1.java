/*Faça a tabela de simulação do void executar( ) e da função contZeros( ),
depois execute normalmente sem herança */
package aulas11;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class Classe1 {

    public int contZeros(String t) {
        int cont = 0;
        int contzeros = 0;
        String x;

        while (cont < t.length()) {
            x = t.substring(cont, cont + 1);
            if (x.equals("0")) {
                contzeros++;
            }
            cont++;
        }
        return contzeros;
    }
    
    public void entrada(Scanner leitor) {
        System.out.print("\n\tDigite uma palavara com '0'(zero) "
                                            + "entre as letras: ");
        String t = leitor.next();
        //String t = "prog00124000els";
        int zeros = contZeros(t);
        System.out.println("\tTexto Digitado: " + "[ " + t + " ]");
        System.out.println("\tQuantidade de zeros: " + zeros);
    }
}
