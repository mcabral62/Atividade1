package Questoes;

import java.util.Scanner;

public class Questao8 extends BaseQuestao {

    @Override
    public void Executar(Scanner scanner) {
        System.out.println("Questão 8");
        System.out.println("--------------------------------");

        System.out.print("Digite o preço inicial de fábrica do carro: R$ ");
        double precoFabrica = scanner.nextDouble();

        System.out.println("\nEscolha as opções desejadas para o carro:");
        System.out.println("a) Ar-condicionado: R$ 1750,00");
        System.out.println("b) Pintura Metálica: R$ 800,00");
        System.out.println("c) Vidro Elétrico: R$ 1200,00");
        System.out.println("d) Direção Hidráulica: R$ 2000,00");
        System.out.print("Digite as letras das opções desejadas, separadas por espaço (exemplo: a b c): ");

        scanner.nextLine();
        String escolhas = scanner.nextLine();

        double valorAdicional = 0;

        String[] opcoesEscolhidas = escolhas.split(" ");

        for (String opcao : opcoesEscolhidas) {
            if (opcao.equals("a")) {
                valorAdicional += 1750;
            }
            if (opcao.equals("b")) {
                valorAdicional += 800;
            }
            if (opcao.equals("c")) {
                valorAdicional += 1200;
            }
            if (opcao.equals("d")) {
                valorAdicional += 2000;
            }
        }

        double precoFinal = precoFabrica + valorAdicional;

        System.out.printf("\nPreço final do carro: R$ %.2f%n", precoFinal);

        System.out.println("--------------------------------");
        System.out.println("Fim da questão 8");
        System.out.println("--------------------------------");
    }
}
