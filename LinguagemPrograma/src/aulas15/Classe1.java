package aulas15;
/**
 * @author Tiago de Freitas 
 * Data: 02/08/2023
 */
public class Classe1 {
    
    //vetor explicito, ou seja declarado
    private int[] xy = {1, 5, 10, 45, 3, 9};
    
    public void maiorMenor(){
        int maior = 0, menor = 0;
        int tot = xy.length;// pega o tamanho do vetor
        for (int i = 0; i < tot; i++) {
            if (i == 0) {
                maior = xy[i];
                menor = xy[i];
            }
            if (xy[i] > maior) {
                maior = xy[i];
            }
             if (xy[i] < menor) {
                menor = xy[i];
            }
        }
        System.out.print("\n\tMaior: " + maior);
        System.out.print("\n\tMenor: " + menor);
        System.out.println();
    }
}
