/*A expressão de contagem (incremento ou contador), usa uma variável
numérica para contar quantas vezes o código é executado dentro de um
while (laço). */
package aulas10;
/*
@author Tiago de Freitas
Data: 17/07/2023
*/
public class Classe1 {

    static public int contador = 0;
    static public int diminuir = 20;

    public static void calcular() {
        while (contador < 10) {
            contador = contador + 1;
            diminuir = diminuir - 2;
        }
    }

    public static void exibir() {
        System.out.print("\n\tContador: " + contador);
        System.out.print("\n\tDiminuir: " + diminuir);
        System.out.println();
    }
}