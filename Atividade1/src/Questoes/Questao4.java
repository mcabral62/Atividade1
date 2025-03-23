package Questoes;

import java.util.Scanner;

public class Questao4 extends BaseQuestao {

    @Override
    public void Executar(Scanner scanner) {

        System.out.println("Questão 4");
        System.out.println("--------------------------------");

        System.out.println("Digite o numero de alunos que existem na sala");
        int alunos = scanner.nextInt();
        System.out.println("Digite o numero de alunas que existem na sala");
        int alunas = scanner.nextInt();

        if (alunos > alunas) {
            System.out.println("O numero de alunos na sala é: " + alunos);
            System.out.println("O numero de alunas na sala é:" + alunas);
        } else if (alunas > alunos) {
            System.out.println("O numero de alunas na sala é:" + alunas);
            System.out.println("O numero de alunos na sala é: " + alunos);
        } else {
            System.out.println("O numero de alunos e alunas são iguais ");
            System.out.println("Alunos: " + alunos);
            System.out.println("Alunas: " + alunas);
        }

        System.out.println("--------------------------------");
        System.out.println("Fim da questão 4");
        System.out.println("--------------------------------");

    }

}
