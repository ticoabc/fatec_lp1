/*
Este exemplo cria o vetor x[]de forma explícita, em seguida descobre o número
de elementos (n), x.length é o tamanho total doarray x. 
Depois, é criada uma variável aux para armazenar a soma do quadrado do elemento 
do array com ele mesmo. O loop foré utilizado para armazenar e exibir
o valor de aux
 */
package vetores;
import java.util.Scanner;
/**
 *
 * @author Tiago de Freitas
 */
public class ClassVetExemplo_1 {
    
    Scanner leitor = new Scanner(System.in);
    
    int x [] = {1, 0, -1};//Vetor declarado
    int n = x.length;//tamanho do vetor
    double aux = 0;
    
    /*for( int i = 0; i < n; i++){
        
        aux = Math.pow(x[i], 2) + x[i];
            System.out.println(aux + "\n");
    }*/
}
