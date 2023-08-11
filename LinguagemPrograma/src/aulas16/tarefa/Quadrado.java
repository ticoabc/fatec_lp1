package aulas16.tarefa;
/**
 * @author Tiago de Freitas 
 * Data: 11/08/2023
 */
public class Quadrado extends FiguraGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }    
    
    @Override
    public double lerDados() {
        System.out.print("\nValor do lado passado por 'Parâmetro': ");
        return lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado";
    }   
}
