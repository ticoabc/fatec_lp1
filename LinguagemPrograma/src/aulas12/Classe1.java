/*
 */
package aulas12;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 24/07/2023
 */
public class Classe1 {
    
    protected void executar (Scanner leitor){
        int R = 1, X;
        System.out.print("\n\tDigite o valor da tabuada: ");
        X=leitor.nextInt();

        for ( int cont = 1 ; cont <= 10 ; cont+=1 ){
            R = X * cont;
            System.out.println("\t" + X + " * " + cont + " = " + R);
	}
    }
}
