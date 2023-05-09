package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA2_T1 {
    
    String x = "0";
    String y = "0";
    
    //Converão String para Double
    double xEntrada = Double.parseDouble(x);
    double ySaida = Double.parseDouble(y);
    
     //Método leitura
    public void leitura() {
        JOptionPane.showMessageDialog(null, "Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o\n" +
        "valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. \n" +
        "Entrar com o valor do produto e imprimir o valor da venda. \n" +
        "(Fazer as conversões de texto para número corretamente)");
        xEntrada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
    }
    
    //Método calcular
    public void calcular() {
        if (xEntrada < 20) {
            
            ySaida = xEntrada * 1.45;

        } else {

            ySaida = xEntrada * 1.30;
        }
    }
    
    //Método exibir
    public void exibir(){

        JOptionPane.showMessageDialog
            (null, "O Valor da venda será: R$" + ySaida );
    }
}