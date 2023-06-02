/*(Função MOD) - PAR ou ÍMPAR*/
package aula5;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA5_2 {
    
    int m, r;
    
    //Método menu leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        int tecla = 0;
        
        System.out.print("\n\tIdentificando se o número digitado é PAR"
                       + "\n\t1 - Ler, calcular e exibir"
                       + "\n\t2 - Sair"
                       + "\n\tItem: ");
        tecla = leitor.nextInt();//Lê INT e converte p/ CHAR        
        switch (tecla) {
            case 1:
            entrada();
            calcular();
//            exibir();
            break;

            case 0:
            System.exit(0);
            break;
        }      
    }
    
    //Método entrada de dados
    public void entrada() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\tDigite um número: ");
        m = leitor.nextInt();
    }
    
    //Método calcular
    public void calcular(){
        r = m % 2;
        if(r == 0){
            System.out.print("\tO número " + m + " é PAR\n");
        }else{
            System.out.print("\tO número " + m + " é ÍMPAR\n");
        }            
    }
}
