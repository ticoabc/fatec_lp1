/*
Criar um programa que entre com o nome e a
idade de uma pessoa e mostre o valor que ela deverá pagar.
(COMANDO IF ELSE E PERADORES RELACIONAIS E LÓGICOS)

Até 10 anos – R$ 30,00
Acima de 10 até 29 anos – R$ 60,00
Acima de 29 até 45 anos – R$ 120,00
Acima de 45 até 59 anos – R$ 150,00
Acima de 59 até 65 anos – R$ 250,00
Maior que 65 anos – R$ 400,00

 */
package aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago de Freitas
 */
public class ClassTarefaA2_2 {
    
    String nome;
    double idade, valor;
    
    //Método leitura
    public void leitura() {      
       
        nome =(JOptionPane.showInputDialog("Digite seu nome:"));
        idade = Double.parseDouble(JOptionPane.showInputDialog
                                        ("Digite sua idade: "));
    }
    
    //Método calcular
    public void calcular(){
        if(idade <= 10){
            valor = 30;
        }else if(idade > 10 && idade <= 29){
            valor = 60;
        }else if(idade > 29 && idade <= 45){
            valor = 120;
        }else if(idade > 45 && idade <= 59){
            valor = 150;
        }else if(idade > 59 && idade <= 65){
            valor = 250;
        }else if(idade > 65){
            valor = 400;
        }
    }
    
    //Método exibir
    public void exibir(){
        JOptionPane.showMessageDialog
            (null, "O Valor do plano será: R$" + valor);
    }
}
