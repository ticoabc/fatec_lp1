package aula9;
/* @author Tiago de Freitas */
public class Cliente extends Object{
    
    public String tipo;
    public String telefone;

    Cliente(String tp) {
        tipo = new String();
        this.tipo = tp;
    }
    
    public void exibir(){
        System.out.println(tipo);
    }
}
