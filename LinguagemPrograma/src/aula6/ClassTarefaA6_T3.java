/*3 Encontre o TIPO do triângulo
Escreva um programa que leia o valor de
3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
Retângulo ou Obtusângulo. Sendo que: 
− Triângulo Retângulo: possui um ângulo reto. (igual a 90º) 
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90 graus) 
– Triângulo Acutângulo: possui três ângulos agudos. (menor que 90 graus)
 */
package aula6;

import java.util.Scanner;

/**
 * 07/06/2023
 * @author Tiago de Freitas
 */
public class ClassTarefaA6_T3 {
    
    protected double X,Y,Z;
    protected String T;
    
    void entrada(Scanner leitor){
        
        System.out.print("\n\t1° Ângulo: ");
        X = leitor.nextDouble();
        System.out.print("\t2° Ângulo: ");
        Y = leitor.nextDouble();
        System.out.print("\t3° Ângulo: ");
        Z = leitor.nextDouble();
    }

    public double exibir() {
        double id = 0;
        if (X == 90 || Y == 90 || Z == 90) {
            T = "\tTriângulo Retângulo!\n";
        }
        if (X > 90 || Y > 90 || Z > 90) {
            T = "\tTriângulo Obtusângulo!\n";
        }
        if (X < 90 && Y < 90 && Z < 90) {
            T = "\tTriângulo Acutângulo!\n";
        }
        System.out.printf(T);
        return id;
    }
}
