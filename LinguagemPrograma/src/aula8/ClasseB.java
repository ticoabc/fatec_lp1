/*b)Ler o valor correspondente ao salário mensal (variável SM) de um
trabalhador e também o valor do percentual de reajuste (variável PR)
a ser atribuído. Apresentar o valor do novo salário (variável NS). 
 */
package aula8;

import java.util.Scanner;

/*
  @author Tiago de Freitas
  Data de Criação: 05/07/2023
*/
public class ClasseB {
    
    Scanner leitor = new Scanner(System.in);
    
    private double sm;
    private float pr;
    private double vr;
    private double ns;
    
    public void leituraB(){
        System.out.print("\n\tDigite Salário Mensal: ");
        sm = leitor.nextDouble();
        System.out.print("\tDigite Percentual de Reajuste: ");
        pr = leitor.nextFloat();
    }

    public double getCalc() {
        vr = sm * pr;
        return vr;
    }
    
    public double getSal() {
        ns = sm + vr;
        return ns;
    }
    
    public void exibirB(){
        System.out.print("\n\t*** Cálculo do Reajuste ***");
        System.out.printf("\n\tSalário Mensal......: %.2f", sm);
        System.out.printf("\n\tReajuste...........: %.2f", pr);
        System.out.printf("\n\tValor do Reajuste...: %.2f", getCalc());
        System.out.printf("\n\tNovo salário........: %.2f\n", getSal());
    }
}