package aulas16.tarefa;
/**
 * @author Tiago de Freitas 
 * Data: 11/08/2023
 */
public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double lerDados() {
        System.out.print("\nValor do raio passado por 'Parâmetro': ");
        return raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "Circulo";
    }
}