/* */
package vetores;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassVetExercicio_5 {
    
    Scanner leitor = new Scanner(System.in);
    
    float media;
    int linha = -1;//inicia a lista na posição -1    
    int soma=0;
    int n;
    double[] vect = new double[n];// Declaração e instanciação
                                   // do vetor de n elementos    
    
    public void novaLinha  ( Scanner leitor ){
    
        System.out.printf("\n\t>>>Vetor de n Elementos<<<");
        linha += 1; // criando uma nova linha
        System.out.printf("\n\tDigite o 5 números: ");
        vect [linha] = leitor.nextDouble();
    }
}
