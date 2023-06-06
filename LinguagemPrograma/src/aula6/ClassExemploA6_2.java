/* */
package aula6;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA6_2 {

    public double b, h;

    public void ler(Scanner leitor) {
        System.out.println("\nDigite a Base: ");
        b = leitor.nextDouble();
        System.out.println("\nDigite a Altura: ");
        h = leitor.nextDouble();
    }

    public double getArea() {
        return (b * h) / 2;
    }
}
