/* */
package aula6;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassExemploA6_2 {

    public double b, h;

    public void ler(Scanner leitor) {
        System.out.print("\n\tDigite a Base: ");
        b = leitor.nextDouble();
        System.out.print("\tDigite a Altura: ");
        h = leitor.nextDouble();
    }

    public double getArea() {
        double area = 0;
        area = (b * h) / 2;
        System.out.print("\tO Peso será: " 
                    + String.format("%.2f", area) + "\n");
        return area;
    }
}
