package Questoes;

import java.util.Scanner;

public class Questao9 extends BaseQuestao {

    @Override
    public void Executar(Scanner scanner) {

        System.out.println("Questao 5");
        System.out.println("--------------------------------");

        System.out.println("Digite o tipo de consumidor (residencial, comercial, industrial): ");
        String tipoConsumidor = scanner.nextLine().toLowerCase();

        System.out.println("Digite o consumo de água em metros cúbicos (m3): ");
        double consumo = scanner.nextDouble();

        double contaFinal = calcularConta(tipoConsumidor, consumo);

        System.out.printf("O valor a ser pago pela conta de água é: R$ %.2f%n", contaFinal);

        System.out.println("--------------------------------");
        System.out.println("Fim da questão 5");
        System.out.println("--------------------------------");
    }

    public double calcularConta(String tipoConsumidor, double consumo) {
        double valorConta = 0;

        switch (tipoConsumidor) {
            case "residencial":
                valorConta = 5.00 + (consumo * 0.05);
                break;
            case "comercial":
                if (consumo <= 80) {
                    valorConta = 500.00;
                } else {
                    valorConta = 500.00 + ((consumo - 80) * 0.25);
                }
                break;
            case "industrial":
                if (consumo <= 100) {
                    valorConta = 800.00;
                } else {
                    valorConta = 800.00 + ((consumo - 100) * 0.04);
                }
                break;
            default:
                System.out.println("Tipo de consumidor inválido.");
                break;
        }

        return valorConta;
    }
}
