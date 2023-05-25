/*
 */
package diversos;

import java.util.Scanner;

/* @author Tiago de Freitas */
public class WhileClass {
    
    //Método menu leitura
    public void leitura() {
        Scanner sc = new Scanner(System.in);

        int item = 0;
        while (true) {
            System.out.print("\n\tExercícios com while");
            System.out.print("\n\t1 - Laço While 1");
            System.out.print("\n\t2 - Laço While 2");
            System.out.print("\n\t3 - Laço While 3");
            System.out.print("\n\t4 - Laço While 4");
            System.out.print("\n\t5 - Laço While 5");
            System.out.print("\n\t0 - Finalizar ");
            System.out.print("\n\n\tDigite a operação desejada: ");
            item = sc.nextInt();
            switch (item) {
            case 1:
                System.out.print("\n\t1 - Contador / Diminuir");
                contador();
            break;
            
            case 2:
                System.out.print("\n\t2 - Saldo Acumulado");
                saldoAcumulado();
            break;
            
            case 3:
                System.out.print("\n\t3 - Saldo e Média\n");
                saldoEmedia();
            break;
            
            case 4:
                System.out.print("\n\t4 - ContZeros\n");
                contaZeros();
            break;
            
            case 5:
            break;
            
            case 0:
                System.exit(0);
            break;
            }
        }
    }
    
    protected void contador() {
        int contador = 0;
        int diminuir = 20;

        while (contador < 10) {
            contador = contador + 1;
            diminuir = diminuir - 2;
        }
        System.out.println("\n\tContador: " + contador);
        System.out.println("\n\tDiminuir: " + diminuir);
    }
    
    protected void saldoAcumulado() {
        String resp = "não";
	float valor = 0, saldo = 0;
        Scanner leitor = new Scanner(System.in);
        
        while (!resp.equals("sim")) {

        System.out.print("\n\tDigite valor: ");
        valor = leitor.nextFloat();

        saldo = saldo + valor;// acumulador
        
        System.out.print("\n\tDeseja sair(sim ou não)? ");
        resp = leitor.next();
        }
        System.out.print("\n\tSaldo Acumulado: "
                        + String.format("%.2f",saldo ) + "\n" );
    }
    
    protected void saldoEmedia() {
        Scanner leitor = new Scanner(System.in);
	int cont = 1;
	float valor = 0, saldo = 0, media = 0;
        while(cont<=10){
            System.out.print("\t" + cont + "º Valor: ");
            valor = leitor.nextFloat();
            saldo = saldo + valor;//acumulador
            cont = cont + 1; // contador
        }
            media=saldo/cont;
            System.out.printf("\n\tSaldo: "+String.format("%.2f",saldo));
            System.out.printf("\n\tMedia: "+String.format("%.1f",media)+ "\n");
    }
    
    protected void contaZeros() {
        int cont = 0;
        int contzeros = 0;
        String x, texto = null;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\n\tDigite um texto com 'zeros(0) "
                                        + "entre as letras': ");
        texto = leitor.next();
        
        while (cont < texto.length()) {
            x = texto.substring(cont, cont + 1);
            if (x.equals("0")) {
                contzeros++;
            }
            cont++;
        }
        System.out.print("\tTexto Digitado: " + texto);
        System.out.print("\n\tQuantidade de zeros: " + contzeros + "\n");        
    }
    
}
