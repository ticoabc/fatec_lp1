/* */
package aula7;

import javax.swing.JOptionPane;

/* @author Tiago de Freitas */
public class ClassTarefaL {

    public double a, b, c;
    public double quad;
    public double soma;
    public String saida;

    public void leitura() {
        a = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a variável A: "));
        b = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a variável B: "));
        c = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a variável C: "));
    }

    public double getcalc() {
        soma = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        return soma;
    }

    public void exibição() {
        String linhas_Saida = "\n*** Soma dos Quadrados ***";
        linhas_Saida += "\nVariável A.......: "
                + String.format("%.2f", a);
        linhas_Saida += "\nVariável B.......: "
                + String.format("%.2f", b);
        linhas_Saida += "\nVariável C.......: " 
                + String.format("%.2f", c);
        linhas_Saida += "\nDiferença........: " 
                + String.format("%.2f", getcalc());
        JOptionPane.showMessageDialog(null, linhas_Saida);
    }
}
