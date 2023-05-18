package executa;
/*@author Tiago de Freitas */
import java.util.Scanner;
import aula1.ClasseVolume;
import aula1.ClasseTriangulo;
import aula1.ClassExercicio_1;
import aula1.ClassExercicio_2;
import aula2.ClassExercicioA2_1;
import aula2.ClassExercicioA2_2;
import vetores.ClassVetExemplo_1;
import aula2.ClassTarefaA2_T1;
import aula2.ClassTarefaA2_T2;
import aula3.ClassExercicioA3_1;
import aula3.ClassExercicioA3_2;
import aula3.ClassExercicioA3_3;
import aula3.ClassTarefaA3_T1;
import aula3.ClassTarefaA3_T2;
import aula3.ClassTarefaA3_T3;
import aula4.ClassExemploA4_1;
import aula4.ClassExemploA4_2;
import aula4.ClassTarefaA4_T1;
import aula4.ClassTarefaA4_T2;
import vetores.ClassVetExemplo_2;
import vetores.ClassVetExemplo_3;
import vetores.ClassVetExercicio_2;


public class ExecutaPrograma {

    public static void main(String[] args) {
        //Instanciamento da classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Instanciamento da ClasseVolume
        ClasseVolume v = new ClasseVolume();
        /*System.out.println("Digite os dados solicitados: ");
        v.leitura();
        v.calcular();
        v.exibir();*/
       
        //Instanciamento da ClasseTriangulo
        ClasseTriangulo t = new ClasseTriangulo();
        /*System.out.println("Digite os dados solicitados: ");
        t.leitura();
        t.calcular();
        t.exibir();*/
        
        //Instanciamento da ClassExercicio_1
        ClassExercicio_1 ex1 = new ClassExercicio_1();
        /*ex1.leitura();
        ex1.calcular();
        ex1.exibir();*/
        
        //Instanciamento da ClassExercicio_2
        ClassExercicio_2 ex2 = new ClassExercicio_2();
        /*ex2.leitura();
        ex2.calcular();
        ex2.exibir();*/
        
        //Instanciamento da ClassExercicioA2_1
        ClassExercicioA2_1 a2ex1 = new ClassExercicioA2_1();
        //a2ex1.leitura();
        //a2ex1.exibir();*/
        
        //Instanciamento da ClassExercicioA2_2
        ClassExercicioA2_2 a2ex2 = new ClassExercicioA2_2();
        /*a2ex2.leitura();
        a2ex2.calcular();
        a2ex2.exibir();*/
        
        //Instanciamento da ClassTarefaA2_T1
        ClassTarefaA2_T1 a2t1 = new ClassTarefaA2_T1();
        /*a2t1.leitura();
        a2t1.calcular();
        a2t1.exibir();*/
        
        //Instanciamento da ClassTarefaA2_T2
        ClassTarefaA2_T2 a2t2 = new ClassTarefaA2_T2();
        /*a2t2.leitura();
        a2t2.calcular();
        a2t2.exibir();*/
        
        //Instanciamento da ClassExercicioA3_1
        ClassExercicioA3_1 a3ex1 = new ClassExercicioA3_1();
        /*a3ex1.leitura();
        a3ex1.calcular();
        a3ex1.exibir();*/
        
        //Instanciamento da ClassExercicioA3_2
        ClassExercicioA3_2 a3ex2 = new ClassExercicioA3_2();
        /*a3ex2.leitura();
        a3ex2.calcular();
        a3ex2.exibir();*/
        
        //Instanciamento da ClassExercicioA3_2
        ClassExercicioA3_3 a3ex3 = new ClassExercicioA3_3();
        /*a3ex3.leitura();
        a3ex3.calcular();
        a3ex3.exibir();*/
        
        //Instanciamento da ClassTarefaA3_T1
        ClassTarefaA3_T1 a3t1 = new ClassTarefaA3_T1();
        /*a3t1.leitura();
        a3t1.calcular();
        a3t1.exibir();*/
        
        //Instanciamento da ClassTarefaA3_T2
        ClassTarefaA3_T2 a3t2 = new ClassTarefaA3_T2();
        /*a3t2.leitura();
        a3t2.calcular();
        a3t2.exibir();*/
        
        //Instanciamento da ClassTarefaA3_T3
        ClassTarefaA3_T3 a3t3 = new ClassTarefaA3_T3();
        /*t3a3.leitura();
        t3a3.calcular();
        t3a3.exibir();*/
        
        ClassExemploA4_1 a4exp1 = new ClassExemploA4_1();
        
        ClassExemploA4_2 a4exp2 = new ClassExemploA4_2();
        
        ClassTarefaA4_T1 a4t1 = new ClassTarefaA4_T1();
        
        ClassTarefaA4_T2 a4t2 = new ClassTarefaA4_T2();
        
        /*//Nesta classe não foi necessário instanciar para utilizar os 
        // atributos dentro do main
        ClassVetExemplo_2.controle(sc);*/
        
        //Instanciamento da ClassVetExemplo_3
        ClassVetExemplo_3 vetex3 = new ClassVetExemplo_3();
        /*vetex3.novaLinha(sc);
        vetex3.exibir();*/
        
        /*//Nesta classe não foi necessário instanciar para utilizar os 
        // atributos dentro do main
        ClassVetExercicio_2.controle(sc);*/
        
        int item = 0;
        while (true){
            System.out.print("\n>>> Exercícios <<<");
            System.out.print("\n1 - Aula 1");
            System.out.print("\n2 - Aula 2");
            System.out.print("\n3 - Aula 3");
            System.out.print("\n4 - Aula 4");
            System.out.print("\n99 - Vetores");
            System.out.print("\n0 - Finalizar ");
            System.out.print("\n\nDigite a operação desejada: ");
            item = sc.nextInt();
            
            switch (item){
                case 1:
                while(true){
                    System.out.print("\n\t>>> Exercícios - Aula 1<<<");
                    System.out.print("\n\t1 - Exercício 1");
                    System.out.print("\n\t2 - Exercício 2");
                    System.out.print("\n\t3 - Triângulo");
                    System.out.print("\n\t4 - Volume");
                    System.out.print("\n\t0 - Finalizar ");
                    System.out.print("\n\n\tDigite a operação desejada: ");
                    item = sc.nextInt();
                    switch (item){
                        case 1:
                        ex1.leitura();
                        ex1.calcular();
                        ex1.exibir();
                        break;
                        
                        case 2:
                        ex2.leitura();
                        ex2.calcular();
                        ex2.exibir();
                        break;
                        
                        case 3:
                        t.leitura();
                        t.calcular();
                        t.exibir();
                        break;
                        
                        case 4:
                        v.leitura();
                        v.calcular();
                        v.exibir();
                        break;
                        
                        case 0:
                        System.exit(0);
                        break;
                    }
                }
                case 0:
                    System.exit(0);
                    break;
            }
            switch (item){
                case 2:
                while(true){
                    System.out.print("\n\t>>> Exercícios - Aula 2<<<");
                    System.out.print("\n\t1 - ClassExercicioA2_1");
                    System.out.print("\n\t2 - ClassExercicioA2_2");
                    System.out.print("\n\t3 - ClassTarefaA2_T1");
                    System.out.print("\n\t4 - ClassTarefaA2_T2");
                    System.out.print("\n\t0 - Finalizar ");
                    System.out.print("\n\n\tDigite a operação desejada: ");
                    item = sc.nextInt();
                    switch (item){
                        case 1:
                        a2ex1.leitura();
                        break;
                        
                        case 2:
                        a2ex2.leitura();
                        a2ex2.calcular();
                        a2ex2.exibir();
                        break;
                        
                        case 3:
                        a2t1.leitura();
                        a2t1.calcular();
                        a2t1.exibir();
                        break;
                        
                        case 4:
                        a2t2.leitura();
                        a2t2.calcular();
                        a2t2.exibir();
                        break;
                        
                        case 0:
                        System.exit(0);
                        break;
                    }
                }
            }
            switch (item){
                case 3:
                while(true){
                    System.out.print("\n\t>>> Exercícios - Aula 3<<<");
                    System.out.print("\n\t1 - ClassExercicioA3_1");
                    System.out.print("\n\t2 - ClassExercicioA3_2");
                    System.out.print("\n\t3 - ClassExercicioA3_3");
                    System.out.print("\n\t4 - ClassTarefaA3_T1");
                    System.out.print("\n\t5 - ClassTarefaA3_T2");
                    System.out.print("\n\t6 - ClassTarefaA3_T3");
                    System.out.print("\n\t0 - Finalizar ");
                    System.out.print("\n\n\tDigite a operação desejada: ");
                    item = sc.nextInt();
                    switch (item){
                        case 1:
                        a3ex1.leitura();
                        a3ex1.calcular();
                        a3ex1.exibir();
                        break;

                        case 2:
                        a3ex2.leitura();
                        a3ex2.calcular();
                        a3ex2.exibir();
                        break;

                        case 3:
                        a3ex3.leitura();
                        a3ex3.calcular();
                        a3ex3.exibir();
                        break;

                        case 4:
                        a3t1.leitura();
                        a3t1.calcular();
                        a3t1.exibir();
                        break;

                        case 5:
                        a3t2.leitura();
                        a3t2.calcular();
                        a3t2.exibir();
                        break;

                        case 6:
                        a3t3.leitura();
                        a3t3.calcular();
                        a3t3.exibir();
                        break;

                        case 0:
                        System.exit(0);
                        break;
                    }
                }
            }
            switch (item){
                case 4:
                while(true){
                System.out.print("\n\t>>> Exercícios - Aula 4<<<");
                System.out.print("\n\t1 - ClassExemploA4_1");
                System.out.print("\n\t2 - ClassExemploA4_1");
                System.out.print("\n\t3 - ClassTarefaA4_T1");
                System.out.print("\n\t4 - ClassTarefaA4_T2");
                System.out.print("\n\t0 - Finalizar ");
                System.out.print("\n\n\tDigite a operação desejada: ");
                item = sc.nextInt();
                switch (item){
                    case 1:
                    a4exp1.leitura();
                    a4exp1.entrada();
                    a4exp1.calcular();
                    a4exp1.exibir();
                    break;
                    
                    case 2:
                    a4exp2.leitura();
                    a4exp2.entrada();
                    a4exp2.calcular();
                    a4exp2.exibir();
                    break;
                    
                    case 3:
                    a4t1.leitura();
                    a4t1.entrada();
                    a4t1.calcular();
                    a4t1.exibir();
                    break;
                    
                    case 4:
                    a4t2.leitura();
                    a4t2.entrada();
                    a4t2.calcular();
                    a4t2.exibir();
                    break;
                    
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }
            switch (item){
                case 99:
                    while(true){
                    System.out.print("\n\t>>>Exercícios com Vetores<<<");
                    System.out.print("\n\t1 - ClassVetExemplo_1");
                    System.out.print("\n\t2 - ClassVetExemplo_2");
                    System.out.print("\n\t3 - ClassVetExemplo_3");
                    System.out.print("\n\t4 - ClassVetExemplo_4");
                    System.out.print("\n\t5 - ClassVetExercicio_2");
                    System.out.print("\n\t0 - Finalizar ");
                    System.out.print("\n\n\tDigite a operação desejada: ");
                    item = sc.nextInt();
                    switch (item){
                    case 1:
                    //Nesta classe não foi necessário instanciar para utilizar os 
                    // atributos dentro do main
                    ClassVetExemplo_1.exibir();
                    break;
                    
                    case 2:
                    //Nesta classe não foi necessário instanciar para utilizar os 
                    // atributos dentro do main
                    ClassVetExemplo_2.controle(sc);
                    break;
                    
                    case 3:
                    vetex3.novaLinha(sc);
                    vetex3.exibir();
                    break;
                    
                    case 5:
                    //Nesta classe não foi necessário instanciar para utilizar os 
                    // atributos dentro do main
                    ClassVetExercicio_2.controle(sc);
                    break;                   
                    
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }
        }
        //sc.close();
    }
}