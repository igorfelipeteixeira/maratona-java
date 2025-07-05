package exercises.exercise01;

import java.util.Scanner;

public class Main {

    /* Exercício
        1 - Faça um algoritmo que leia os valores de A, B, C
        e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atribua valores para as seguintes incógnitas:");
        System.out.print("A = ");
        int A = scanner.nextInt();

        System.out.print("B = ");
        int B = scanner.nextInt();

        System.out.print("C = ");
        int C = scanner.nextInt();

        int sum = A + B;
        System.out.println("Soma entre A e B é igual a " + sum);

        if (sum < C) {
            System.out.println("Soma entre A e B é menor que C, cujo valor é igual a " + C);
        } else if (sum == C) {
            System.out.println("Soma entre A e B é igual a C, cujo valor é igual a " + C);
        } else {
            System.out.println("Soma entre A e B é maior que C, cujo valor é igual a " + C);
        }

        scanner.close();

    }
}
