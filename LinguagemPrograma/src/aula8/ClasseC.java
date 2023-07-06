/*c) Em uma eleição sindical concorreram ao cargo de presidente três candidatos
(A, B e C).
Durante a apuração dos votos foram computados votos nulosvn) e votos em branco(vb),
além dos votos válidos(vv) para cada candidato. */
package aula8;

import java.util.Scanner;
/*
  @author Tiago de Freitas
  Data de Criação: 05/07/2023
  Data de Modificação: 06/07/2023
*/
public class ClasseC {
    
    Scanner leitor = new Scanner(System.in);
    
    //atributos de leitura
    private double a, b, c;
    private double nl;
    private double br;
    
    public void leituraC(){
        System.out.print("\n\tDigite a quantidade de votos do candidato A: ");
        a = leitor.nextDouble();
        System.out.print("\tDigite a quantidade de votos do candidato B: ");
        b = leitor.nextDouble();
        System.out.print("\tDigite a quantidade de votos do candidato C: ");
        c = leitor.nextDouble();
        System.out.print("\tDigite a quantidade de votos nulos: ");
        nl = leitor.nextDouble();
        System.out.print("\tDigite a quantidade de votos brancos: ");
        br = leitor.nextDouble();        
    }
    
    private double totaleleitores(){
        double te;
        te = a+b+c+nl+br;
        return te;
    }
    
    private double perctvotosvalidos(double te){
        double votos;
        double vv;
        vv = te - (nl + br);
        votos = (vv*100)/te;
        return votos;
    }
    
    private double perctvotosvalidosA(double te){
        double vA;
        double vv = te - (nl+br+b+c);
        vA=(vv*100)/te;
        return vA;
    }
    
    private double perctvotosvalidosB(double te){
        double vB;
        double vv = te - (nl+br+a+c);
        vB=(vv*100)/te;
        return vB;
    }
    
    private double perctvotosvalidosC(double te){
        double vC;
        double vv = te - (nl+br+a+b);
        vC=(vv*100)/te;
        return vC;
    }
    
    private double perctvotosvalidosNulos(double te){
        double vN;
        double vv = te - (br+a+b+c);
        vN=(vv*100)/te;
        return vN;
    }
    
    private double perctvotosvalidosBrancos(double te){
        double vbR;
        double vv = te - (nl+a+b+c);
        vbR=(vv*100)/te;
        return vbR;
    }
    
    public void exibirC(){
        double te = totaleleitores();
        System.out.print("\t*** Apuração ***\n");
        System.out.printf("\n\tTotal de votos..................: %.0f", te);
        System.out.printf("\n\tPorcentagem de Votos Válidos....: %.2f", perctvotosvalidos(te));
        System.out.printf("\n\tPorcentagem de Votos Candidato A: %.2f", perctvotosvalidosA(te));
        System.out.printf("\n\tPorcentagem de Votos Candidato B: %.2f", perctvotosvalidosB(te));
        System.out.printf("\n\tPorcentagem de Votos Candidato C: %.2f", perctvotosvalidosC(te));
        System.out.printf("\n\tPorcentagem de Votos Nulos......: %.2f", perctvotosvalidosNulos(te));
        System.out.printf("\n\tPorcentagem de Votos Brancos....: %.2f \n", perctvotosvalidosBrancos(te));
    }
}
