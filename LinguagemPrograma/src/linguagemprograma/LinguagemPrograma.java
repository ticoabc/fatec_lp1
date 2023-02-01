package linguagemprograma;
/**
 *
 * @author Tiago de Freitas
 */
import java.util.Scanner;
import aula1.ClasseVolume;
import aula1.ClasseTriangulo;

public class LinguagemPrograma {

    public static void main(String[] args) {
        //Instanciamento da classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Instanciamento da ClasseVolume
        /*ClasseVolume v = new ClasseVolume();
        System.out.println("Digite os dados solicitados: ");
        v.leitura();
        v.calcular();
        v.exibir();*/
        
       
        //Instanciamento da ClasseTriangulo
        ClasseTriangulo t = new ClasseTriangulo();
        System.out.println("Digite os dados solicitados: ");
        t.leitura();
        t.calcular();
        t.exibir();        
    }
    
}
