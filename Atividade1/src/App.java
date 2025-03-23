import java.util.Scanner;

import Questoes.Questao1;
import Questoes.Questao10;
import Questoes.Questao2;
import Questoes.Questao3;
import Questoes.Questao4;
import Questoes.Questao5;
import Questoes.Questao6;
import Questoes.Questao7;
import Questoes.Questao8;
import Questoes.Questao9;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inicio do trabalho");
        System.out.println("--------------------------------");

        Questao1 questao1 = new Questao1();
        Questao2 questao2 = new Questao2();
        Questao3 questao3 = new Questao3();
        Questao4 questao4 = new Questao4();
        Questao5 questao5 = new Questao5();
        Questao6 questao6 = new Questao6();
        Questao7 questao7 = new Questao7();
        Questao8 questao8 = new Questao8();
        Questao9 questao9 = new Questao9();
        Questao10 questao10 = new Questao10();

        questao1.Executar(scanner);
        questao2.Executar(scanner);
        questao3.Executar(scanner);
        questao4.Executar(scanner);
        questao5.Executar(scanner);
        questao6.Executar(scanner);
        questao7.Executar(scanner);
        questao8.Executar(scanner);
        questao9.Executar(scanner);
        questao10.Executar(scanner);

        System.out.println("Inicio do trabalho");
        System.out.println("--------------------------------");

        scanner.close();

    }

}
