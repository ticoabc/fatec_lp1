package aulas16.tarefa;
/**
 * @author Tiago de Freitas 
 * Data: 11/08/2023
 */
public class Triangulo extends FiguraGeometrica{
    
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }  

    @Override
    public double lerDados() {
        System.out.print("\nValor de base passado por 'Parâmetro': ");
        return this.base;
    }

    @Override
    public double calculaArea() {
        return (base * altura) / 2 ;
    }

    @Override
    public String toString() {
        return "Triangulo";
    }   
}
