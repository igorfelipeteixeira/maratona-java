package exercises.exercise17;

import java.util.Scanner;

public class Main {

    /* Exercício
    17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e
    calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
    Fórmula: C = (5 * ( F-32) / 9)
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Fahrenheit: ");
        double F = scanner.nextDouble();

        double C = 5 * (F-32) / 9;

        System.out.println("Temperatura: " + F + "°F");
        System.out.println("Temperatura: " + C + "°C");

        scanner.close();
    }
}
