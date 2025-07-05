package exercises.exercise02;

import java.util.Scanner;

public class Main {

    /* Exercício
    2 - Faça um algoritmo para receber um número qualquer
    e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num < 0) {
            if (num % 2 == 0) {
                System.out.println("O número " + num + " é par e negativo");
            } else {
                System.out.println("O número " + num + " é ímpar e negativo");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println("O número " + num + " é par e positivo");
            } else {
                System.out.println("O número " + num + " é ímpar e positivo");
            }
        }

        scanner.close();

    }
}
