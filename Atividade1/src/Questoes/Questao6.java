package Questoes;

import java.util.Scanner;

public class Questao6 extends BaseQuestao {

    @Override
    public void Executar(Scanner scanner) {
        System.out.println("Questão 6");
        System.out.println("--------------------------------");

        System.out.print("Digite a hora de início: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite os minutos de início: ");
        int minutoInicio = scanner.nextInt();

        System.out.print("Digite a hora de término: ");
        int horaFim = scanner.nextInt();
        System.out.print("Digite os minutos de término: ");
        int minutoFim = scanner.nextInt();

        int inicioTotalMinutos = horaInicio * 60 + minutoInicio;
        int fimTotalMinutos = horaFim * 60 + minutoFim;

        if (fimTotalMinutos < inicioTotalMinutos) {
            fimTotalMinutos += 24 * 60;
        }

        int duracaoMinutos = fimTotalMinutos - inicioTotalMinutos;
        int horasDuracao = duracaoMinutos / 60;
        int minutosDuracao = duracaoMinutos % 60;

        System.out.println("Duração do jogo: " + horasDuracao + " horas e " + minutosDuracao + " minutos.");
        System.out.println("--------------------------------");
        System.out.println("Fim da questão 6");
        System.out.println("--------------------------------");

    }

}
