/*No escopo global foi criado a constante PI e o ATRIBUTO MEDIA1.*/
package aula7;

import java.util.Scanner;

/*@author Tiago de Freitas*/
public class ClassExemploA7_1{
    
    public final double PI = 3.14; // constante
    public double MEDIA1 = 5; // atributo global da classe
        
    public void mostrar(){
        double MEDIA2 = 9;// variavel local do método
        System.out.print("\n\tVariável local do método = " + MEDIA2);
    }
    
    public void listar() {
        System.out.print("\n\tAtributo global da classe "
                + "PI= " + PI);
        System.out.print("\n\tAtributo global da classe "
                + "Média1= " + MEDIA1);
        //System.out.print("Média2 = "+ MEDIA2); // Erro
    }
}
