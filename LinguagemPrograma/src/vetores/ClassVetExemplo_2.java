/*
Este exemplo cria a constante n =3, depois cria vetores double e int, SAL[]
é IDA[] são lidos diretamente no for. No último loop for os vetores poderão
ser exibidos todos juntos, o salário é exibido com 10% de aumento
 */
package vetores;
import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassVetExemplo_2 {
    Scanner leitor = new Scanner(System.in);
    
    static final int n=3;// constante
    static double sal[] = new double[n];// vetores de 3 elementos
    static int [] ida = new int[n];// listas sem dados
    static int linha = -1;//inicia a lista na posição -1
    
public static void novaLinha  ( Scanner leitor ){
    
    linha += 1; // criando uma nova linha
    System.out.print("\n\tDigite salário e idade"
                       + "separados por espaço: ");
    sal [ linha ] = leitor.nextDouble();
    ida [ linha ] = leitor.nextInt();
   
    }

public static void exibir(){
    double aux =0;
    for ( int i = 0; i <= linha; i++){
        aux = sal [ i ] * 1.1; // aumento de 10%
        System.out.print( String.format("\n\tSalário: " + "%.1f", sal [ i ] )+" "+
                          String.format("\n\tSalário c/ Reajuste: " + "%.1f",aux)
                                      + "\n\tIdade: " + ida[i] );
        }
    }

public static void controle ( Scanner leitor ){
    int itemmenu;
    while ( true ){
        System.out.print("\n\n\t1 Ler\n\t2 Mostrar\n\t3 Sair\n\titem:");
        itemmenu = leitor.nextInt();
        if ( itemmenu == 1 ){
            novaLinha(leitor); // inserir nova linha
        }else if (itemmenu == 2){
            exibir();
        }else if ( itemmenu == 3 )
            break;
        }
    }
}
