package Questoes;

import java.util.Scanner;

public class Questao1 extends BaseQuestao {

    public int maiorNumero(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    @Override
    public void Executar(Scanner scanner) {

        System.out.println("Questao 1");
        System.out.println("--------------------------------");
        System.out.println("Digite dois numeros inteiros:");

        int n1 = scanner.nextInt();

        int n2 = scanner.nextInt();

        int maior = maiorNumero(n1, n2);

        System.out.println("O maior numero é: " + maior);
        System.out.println("--------------------------------");
        System.out.println("Fim da questão 1");
        System.out.println("--------------------------------");

    }

}
