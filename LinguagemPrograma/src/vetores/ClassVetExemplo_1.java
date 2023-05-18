/*
Este exemplo cria o vetor x[]de forma explícita, em seguida descobre o número
de elementos (n), x.length é o tamanho total doarray x. 
Depois, é criada uma variável aux para armazenar a soma do quadrado do elemento 
do array com ele mesmo. O loop foré utilizado para armazenar e exibir
o valor de aux
 */
package vetores;
import java.util.Scanner;
/* @author Tiago de Freitas */
public class ClassVetExemplo_1 {
    
    Scanner leitor = new Scanner(System.in);
    
    static int x [] = {1, 0, -1};//Vetor declarado = forma explícita
    static int n = x.length;//tamanho do vetor
    static double aux = 0;//variável aux para armazenar a soma do quadrado
    static int linha = -1;//inicia a lista na posição -1
    
    public static void controle ( Scanner leitor ){
    int itemmenu;
    while ( true ){
        System.out.print("\n\t1 - Mostrar\n\t2 - Sair\n\titem: ");
        itemmenu = leitor.nextInt();
        if ( itemmenu == 1 ){
            exibir();
        }else if ( itemmenu == 2 )
            break;
        }
    }
    
    public static void exibir(){
        //double aux =0;
        for(int i = 0; i < n; i++){
            aux = Math.pow(x[i], 2) + x[i];
                System.out.println("\n\t" + aux);
        }
    }
}
