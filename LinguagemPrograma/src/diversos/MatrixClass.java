/* */
package diversos;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class MatrixClass {

    boolean continuar = true;
    char opcao;

    //Método menu leitura
    public void leitura() {

        Scanner entrada = new Scanner(System.in);

        while (continuar) {
            System.out.println("\n\tVocê está na matrix;");
            System.out.print("\tEscolha a pílula para sair da matrix: ");
            opcao = entrada.next().charAt(0);

            if (opcao == 'R') {
                continuar = false;
                System.out.println("\tParabéns! Você conseguiu sair da Matrix!");
            }else {
                System.out.println(
                "\n\tVocê não está autorizado a sair da Matrix. Estude Java.");
            }
        }
    }
}
