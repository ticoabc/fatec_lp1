//Comparison.java
// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.
package diversos;

import java.util.Scanner;

/**
 * 06/06/2023 - 21:30
 *
 * @author Tiago de Freitas
 */
public class Comparison {

    int number1; // primeiro número a comparar
    int number2; // segundo número a comparar

    //Método leitura
    public void leitura() {

        // cria Scanner para obter entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);

        System.out.print("\tEnter first integer: "); // prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
        
        System.out.print("\tEnter second integer: "); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

    }
    
    public void calcular() {
        
        if (number1 == number2)
            System.out.printf("\t%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("\t%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("\t%d < %d%n", number1, number2);

        if (number1 > number2)
            System.out.printf("\t%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("\t%d <= %d%n", number1, number2);

        if (number1 >= number2)
            System.out.printf("\t%d >= %d%n", number1, number2);
    }
}
