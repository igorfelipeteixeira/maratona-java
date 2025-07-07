package exercises.exercise10;

import java.util.Scanner;

public class Main {

    /*
    10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double grade3 = scanner.nextDouble();

        double averageGrade = (grade1 + grade2 + grade3) / 3;

        System.out.println("A média das notas é " + averageGrade);

        scanner.close();

    }
}