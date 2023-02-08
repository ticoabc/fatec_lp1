/*
Este exemplo cria a constatne n =3, depois cria vetores double e int, SAL[]
é IDA[] são lidos diretamente no for. No último loop for os vetores poderão
ser exibidos todos juntos, o salário é exibido com 10% de aumento
 */
package vetores;
import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassVetExemplo_2 {
    Scanner leitor = new Scanner(System.in);
    
    static final int n=3;// vetores de 3 elementos
    static double sal[] = new double[n];// vetores de 3 elementos
    static int [] ida = new int[n];// listas sem dados
    static int linha = -1;//inicia a lista na posição -1
    
public static void novaLinha  ( Scanner leitor ){
    
    linha += 1; // criando uma nova linha
    System.out.println("\nDigite salário e idade:");
    sal [ linha ] = leitor.nextDouble();
    ida [ linha ] = leitor.nextInt();
   
    }

public static void exibir(){
    double aux =0;
    for ( int i = 0; i <= linha; i++){
        aux = sal [ i ] * 1.1; // aumento de 10%
        System.out.println( String.format("%.1f", sal [ i ] )+" "+
                            String.format("%.1f",aux) +" - "+ ida[i] );
        }
    }

public static void controle ( Scanner leitor ){
    int itemmenu;
    while ( true ){
        System.out.print("\n1 Ler\n2 Mostrar\n3 Sair\nitem:");
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
