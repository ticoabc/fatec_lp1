/* (Função MOD) - Múltiplo e Divisor */
package aula5;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA5_4 {
    
    int multiplo, divisor, divisivel, resultado;
    
    //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        
        System.out.print("\n\tIdentificando se o Múltiplo e Divisor"
                       + "\n\t1 - Múltiplo / Divisível "
                       + "\n\t2 - Divisor "
                       + "\n\t0 - Sair"
                       + "\n\tItem: ");
        tecla = leitor.nextInt();//Lê INT e converte p/ CHAR        
        switch (tecla) {
            case 1:
            entrada();
            calcular();
            break;
            
            case 2:
            entrada2();
            calcular2();
            break;

            case 0:
            System.exit(0);
            break;
        }      
    }
    
    //Método entrada de dados
    public void entrada() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\tDigite o 1º número: ");
        multiplo = leitor.nextInt();
        System.out.print("\tDigite o 2º número: ");
        divisivel = leitor.nextInt();
    }
    
    //Método entrada de dados
    public void entrada2() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\tDigite o 1º número: ");
        multiplo = leitor.nextInt();
        System.out.print("\tDigite o 2º número: ");
        divisor = leitor.nextInt();
    }  
    
    //Método calcular
    public void calcular(){
        resultado = multiplo % divisivel;
        if( resultado == 0){
            System.out.print("\tO número " + multiplo + " é divisivel por: "
                                           + divisivel + " \n");
        }else{
            System.out.print("\tO número " + multiplo + " não é divisivel por: "
                                           + divisivel + " \n");
        }            
    }
    
    //Método calcular
    public void calcular2(){
        resultado = multiplo % divisor;
        if( resultado == 0){
            System.out.print("\t " + divisor + " é Divisor de " + multiplo 
                    + " e " + multiplo + " é Múltiplo de " + divisor + "\n");
        }else{
            System.out.print("\t " + divisor +" não é Divisor de " + multiplo 
                    + " e " + multiplo + " não é Múltiplo de " + divisor + "\n");
        }            
    }
}
