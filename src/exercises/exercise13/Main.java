package exercises.exercise13;

import java.util.Scanner;

public class Main {

    /* Exercício
    13 - Faça algoritmo que leia o nome e a idade de uma pessoa e
    imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println(name + " é menor de idade");
        } else {
            System.out.println(name + " é maior de idade");
        }

        scanner.close();
    }
}
