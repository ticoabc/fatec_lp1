package aulas16.tarefa;

import java.util.Scanner;
/**
 * @author Tiago de Freitas 
 * Data: 11/08/2023
 */
public class ExecutaPoli {
    
    public static void main(String[] args) {
        
        try (Scanner leitor = new Scanner(System.in)) {
            Triangulo t1 = new Triangulo(2,4);
            Quadrado q1 = new Quadrado(10);
            Circulo c1 = new Circulo(10);          
            
            int tecla = 0;
            while (tecla != 99) {
                System.out.print("\nMenu Polimorfismo");
                System.out.print("\n[01] - Triângulo"
                                +"\n[02] - Quadrado"
                                +"\n[03] - Circulo"
                                +"\n[00] - Sair"
                                +"\n[--] - Item: ");
                tecla = leitor.nextInt();
                switch (tecla) {
                case 1:
                    lerDados(t1);
                    imprimeAreaDaForma(t1);
                break;
                case 2:
                    lerDados(q1);
                    imprimeAreaDaForma(q1);
                break;
                case 3:
                    lerDados(c1);
                    imprimeAreaDaForma(c1);
                break;                
                case 0:
                    System.out.println("\nPrograma Finalizado!\n");
                    System.exit(0);
                break;
                }
            }
        }
    }
    public static void lerDados(FiguraGeometrica l) {
        System.out.println(l.lerDados());
    }
	
    public static void imprimeAreaDaForma(FiguraGeometrica f) {
        System.out.println("Área do " + f + ": " + String.format("%.2f", f.calculaArea()));
    }
}