package aula9;
/* @author Tiago de Freitas */
public class Classe2 {
    
    public int x [ ]={1,2,3,4,5};

    public Classe2() { }// construtor vazio
    
    Classe2 (int [] tb){
        for(int valor: tb) {
            System.out.println("\t" + valor);
        }
    }
}
