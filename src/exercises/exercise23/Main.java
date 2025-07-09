package exercises.exercise23;

import java.util.Scanner;

public class Main {

    /* Exercício
    23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
    As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e
    percentual de desconto do INSS. Imprima na tela o salário líquido final.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salário Líquido de Professor");
        System.out.print("Valor de hora aula: ");
        double hourPrice = scanner.nextDouble();

        System.out.print("Número de aulas lecionadas no mês: ");
        int numOfClasses = scanner.nextInt();

        System.out.print("Percentual de desconto do INSS: ");
        double tax = scanner.nextDouble() / 100;

        double grossSalary = hourPrice * numOfClasses;
        double netSalary = grossSalary * (1 - tax);

        System.out.println("Salário Líquido Final: " + netSalary);

        scanner.close();
    }
}