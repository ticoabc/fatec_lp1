/*Os métodos em um código java devem ser codificadas logo após a
declaração dos atributos, no início da classe, os primeiros métodos
devem ser os métodos de leitura.*/
package aula8;

/* @author Tiago de Freitas */
public class ClassBascara {

    // atributos de leitura
    public double va;
    public double vb;
    public double vc;

    // métodos de leitura dos atributos
    void ler_A(double a) {
        this.va  = a;
    }

    void ler_B(double b) {
        this.vb = b;
    }

    void ler_C(double c) {
        this.vc = c;
    }
    
    // métodos para calcular os resultados
    double cal_Delta() {
        double delta = Math.pow(this.vb, 2) - 4 * this.va 
                * this.vc;
        return delta;
    }
    
    double cal_x1(double delta) {
        double x1 = (-this.vb + Math.sqrt(delta)) / (2 * this.va);
        return x1;
    }
    
    double cal_x2(double delta) {
        double x2 = (-this.vb - Math.sqrt(delta)) / (2 * this.va);
        return x2;
    }
    
    // método de exibição dos resultados
    public void exibir(){
        double delta = cal_Delta();
        System.out.print("\n\t*** Tela de Saída ***\n");
        System.out.print("\n\tValor de ....A: " + this.va);
        System.out.print("\n\tValor de ....B: " + this.vb);
        System.out.print("\n\tValor de ....C: " + this.vc);
        System.out.print("\n\tValor de Delta: " + delta);
        
        if (delta < 0){
            System.out.print(""
                    + "\n\tImpossível calcular x1 e x2"
                    + "\n\tDelta é negativo!");
            System.out.println();
            return;
        }else{ 
            double x1 = cal_x1( delta );
            double x2 = cal_x2( delta );
            System.out.print("\n\tValor de ....x1: "+ x1);
            System.out.print("\n\tValor de ....x2: "+ x2 + "\n");
        }
    }
}
