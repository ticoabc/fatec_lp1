/*
Jogo Pedra Papel Tesoura versão com "if´s aninhados"
O usuário deve inserir as opções para os dois jogadores. 
***Código sem tratamento de erros.***
 */
package diversos;

import java.util.Scanner;

/*
  @author Tiago de Freitas
  Data de Criação: 05/07/2023
 */
public class Jokempo {

    private int p1, p2;

    public void JoKePo() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n\tEscolha entre 0, 1 e 2, sendo: " 
                         + "\n\t[0] - Pedra" 
                         + "\n\t[1] - Papel" 
                         + "\n\t[2] - Tesoura");

        System.out.print("\n\tJogador 1: ");
        p1 = leitor.nextInt();

        System.out.print("\tJogador 2: ");
        p2 = leitor.nextInt();
    }

    public void vencedor() {

        if (p1 == p2) {
            System.out.print("\tEmpate!");
        } else if (p1 == 0 && p2 == 1) {
            System.out.print("\tJogador 2 ganhou");
        } else if (p1 == 0 && p2 == 2) {
            System.out.print("\tJogador 1 ganhou");
        } else if (p1 == 1 && p2 == 0) {
            System.out.print("\tJogador 1 ganhou");
        } else if (p1 == 1 && p2 == 2) {
            System.out.print("\tJogador 2 ganhou");
        } else if (p1 == 2 && p2 == 0) {
            System.out.print("\tJogador 2 ganhou");
        } else if (p1 == 2 && p2 == 1) {
            System.out.print("\tJogador 1 ganhou");
        } else {
            System.out.print("\tErrou!!! Escolha de Novo!!!");
        }
    }
}
