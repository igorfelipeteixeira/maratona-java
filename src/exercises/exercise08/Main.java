package exercises.exercise08;

import java.util.Scanner;

public class Main {

    /* Exercício
    8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1- Digite um  valor inteiro: ");
        int value1 = scanner.nextInt();

        System.out.print("2- Digite um  valor inteiro: ");
        int value2 = scanner.nextInt();

        System.out.print("3- Digite um  valor inteiro: ");
        int value3 = scanner.nextInt();

        if (value1 == value2 || value1 == value3 || value2 == value3) {
            System.out.println("Os valores devem ser diferentes.");
            return;
        }

        if (value1 > value2 && value2 > value3) {
            System.out.println( value1 + ", " + value2 + ", " +value3);
        } else if (value1 > value3 && value3 > value2) {
            System.out.println( value1 + ", " + value3 + ", " + value2);
        } else if (value2 > value1 && value1 > value3) {
                System.out.println( value2 + ", " + value1 + ", " + value3);
        } else if (value2 > value3 && value3 > value1) {
            System.out.println( value2 + ", " + value3 + ", " + value1);
        } else if (value3 > value1 && value1 > value2) {
            System.out.println(value3 + ", " + value1 + ", " + value2);
        } else {
            System.out.println(value3 + ", " + value2 + ", " + value1);
        }

        scanner.close();
    }
}