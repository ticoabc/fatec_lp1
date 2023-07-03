/*Jogo Pedra Papel Tesoura 
O usuário deve inserir as opções para os dois jogadores. 
***Código sem tratamento de erros.***
Código original: https://gist.github.com/FernandaBernardo/5226225
*/
package diversos;

import java.util.Scanner;

/* @author Tiago de Freitas
   Data de Criação 03/07/2023
*/
public class PedraPapelTesoura {
    
    public void jogo() {
		
    Scanner sc = new Scanner(System.in);
    int v1,v2;

    System.out.println("\n\tEscolha entre Pedra[0], "
                                       + "Papel[1] ou "
                                       + "Tesoura[2]: ");

    System.out.print("\n\tJogador 1: ");
    v1 = sc.nextInt();

    System.out.print("\tJogador 2: ");
    v2 = sc.nextInt();

    switch (v1){
        case 0: 
            switch (v2){
                case 0:
                System.out.print("\tEmpate");
                break;
                case 1:
                System.out.print("\tJogador 2 ganhou");
                break;
                case 2:
                System.out.print("\tJogador 1 ganhou");
                break;
                default:
                System.out.print("\tOpção Inválida, Preste atenção!!");
            }	break;
            case 1:
                switch(v2){
                    case 0: 
                    System.out.print("\tJogador 1 ganhou");
                    break;
                    case 1:
                    System.out.print("\tEmpatou");
                    break;
                    case 2:
                    System.out.print("\tJogador 2 ganhou");
                    break;
                    default: 
                    System.out.print("\tOpção Inválida, Preste atenção!!");
                }   break;
            case 2:
                switch(v2){
                    case 0:
                    System.out.print("\tJogador 2 ganhou");
                    break;
                    case 1:
                    System.out.print("\tJogador 1 ganhou");
                    break;
                    case 2:
                    System.out.print("\tEmpate");
                    break;
                    default: 
                    System.out.print("\tOpção Inválida, Preste atenção!!");
                }   break;
            default: 
            System.out.print("\tOpção Inválida, Preste atenção!!");
        }
    }    
}
