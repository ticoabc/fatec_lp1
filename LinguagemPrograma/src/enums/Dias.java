package enums;

/* @author Tiago de Freitas */
public enum Dias {
    
    DOMINGO(1), 
    SEGUNDA(2), 
    TERCA(3), 
    QUARTA(4), 
    QUINTA(5), 
    SEXTA(6), 
    SABADO(7);
    
    int valorDia;
    
    Dias(int dia){
        valorDia=dia;
    }
}
