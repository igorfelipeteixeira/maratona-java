package exercises.exercise14;

import java.util.Scanner;

public class Main {

    /* Exercício
    14 - Faça um algoritmo que receba um valor A e B,
    e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para as seguintes incógnitas:");
        System.out.print("A = ");
        int value1 = scanner.nextInt();

        System.out.print("B = ");
        int value2 = scanner.nextInt();

        int newValue1 = value2;
        int newValue2 = value1;

        System.out.println("Troca de valores realizada");
        System.out.println("A = " + newValue1);
        System.out.println("B = " + newValue2);

        scanner.close();
    }
}
