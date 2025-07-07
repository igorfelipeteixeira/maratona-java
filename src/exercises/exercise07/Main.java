package exercises.exercise07;

import java.util.Scanner;

public class Main {

    /* Exercício
    7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor booleano: ");
        boolean booleanValue1 = scanner.nextBoolean();

        System.out.println("Digite um valor booleano: ");
        boolean booleanValue2 = scanner.nextBoolean();

        if (booleanValue1 && booleanValue2) {
            System.out.println("Ambos os valores são verdadeiros");
        } else if (booleanValue1 == booleanValue2) {
            System.out.println("Ambos os valores são falsos");
        } else {
            System.out.println("Um valor é verdadeiro e o outro é falso");
        }

        scanner.close();
    }
}