package Questoes;

import java.util.Scanner;

public class Questao7 extends BaseQuestao {

    @Override
    public void Executar(Scanner scanner) {
        System.out.println("Questão 7");
        System.out.println("--------------------------------");

        System.out.print("Digite o total gasto pelo cliente: ");
        double valorGasto = scanner.nextDouble();

        int opcoes = exibirOpcoesEPegarEscolha(scanner);

        switch (opcoes) {
            case 1:
                calcularPagamentoAVista(valorGasto);
                break;
            case 2:
                calcularPagamentoDuasVezes(valorGasto);
                break;
            case 3:
                if (valorGasto > 100) {
                    calcularPagamentoParcelado(valorGasto, scanner);
                } else {
                    System.out.println("Para pagamento parcelado, o total gasto deve ser acima de R$ 100,00.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("--------------------------------");
        System.out.println("Fim da questão 7");
        System.out.println("--------------------------------");
    }

    private int exibirOpcoesEPegarEscolha(Scanner scanner) {
        System.out.println("\nEscolha uma opção de pagamento:");
        System.out.println("1 - À vista com 10% de desconto");
        System.out.println("2 - Em duas vezes (sem juros)");
        System.out.println("3 - De 3 até 10 vezes com 3% de juros ao mês (para compras acima de R$ 100,00)");
        System.out.print("Digite sua opção: ");
        return scanner.nextInt();
    }

    private void calcularPagamentoAVista(double totalGasto) {
        double valorComDesconto = totalGasto - (totalGasto * 0.10);
        System.out.printf("Valor a ser pago à vista com 10%% de desconto: R$ %.2f%n", valorComDesconto);
    }

    private void calcularPagamentoDuasVezes(double totalGasto) {
        double valorParcela = totalGasto / 2;
        System.out.printf("Pagamento em duas vezes de R$ %.2f (sem juros)%n", valorParcela);
    }

    private void calcularPagamentoParcelado(double totalGasto, Scanner scanner) {
        System.out.print("Digite o número de parcelas (3 a 10): ");
        int numParcelas = scanner.nextInt();

        if (numParcelas >= 3 && numParcelas <= 10) {
            double totalComJuros = totalGasto * Math.pow(1.03, numParcelas);
            double valorParcela = totalComJuros / numParcelas;

            System.out.printf("Pagamento em %d parcelas de R$ %.2f (total com juros: R$ %.2f)%n",
                    numParcelas, valorParcela, totalComJuros);
        } else {
            System.out.println("Número de parcelas inválido! Deve ser entre 3 e 10.");
        }
    }
}
