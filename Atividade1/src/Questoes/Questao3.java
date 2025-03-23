package Questoes;

import java.util.Scanner;

public class Questao3 extends BaseQuestao {

    public static double conversao(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public void Executar(Scanner scanner) {

        System.out.println("Questão 3");
        System.out.println("--------------------------------");

        System.out.println("Digite a temperatura em graus Celsius que deseja fazer a conversão: ");
        double cel = scanner.nextDouble();

        double fahrenheit = conversao(cel);

        System.out.println("A temperatura de " + cel + " ºC convertida para Fahrenheit é: " + fahrenheit + "F");
        System.out.println("--------------------------------");
        System.out.println("Fim da questão 3");
        System.out.println("--------------------------------");
    }

}
