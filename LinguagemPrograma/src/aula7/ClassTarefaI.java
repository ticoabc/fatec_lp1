/*
 */
package aula7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/* @author Tiago de Freitas */
public class ClassTarefaI {

    protected double a, b;
    protected double dif;
    protected double quad;
    protected String saida;
    
    public void leitura(){
        a = Double.parseDouble
        (JOptionPane.showInputDialog(null, "Digite a variável A: "));
        b = Double.parseDouble
        (JOptionPane.showInputDialog(null, "Digite a variável B: "));
    }
    
    public double getcalc(){
        dif = a - b;
        return dif;
    }
    
    public double getquad(){
        quad = Math.pow(dif, 2);
        return quad;
    }
    
    public void exibição(){
        String linhas_Saida = "\n*** Cálculo das Variáveis ***";
        linhas_Saida += "\nVariável A.......: " + String.format("%.2f", a);
        linhas_Saida += "\nVariável B.......: " + String.format("%.2f", b);
        linhas_Saida += "\nDiferença........: " + String.format("%.2f", getcalc());
        linhas_Saida += "\nQuadrado da Diferença........: "
                                                + String.format("%.2f", getquad());
        JOptionPane.showMessageDialog(null, linhas_Saida);
    }
}
