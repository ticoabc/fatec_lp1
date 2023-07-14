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
import aula5.ClassExemploA5_1;
import aula5.ClassExemploA5_2;
import aula5.ClassExemploA5_3;
import aula5.ClassExemploA5_4;
import aula6.Aula6Principal;
import aula7.Aula7Principal;
import aula8.Aula8Principal;
import aula8.ClassControle;
import aula9.ClassA9Controle;
import diversos.Comparison;
import diversos.DiasdaSemana;
import diversos.ForClass;
import diversos.Jokempo;
import diversos.LotteryOdds;
import diversos.MatrixClass;
import diversos.PedraPapelTesoura;
import diversos.Retirement;
import diversos.WhileClass;
import vetores.ClassVetExemplo_2;
import vetores.ClassVetExemplo_3;
import vetores.ClassVetExercicio_2;
import vetores.ClassVetExercicio_4;

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
        
        
        ClassExemploA5_1 a5exp1 = new ClassExemploA5_1();
        ClassExemploA5_2 a5exp2 = new ClassExemploA5_2();
        ClassExemploA5_3 a5exp3 = new ClassExemploA5_3();
        ClassExemploA5_4 a5exp4 = new ClassExemploA5_4();
        
        Aula6Principal a6exp1 = new Aula6Principal();
        Aula7Principal a7exp = new Aula7Principal();
        //Aula8Principal a8exp = new Aula8Principal();
        ClassControle a8td = new ClassControle();
        //Aula8
        //ClassA8Controle a8ct = new ClassA8Controle();
        ClassA9Controle a9ct = new ClassA9Controle();
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
        
        ClassVetExercicio_4 vetexc4 = new ClassVetExercicio_4();
        
        //Diversos
        DiasdaSemana dia = new DiasdaSemana();
        Retirement ret = new Retirement();
        LotteryOdds lot = new LotteryOdds();
        MatrixClass mtx = new MatrixClass();
        ForClass fcl = new ForClass();
        WhileClass whl = new WhileClass();
        Comparison cpm = new Comparison();
        PedraPapelTesoura ppt = new PedraPapelTesoura();
        Jokempo jkp = new Jokempo();
        
        int item = 0;
        while (true){
            System.out.print("\n>>> Exercícios <<<");
            System.out.print("\n1 - Aula 1");
            System.out.print("\n2 - Aula 2");
            System.out.print("\n3 - Aula 3");
            System.out.print("\n4 - Aula 4");
            System.out.print("\n5 - Aula 5");
            System.out.print("\n6 - Aula 6");
            System.out.print("\n7 - Aula 7");
            System.out.print("\n8 - Aula 8");
            System.out.print("\n9 - Aula 9");
            System.out.print("\n20 - Diversos");
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
                case 5:
                while(true){                        
                    System.out.print("\n\t>>> Exercícios - Aula 5<<<");
                    System.out.print("\n\t1 - ClassExemploA5_1");
                    System.out.print("\n\t2 - ClassExemploA5_2");
                    System.out.print("\n\t3 - ClassExemploA5_3");
                    System.out.print("\n\t4 - ClassExemploA5_4");
                    System.out.print("\n\t0 - Finalizar ");
                    System.out.print("\n\n\tDigite a operação desejada: ");
                    item = sc.nextInt();
                    switch (item){
                    case 1:
                    a5exp1.exibir();
                    break;
                    
                    case 2:
                    a5exp2.leitura();
                    break;
                    
                    case 3:
                    a5exp3.leitura();
                    break;
                    
                    case 4:
                    a5exp4.leitura();                    
                    break;
                    
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }
            
            switch (item){
                case 6:
                while(true){                      
                    System.out.print("\n\t>>> Exercícios - Aula 6<<<");
                    a6exp1.leitura();
                    item = sc.nextInt();
                    switch (item){       
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }
            
            switch (item){
                case 7:
                while(true){
                    System.out.print("\n\t>>> Exercícios - Aula 7<<<");
                    a7exp.leituraA7();
                    item = sc.nextInt();
                    switch (item){
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }
            switch (item){
                case 8:
                while(true){
                    System.out.print("\n\t>>> Exercícios - Aula 8<<<");
                    a8td.leituraControle();
                    item = sc.nextInt();
                    switch (item){
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }            
            switch (item){
                case 9:
                while(true){
                    System.out.print("\n\t>>> Exercícios - Aula 9<<<");
                    a9ct.leituraControle();
                    item = sc.nextInt();
                    switch (item){
                    case 0:
                    System.exit(0);
                    break;
                    }
                }
            }
            switch (item){
                case 20:
                    while(true){
                    System.out.print("\n\n\t>>>Exercícios Diversos<<<");
                    System.out.print("\n\t1 - DiasdaSemana");
                    System.out.print("\n\t2 - Retirement");
                    System.out.print("\n\t3 - LotteryOdds");
                    System.out.print("\n\t4 - MatrixClass");
                    System.out.print("\n\t5 - ForClass");
                    System.out.print("\n\t6 - WhileClass");
                    System.out.print("\n\t7 - Comparison");
                    System.out.print("\n\t8 - Pedra Papel Tesoura");
                    System.out.print("\n\t9 - JoKemPo");
                    System.out.print("\n\t0 - Finalizar ");
                    System.out.print("\n\n\tDigite a operação desejada: ");
                    item = sc.nextInt();
                    switch (item){
                    case 1:
                    dia.leitura();
                    break;
                    
                    case 2:
                    ret.leitura();
                    ret.calcular();
                    break;
                    
                    case 3:
                    lot.leitura();
                    lot.calcular();
                    break;
                    
                    case 4:
                    mtx.leitura();
                    break;
                    
                    case 5:
                    fcl.leitura();
                    break;
                    
                    case 6:
                    whl.leitura();                    
                    break;
                    
                    case 7:
                    cpm.leitura();
                    cpm.calcular();
                    break;
                    
                    case 8:
                    ppt.jogo();
                    break;
                    
                    case 9:
                    jkp.JoKePo();
                    jkp.vencedor();
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
                    System.out.print("\n\t6 - ClassVetExercicio_4");
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
                    
                    case 6:
                    //Nesta classe não foi necessário instanciar para utilizar os 
                    // atributos dentro do main
                    vetexc4.novaLinha(sc);
                    vetexc4.exibir();
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