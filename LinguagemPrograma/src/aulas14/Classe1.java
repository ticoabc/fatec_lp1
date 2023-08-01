/* Este exemplo cria o vetor x[] de forma explícita, em seguida descobre o 
 * número de elementos (n), x.length é o tamanho total do array x.
 * Depois, é criada uma variável 'aux' para armazenar a soma do quadrado
 * do elemento do array com ele mesmo.
 * O loop for é utilizado para armazenar e exibir o valor de aux.*/
package aulas14;

/*
 * @author Tiago de Freitas
 * Data: 01/08/2023
 */
public class Classe1 {
    
    public void Classe1() {
        int x [] = { 1, 0 , -1 };//Vetor explícito
        int n = x.length;// tamaho
        double aux = 0;
        System.out.println();
        for (int i = 0; i < n ; i ++){
            aux = Math.pow( x[i], 2) + x[i];
            System.out.print("\t" + aux + ", ");
        }System.out.println();
    }
}
