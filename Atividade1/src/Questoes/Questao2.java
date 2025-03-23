package Questoes;

import java.util.Scanner;

public class Questao2 extends BaseQuestao {

    public static int calculoArea(int base, int altura) {
        return base * altura;

    }

    @Override
    public void Executar(Scanner scanner) {

        System.out.println("Questão 2");
        System.out.println("--------------------------------");

        System.out.println("Digite a base e a altura do retangulo X: (em centimetros por gentileza.) ");
        int baseRetX = scanner.nextInt();
        int altRetX = scanner.nextInt();

        System.out.println("Digite a base e a altura do retangulo Y: (em centimetros por gentileza.)");
        int baseRetY = scanner.nextInt();
        int altRetY = scanner.nextInt();

        int areaX = calculoArea(baseRetX, altRetX);
        int areaY = calculoArea(baseRetY, altRetY);

        if (areaX > areaY) {
            System.out.println("O retangulo X tem a area maior: " + areaX + "cm²");
        } else if (areaY > areaX) {
            System.out.println("O retângulo Y tem a maior área: " + areaY + " cm²");
        } else {
            System.out.println("Os dois retângulos têm áreas iguais: " + areaX + " cm²");
        }
        System.out.println("--------------------------------");
        System.out.println("Fim da questão 2");
        System.out.println("--------------------------------");
    }

}
