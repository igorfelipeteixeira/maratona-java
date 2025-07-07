package exercises.exercise06;

import java.util.Scanner;

public class Main {

    /* Exercício
    6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double value = scanner.nextDouble();

        double newValue = value * 1.05;

        System.out.println("Efetuado um reajuste de 5%");
        System.out.println("Valor atual é de " + newValue);

        scanner.close();
    }
}
