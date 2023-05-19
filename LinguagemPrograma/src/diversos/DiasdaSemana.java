package diversos;

import enums.Dias;
import java.util.Scanner;

/* @author Tiago de Freitas */
public class DiasdaSemana {
    
     Dias dia;   

//Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\n\tExercicios utilizando ENUMS\n");
        System.out.print("\n\t>>>Dia da Semana<<<");
        
        System.out.print("\n\tDigite um número entre 1 - 7: ");
        dia.name();
        
    }
}
