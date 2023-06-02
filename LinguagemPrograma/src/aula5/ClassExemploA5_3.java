/* (Função MOD) - Bissexto ou não Bissexto */
package aula5;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA5_3 {
    
    int m, r;
    
    //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        
        System.out.print("\n\tIdentificando se o Ano é Bissexto"
                       + "\n\t1 - Ler, calcular e exibir"
                       + "\n\t2 - Sair"
                       + "\n\tItem: ");
        tecla = leitor.nextInt();//Lê INT e converte p/ CHAR        
        switch (tecla) {
            case 1:
            entrada();
            calcular();
            break;

            case 0:
            System.exit(0);
            break;
        }      
    }
    
    //Método entrada de dados
    public void entrada() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\tDigite o Ano: ");
        m = leitor.nextInt();
    }
    
    //Método calcular
    public void calcular(){
        r = m % 4;
        if(r == 0){
            System.out.print("\tO Ano " + m + " é Bissexto\n");
        }else{
            System.out.print("\tO Ano " + m + " não é Bissexto\n");
        }            
    }
}