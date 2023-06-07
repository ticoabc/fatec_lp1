/* */
package aula6;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class ClassExemploA6_1 {

    public double x, y;

    public void ler(Scanner leitor) {
        System.out.print("\n\tDigite X: ");
        x = leitor.nextDouble();
        System.out.print("\tDigite Y: ");
        y = leitor.nextDouble();
    }

    public double getMedia() {
        double media = 0;
        media = (x + y) / 2;
        System.out.print("\tMédia: " + media + "\n");
        return media;
    }
}