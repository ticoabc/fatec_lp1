/* */
package diversos;

import enums.Season;
import java.util.Scanner;

/* @author Tiago de Freitas */
public class SeasonOftheYear {

    private Season season;

    public String getSeason() {
        return season.name();
    }

    public void setSeason(String season) {
        this.season = Season.valueOf(season);
    }
    
     //Método leitura
    public void leitura() {
        Scanner leitor = new Scanner(System.in);
        
        String tecla = "sair";
        while (tecla !="sair"){
        System.out.print("\n\t\tExercicios utilizando ENUMS");
        System.out.print("\n\t\t\t>>>Estações do Ano<<<");
        System.out.print("\n\t\t\tDigite o nome do mês ou "
                       + "'f' para finalizar");
        System.out.print("\n\t\t\tDigite: ");
        tecla = leitor.next();
        
//        switch (tecla){
//                case :
//                System.out.print("\t\t\t" + "\n");
//                break;
        }
    }
}
