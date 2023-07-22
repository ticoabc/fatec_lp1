package aulas11;

import java.util.Scanner;

/*
@author Tiago de Freitas
Data: 21/07/2023
 */
public class ClasseTarefaB {
    
    public double idade = 0, cont = 0, cont1 = 0, cont2 = 0, 
                  salariomai = 0,salariomen = 0, salario,
                  media1 = 0, media2 = 0, saldo1 = 0,saldo2 = 0;
    
    public void LerIdade(Scanner leitor) {
        System.out.print("\n\tDigite a idade: ");
        idade = leitor.nextDouble();
        if (idade < 18) {
            cont1++;
            System.out.print("\tDigite o salário: ");
            salario = leitor.nextDouble();
            saldo1 += salario;
            media1 = saldo1 / cont1;
            if (cont1 == 1) {
                salariomen = salario;
                salariomai = salario;
            }else if (salario < salariomen){
                salariomen = salario;
            }else if (salario > salariomen) {
                salariomai = salario;
            }
        }
        if (idade >= 18) {
            cont2++;
            System.out.print("\tDigite o salário: ");
            salario = leitor.nextDouble();
            saldo2 += salario;
            media2 = saldo2 / cont2;
            if (cont2 == 1){
                salariomen = salario;
                salariomai = salario;
            }else if (salario < salariomai){
                salariomai = salario;
            }
        }
    }
}
