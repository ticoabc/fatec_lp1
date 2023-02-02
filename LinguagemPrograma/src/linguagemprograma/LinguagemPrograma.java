package linguagemprograma;
/**
 *
 * @author Tiago de Freitas
 */
import java.util.Scanner;
import aula1.ClasseVolume;
import aula1.ClasseTriangulo;
import aula1.ClassExercicio_1;
import aula1.ClassExercicio_2;

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
        /*ClasseTriangulo t = new ClasseTriangulo();
        System.out.println("Digite os dados solicitados: ");
        t.leitura();
        t.calcular();
        t.exibir();*/
        
        /*//Instanciamento da ClassExercicio_1
        ClassExercicio_1 ex1 = new ClassExercicio_1();
        ex1.leitura();
        ex1.calcular();
        ex1.exibir();*/
        
        //Instanciamento da ClassExercicio_2
        ClassExercicio_2 ex2 = new ClassExercicio_2();
        ex2.leitura();
        ex2.calcular();
        ex2.exibir();
    }
    
}
