/* Funções (mod) e (div) */
package aula5;

import static java.lang.Math.abs;

/*@author Tiago de Freitas*/
public class ClassExemploA5_1 {
    
    int x = -1;
    int y = 2;
    int z = 5;
    
    public void exibir(){
        System.out.print("\nNOTA: Funções MOD e DIV válida somente "
                        + "para trabalhar com datatypes inteiros.");
        System.out.print("\tMódulo Absoluto de " + x + " é: "
                                        + Math.abs(x) + "\n");
        System.out.print("\tMódulo Relativo de " + y + "  é:  "
                                  + Math.floorMod(y, y) + "\n");
        System.out.print("\tQuociente inteiro (DIV) de " + z + " e "
                    + y + " é:  " + Math.floorDiv(z, y) + "\n");
    }    
}
