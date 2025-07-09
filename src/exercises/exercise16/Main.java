package exercises.exercise16;

import java.util.Scanner;

public class Main {

    /* Exercício
    16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
    verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valores inteiros para os seguintes lados de um trinângulo:");
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.print("c = ");
        int c = scanner.nextInt();

        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Os valores digitados não formam um triângulo");
            return;
        }

        if (a == b && a == c) {
            System.out.println("Os valores digitados formam um trinângulo equilátero");
        } else if (a == b || b == c || c == a) {
            System.out.println("Os valores digitados formam um trinângulo isósceles");
        } else {
            System.out.println("Os valores digitados formam um trinângulo escaleno");
        }

        scanner.close();
    }
}