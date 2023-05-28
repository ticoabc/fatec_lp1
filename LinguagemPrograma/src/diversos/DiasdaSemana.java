package diversos;

import enums.Dias;
import java.util.Scanner;

/* @author Tiago de Freitas */
public class DiasdaSemana {
    
    private Dias dia;

    public String getDia() {
        return dia.name();
    }

    public void setDia(String dia) {
        this.dia = Dias.valueOf(dia);
    }
    
    //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        int item = 0;
        while (true){
        System.out.print("\n\t\tExercicios utilizando ENUMS");
        System.out.print("\n\t\t\t>>>Dia da Semana<<<");
        System.out.print("\n\t\t\tDigite um número entre 1 - 7"
                       + "\n\t\t\t0 - Finalizar");
        System.out.print("\n\t\t\tDigite a operação desejada: ");
        item = leitor.nextInt();
        
            switch (item){
                case 1:
                System.out.print("\t\t\t" + dia.DOMINGO + "\n");
                break;

                case 2:
                System.out.print("\t\t\t" + dia.SEGUNDA + "\n");
                break;

                case 3:
                System.out.print("\t\t\t" + dia.TERCA + "\n");
                break;

                case 4:
                System.out.print("\t\t\t" + dia.QUARTA + "\n");
                break;

                case 5:
                System.out.print("\t\t\t" + dia.QUINTA + "\n");
                break;

                case 6:
                System.out.print("\t\t\t" + dia.SEXTA + "\n");
                break;

                case 7:
                System.out.print("\t\t\t" + dia.SABADO + "\n");
                break;

                case 0:
                System.exit(0);
                break;
            }
        }
    }
}
