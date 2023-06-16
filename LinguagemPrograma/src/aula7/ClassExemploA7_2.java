/* Faça uma classe que leia o valor principal de uma
dívida e dias de atraso, calcule o valor atualizado
adicionando 1% de juros ao mês + 2% de multa sobre o
valor principal.*/
package aula7;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA7_2 {
    protected final double txmulta = 0.02; // Atributo Global
    
protected double lerPres ( Scanner leitor ){ 
    double val;// Atributo local
        System.out.print("\n\tDigite Prestação: ");
        val = leitor.nextDouble(); 
    return val;
    }

protected double calcMulta ( double val ){
    return ( val * txmulta ); 
    }

protected void mostrar ( double val, double multa ){
    double valatual= val + multa;
    System.out.print ("\tValor Final: " + valatual ); 
    }
}
