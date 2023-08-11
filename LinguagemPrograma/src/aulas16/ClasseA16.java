/*Na classe Classe1.java temos o método calcularArea ( ) que possui o objeto
Fig do tipo Figura, ou seja, do tipo da SuperClasse Figura, no void main ( ),
podemos chamar as classes filhas também através do mesmo método.
Esse tipo de polimorfismo é chamado de anulação.*/
package aulas16;
/**
 * @author Tiago de Freitas 
 * Data: 09/08/2023
 */
public class ClasseA16 {

    public void calcularArea ( Figura Fig ){
        Fig.calcArea();
    }
    public static void main(String[] args) {

        ClasseA16 t1 = new ClasseA16 ( );
        t1.calcularArea ( new Figura ( ) );
        t1.calcularArea (new Triangulo ( ) );
        t1.calcularArea (new Quadrado ( ) );
        t1.calcularArea (new Pentagono ( ) ); 
    }
}
