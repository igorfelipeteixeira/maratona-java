package exercises.exercise04;

import java.util.Scanner;

public class Main {

    /* Exercício
    4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int predecessor = num - 1;
        int successor = num + 1;

        System.out.println("O antecessor de " + num + " é " + predecessor + " e o sucessor é " + successor);
        System.out.println("Representação na reta numérica: ..., " + predecessor + ", " + num + ", " + successor + ", ..." );

        scanner.close();
    }
}
