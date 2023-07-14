package aula9;
/* @author Tiago de Freitas */
public class Empresa extends Cliente{
    
    public String rua;

    public Empresa(String rua, String tp) {
        super(tp);// Chamando o construtor da classe Cliente
        this.rua = rua;
    } 
}