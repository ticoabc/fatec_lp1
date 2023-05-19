/* */
package diversos;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class Retirement {
    
    double balance, goal = 0;
    float payment = 0;
    float interestRate;
    int year = 0;
    String input;
    
    Scanner leitor = new Scanner(System.in);
    
    //Método leitura
    public void leitura() {

        System.out.print("\n\tHow much money do you need to retire?: ");
        goal = leitor.nextDouble();

        System.out.print("\n\tHow much money will you contribute every year?: ");
        payment = leitor.nextFloat();

        System.out.print("\n\tInterest rate in %: ");
        interestRate = leitor.nextFloat();
        
        do{
            System.out.printf("\n\t"
            + "After year %d, your balance is %,.2f%n", year, balance);

            System.out.printf("\n\tReady to retire? (y/n): ");
            input = leitor.next();            
        }while (input.equals("N"));
    }
    
    //Método calcular
    public void calcular(){

//    do{
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;

//        System.out.printf("\n\t"
//        + "After year %d, your balance is %,.2f%n", year, balance);
//
//        System.out.printf("\n\tReady to retire? (y/n): ");
//        input = leitor.next();

//    }while (input.equals("N"));
    }

    //Método exibir
    public void exibir(){
        
        
//      System.out.println("\nYou can retire in " + year + "years.");
//      System.out.println("\nValor atual R$: " + payment);;;
//      System.out.println("Desconto de 9%");
//      System.out.println("Valor reajustado R$: " + balance);
    }
}
