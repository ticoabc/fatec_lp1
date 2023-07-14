/* */
package aula9;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class ClassA9Controle {
    Scanner leitor = new Scanner(System.in);
    int tecla=0;
    
    Classe1 cl1 = new Classe1();// instanciamento de ob1 com new
    Classe1 cl2 = new Classe1();// instanciamento de ob2 com new
    
    //Classe2 cla2 = new Classe2();
    
    public void leituraControle(){
    while (tecla !=2){
        System.out.print(""
                + "\n\t[X] Menu Aula 9"
                + "\n\t[1] Exemplo 1"
                + "\n\t[2] Exemplo 2"
                + "\n\t[3] Empresa"
                + "\n\t[4] "
                + "\n\t[0] Finalizar a Aula"
                + "\n\titem: ");
        tecla = leitor.nextInt();
        switch (tecla){
            case 1:
                cl1.listarA9();
                System.out.println("\t" + (cl1.x + cl2.x));
                break;
            case 2:
                Classe2 c1 = new Classe2();
                Classe2 c2 = new Classe2(c1.x);
                break;
            case 3:
                String meuTipo = "\tTipo: Pessoa Física";
		String rua = "\tRua A";
		
                // instaciando objeto c1 com argumentos
		Empresa emp = new Empresa(meuTipo, rua);
                
                // Argumento da classe Cliente
                emp.telefone = "\n\tTelefone: 11-955443322";
                
                // Argumento da classe Empresa
                emp.rua = emp.rua + ", número 9";
                
                System.out.println(emp.telefone);
                System.out.println(emp.rua);
                
                emp.exibir();// Método da classe Cliente
                // Argumento da classe Cliente
                emp.tipo = "\tTipo: Pessoa Jurídica";
                // Método da classe Cliente, porém exibindo o argumento da classe empresa
                emp.exibir();
                //System.exit(0);
                break;
            case 0:
                System.out.println("\n\tO programa será finalizado!");
                System.exit(0);
                break;
            }
        }
    }
}
