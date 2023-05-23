/* */
package diversos;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ForClass {

    //Método menu leitura
    public void leitura() {
        Scanner sc = new Scanner(System.in);

        int item = 0;
        while (true) {
            System.out.print("\n\t1 - Laço For 1");
            System.out.print("\n\t2 - Laço For 2");
            System.out.print("\n\t3 - Laço For 3");
            System.out.print("\n\t0 - Finalizar ");
            System.out.print("\n\n\tDigite a operação desejada: ");
            item = sc.nextInt();
            switch (item) {
            case 1:
                System.out.print("\tLaço For 1 - Contando até 10, com laço for\n");
                for (int count = 1; count <= 10; count++) {
                    System.out.printf("\n\t" + count);
                }
                System.out.println();
                break;

            case 2:
                System.out.print("\tLaço For 2 - Contagem regressiva, usando o laço for\n");
                for (int count = 10; count >= 1; count--) {
                    System.out.printf("\n\t" + count);
                }
                System.out.print("\n");
                break;

            case 3:
                System.out.print("\tLaço For 3 - "
                        + "contagem progressiva e regressiva no mesmo laço for\n");
                for (int sobe = 1, desce = 10; sobe <= 10 && desce >= 1; sobe++, desce--) {
                    System.out.printf("\n\t%d \t %d \n", sobe, desce);
                }
                break;
                
            case 0:
                System.exit(0);
                break;
            }
        }
    }
}
