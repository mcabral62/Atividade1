package Questoes;

import java.util.Scanner;

public class Questao5 extends BaseQuestao {

    @Override
    public void Executar(Scanner scanner) {

        double mor, mac, precoMor, precoMac, valorTotal, desconto = 0, valorCompra;

        System.out.println("Questao 5");
        System.out.println("--------------------------------");

        System.out.println("Digite a quantidade de morangos que deseja levar (em KG): ");
        mor = scanner.nextDouble();

        System.out.println("Digite a quantidade de maçãs que deseja levar (em KG): ");
        mac = scanner.nextDouble();

        if (mor < 5) {
            precoMor = mor * 7.50;
        } else {
            precoMor = mor * 5.30;
        }

        if (mac < 5) {
            precoMac = mac * 3.50;
        } else {
            precoMac = mac * 2.80;
        }

        valorCompra = precoMor + precoMac;

        if (valorCompra > 19 && mor + mac < 5) {
            desconto = valorCompra * 0.08;
            valorTotal = valorCompra - desconto;
        } else {
            valorTotal = valorCompra;
        }

        System.out.println("O valor final da compra é: R$ " + valorTotal + " com um desconto de: R$ " + desconto);

        System.out.println("--------------------------------");
        System.out.println("Fim da questão 5");
        System.out.println("--------------------------------");
    }

}
