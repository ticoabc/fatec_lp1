/*

 */
package vetores;
import java.util.Scanner;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassVetExemplo_3 {
    
    Scanner leitor = new Scanner(System.in);
    
    int linha = -1;//inicia a lista na posição -1
    int n=3;//variavel que irá receber os valorees N
    double[] vect = new double[n];// Declaração e instanciação
                                 // do vetor de 3 elementos
    
    public void novaLinha  ( Scanner leitor ){
    
        linha += 1; // criando uma nova linha
        System.out.print("\nDigite um número: ");
        vect [linha] = leitor.nextDouble();   
    }
    
    public void exibir(){
        for ( int i = 0; i < n; i++){
            vect[i] = leitor.nextDouble();
        }
        
        double soma = 0;
        for(int i = 0; i < n; i++ ){
            soma += vect[i];
        }
        double media = soma / n;
        System.out.printf("Média é igula a: %.2f%n", media);
    }
}
