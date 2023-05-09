package aula2;
/*
 * @author Tiago de Freitas
 */
import javax.swing.JOptionPane;
public class ClassExercicioA2_1 {
    /*Atributos são variáveis globais da classe */
    public String a, b;
    
    //Método leitura e exibição
    public void leitura() {      
        
        String a = JOptionPane.showInputDialog(null, "Digite uma palavra:");
        String b = JOptionPane.showInputDialog(null, "Digite outra palavra:");
        if(a.equals(b)){
           String msg = "As duas palavras digitadas são iguais:" + a ;
           JOptionPane.showMessageDialog(null, msg );
        }else{
           String msg = "As duas palavras digitadas são diferentes:" + a + " e " + b;
            JOptionPane.showMessageDialog(null, msg );           
        }
    }
}
