/* */
package diversos;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class LotteryOdds {
    
    int k;
    int n;
    
    Scanner leitor = new Scanner(System.in);
    
    //Método leitura
    public void leitura() {
        System.out.print("\n\tExercicios utilizando laços de repetição 'for'; 'while'; 'do while'\n");
        System.out.print("\n\tHow many numbers do you need to draw?: ");
        k = leitor.nextInt();
        
        System.out.print("\n\tWhat is the highest number you can draw?: ");
        n = leitor.nextInt();        
    }

    //Método calcular
    public void calcular(){
        int lotteryOdds = 1;
        int i;
        for(i = 1; i <= k; i++)        
        lotteryOdds = lotteryOdds * (n  - i + 1) / i;
        
        System.out.print("\n\t"
            + "Your odds are 1 in " + lotteryOdds + " Good Luck!!\n");
    }
}
