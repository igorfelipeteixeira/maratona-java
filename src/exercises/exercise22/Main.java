package exercises.exercise22;

import java.util.Scanner;

public class Main {

    /* Exercício
    22 - Faça um algoritmo que leia dois valores inteiros A e B,
    imprima na tela o quociente e o resto da divisão inteira entre eles.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valores inteiros para as seguintes incógnitas:");
        System.out.print("A = ");
        int value1 = scanner.nextInt();

        System.out.print("B = ");
        int value2 = scanner.nextInt();

        int quotient = value1 / value2;
        int rest = value1 % value2;

        System.out.println("Divisão");
        System.out.println(value1 + " / " + value2);
        System.out.println("Quociente = " + quotient);
        System.out.println("Resto = " + rest);

        scanner.close();
    }
}