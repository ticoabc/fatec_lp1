/*Programa para calcular e apresentar a média dos valores entrados
e aqueles que são maiores e menores que a média. */

package vetores;
import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassVetExercicio_4 {
    
    Scanner leitor = new Scanner(System.in);
    
    float media;
    int linha = -1;//inicia a lista na posição -1    
    int soma=0;
    int n = 4;
    double[] vect = new double[n];// Declaração e instanciação
                                   // do vetor de 5 elementos
    
    public void novaLinha  ( Scanner leitor ){
    
        System.out.printf("\n\t>>>Media de 5 Números<<<");
        linha += 1; // criando uma nova linha
        System.out.printf("\n\tDigite o 5 números: ");
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
        System.out.printf("\n\tMédia é igula a: %.2f%n", media);
        
        System.out.printf("\n\tOs seguintes valores sao maiores que a media");
        for(int i=0; i < n; i++){
            if(media < n){
                System.out.printf("%d\t", n);
            }
        }
        System.out.printf("\n\tOs seguintes valores sao menores que a media");
        for(int i=0; i < n; i++){
            if(media > n){
                System.out.printf("%d\t", n);
            }
        }
    }
 }  
