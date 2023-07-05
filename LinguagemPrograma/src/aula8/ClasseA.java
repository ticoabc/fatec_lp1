/*a)Elaborar um programa de computador que efetue a leitura de quatro
valores inteiros (variáveis A, B, C e D). Ao final o programa deve 
apresentar o resultado do produto (variável P) do primeiro(a) com o 
terceiro valor(c), e o resultado da soma (variável S) do segundo(b)
com o quarto valor(d).*/
package aula8;

import java.util.Scanner;

/* @author Tiago de Freitas
   Data de Criação: 05/07/2023
 */
public class ClasseA {
    
    Scanner leitor = new Scanner(System.in);
    
    private double a, b, c, d;
    private double P,S;
    
    public void leituraA(){
        System.out.print("\n\tDigite A: ");
        a = leitor.nextDouble();
        System.out.print("\tDigite B: ");
        b = leitor.nextDouble();
        System.out.print("\tDigite C: ");
        c = leitor.nextDouble();
        System.out.print("\tDigite D: ");
        d = leitor.nextDouble(); 
    }

    public double getP(){
        P = a*c;
        return P;
    }

    public double getS(){
        S = b + d;
        return S;
    }
    
    public void exibirA(){
        System.out.print("\n\t*** Cálculo das Variáveis ***\n");
        System.out.printf("\n\tVariável......: %.2f", a);
        System.out.printf("\n\tVariável......: %.2f", b);
        System.out.printf("\n\tVariável......: %.2f", c);
        System.out.printf("\n\tVariável......: %.2f", d);
        System.out.printf("\n\tProduto(a*c)..: %.2f", getP());
        System.out.printf("\n\tSoma(b+d).....: %.2f", getS());
    }
}