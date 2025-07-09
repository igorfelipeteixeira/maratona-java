package exercises.exercise20;

import java.util.Scanner;

public class Main {

    /*
    20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("---------------");
        System.out.println(" Tabuada de " + num);
        System.out.println("---------------");

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
