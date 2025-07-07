package exercises.exercise05;

import exercises.exercise05.service.WageCalculator;

import java.util.Scanner;

public class Main {

    /* Exercício
    5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
    calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado.
    (Base para o Salário mínimo R$ 1.293,20).
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$");
        double minimumWage = scanner.nextDouble();

        System.out.print("Digite o valor do seu salário: R$");
        double userWage = scanner.nextDouble();

        double minimumWageNumber = WageCalculator.calculateWage(userWage, minimumWage);
        System.out.println("O usuário recebe " + minimumWageNumber + " salários-mínimos");

        scanner.close();
    }
}
