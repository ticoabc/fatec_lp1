/* */
package aula7;

import javax.swing.JOptionPane;

/* @author Tiago de Freitas */
public class ClassTarefaJ {

    public double cot, quant;
    public double dolar;
    public double conv;
    public String saida;

    public void leitura() {
        cot = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a cotação do Dólar em Reais R$: "));
        quant = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite a quantidade de Dólares US$: "));
    }

    public double getcalc(){
        conv = cot * quant;
        return conv;
    }

    public void exibição(){
        String linhas_Saida = "\n*** Conversão Monetária***";
        linhas_Saida += "\nCotação Atual (R$)......................: "
                + String.format("%.2f", cot);
        linhas_Saida += "\nDólares disponíveis (US$)........: "
                + String.format("%.2f", quant);
        linhas_Saida += "\nConversão (US$)........................: "
                + String.format("%.2f", getcalc());
        JOptionPane.showMessageDialog(null, linhas_Saida);
    }
}
