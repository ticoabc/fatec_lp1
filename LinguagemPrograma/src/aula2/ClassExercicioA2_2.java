/*

 */
package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassExercicioA2_2 {
    
    /*Atributos são variáveis globais da classe */
    public double n1, n2;
    public double media;
    
    /* Métodos são functions e voids da classe*/
    public void leitura() {
        
        JOptionPane.showMessageDialog(null,"*** Média entre dois valores ***");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2: "));
    }
    
    public void calcular ( ) {
        media = (n1 + n2)/2;
    }
    
    public void exibir ( ) {
        JOptionPane.showMessageDialog(null,
                "A média entre " + n1 + " e " + n2 + " é: " +  media); 
    }
}
