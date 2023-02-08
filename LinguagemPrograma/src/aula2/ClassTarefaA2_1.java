/*
Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o
valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. 
Entrar com o valor do produto e imprimir o valor da venda. 
(Fazer as conversões de texto para número corretamente)
 */
package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA2_1 {
    
    String x = "0";
    String y = "0";
    
    //Converão String para Double
    double xEntrada = Double.parseDouble(x);
    double ySaida = Double.parseDouble(y);
    
     //Método leitura
    public void leitura() {      
       
        xEntrada = Double.parseDouble(JOptionPane.showInputDialog
                    ("Digite o valor do produto"));
    }
    
    //Método calcular
    public void calcular(){
        if(xEntrada < 20){
            
            ySaida = xEntrada * 1.45;
            
        }else{
            
            ySaida = xEntrada * 1.30;
        }
    }
    
    //Método exibir
    public void exibir(){

        JOptionPane.showMessageDialog
            (null, "O Valor da venda será: R$" + ySaida );
    }
}