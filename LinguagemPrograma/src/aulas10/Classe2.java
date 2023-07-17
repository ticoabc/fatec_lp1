/*O loop abaixo só termina quando o usuário digitar algo diferente de
“não”, a variável SALDO acumula o valor sempre que um ciclo do laço
é executado.*/
package aulas10;

import java.util.Scanner;
/*
@author Tiago de Freitas
Data: 17/07/2023
*/
public class Classe2 {
    
    public String resp = "não";
    public float valor = 0;
    public float saldo = 0;
    
    public void ler() {
        Scanner leitor = new Scanner(System.in);
        while (!resp.equals("sim")) {

            System.out.print("\tDigite valor: ");
            valor = leitor.nextFloat();

            saldo = saldo + valor;// acumulador
            System.out.print("\tDeseja sair?(sim/não) ");
            resp = leitor.next();
        }
    }

    public void exibir() {
        System.out.print("\n\tSaldo Acumulado: "
                + "" + String.format("%.2f", saldo));
        System.out.println();
        System.exit(0);
    }
}
