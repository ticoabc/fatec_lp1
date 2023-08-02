/*Faça um código para calcular o valor de uma prestação em atraso com
 * base na multa de 2% e também do juros mensal de 1% sobre o valor principal.
* Declare vetores atributos:
	valorPagar[]
	valorprincipal[]
	periodoDias[]
* Declare as constantes:
	txjuros
	txmulta
* Crie os métodos:
	VLJUROS
	VLMUTA
	VLPRINCIPAL
Ao final imprima a tabela com todos os vetores exibindo uma espécie de planilha
dos dados abulados. Faça duas classes: Mãe e Filha e use herança.*/
package aulas15;

import java.util.Scanner;
/**
 * @author Tiago de Freitas 
 * Data: 02/08/2023
 */
public class Classe2 extends Class3{
    public void menuTarefa(Scanner leitor) {
        int item = 0;
	while (true) {
        System.out.print("\n\t[-] Menu Tarefa 15");
        System.out.print("\n\t[1] Ler ");
        System.out.print("\n\t[2] Exibir");
        System.out.print("\n\t[0] Finalizar");
        System.out.print("\n\t[-]Digite a operação desejada: ");
        item = leitor.nextInt();
        switch (item) {
            case 1:
             armazenar(leitor);
            break;
            case 2:
              get_multa();
            break;
            case 0:
                System.out.println("\n\tPrograma Finalizado!\n");
                System.exit(0);
            break;
            }
        }
    }
}
