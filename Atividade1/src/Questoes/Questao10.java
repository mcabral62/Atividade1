package Questoes;

import java.util.Scanner;

public class Questao10 extends BaseQuestao {

    public double calcularImpostoBruto(double salarioFuncionario, double salarioMinimo) {
        double salarioMinimos = salarioFuncionario / salarioMinimo;
        double impostoBruto = 0;

        if (salarioMinimos > 12) {
            impostoBruto = salarioFuncionario * 0.20;
        } else if (salarioMinimos > 5) {
            impostoBruto = salarioFuncionario * 0.08;
        } else {
            impostoBruto = 0;
        }

        return impostoBruto;
    }

    public double calcularImpostoComAdicional(double impostoBruto) {
        return impostoBruto * 1.04;
    }

    @Override
    public void Executar(Scanner scanner) {

        System.out.println("Questao 10");
        System.out.println("--------------------------------");

        System.out.print("Digite o valor do salário-mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int dependentes = scanner.nextInt();

        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto normal já paga pelo funcionário: R$ ");
        double impostoPago = scanner.nextDouble();

        double impostoBruto = calcularImpostoBruto(salarioFuncionario, salarioMinimo);
        double impostoComAdicional = calcularImpostoComAdicional(impostoBruto);

        double impostoDevido = impostoComAdicional - impostoPago;

        if (impostoDevido < 0) {
            impostoDevido = 0;
        }

        System.out.printf("Imposto bruto: R$ %.2f%n", impostoBruto);
        System.out.printf("Imposto com taxa adicional de 4%%: R$ %.2f%n", impostoComAdicional);
        System.out.printf("Imposto a ser pago pelo funcionário: R$ %.2f%n", impostoDevido);
        System.out.println("Número de dependentes: " + dependentes);

        System.out.println("--------------------------------");
        System.out.println("Fim da questão 10");
        System.out.println("--------------------------------");
    }
}
