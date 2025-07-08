package exercises.exercise11;

import java.util.Scanner;

public class Main {

    /* Exercício
    11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
    imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado.
    Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String name = scanner.nextLine();

        double sumOfGrades = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print((i+1) + "° nota: ");
            double grade = scanner.nextDouble();
            sumOfGrades += grade;
        }

        double averageGrade = sumOfGrades / 4;

        if (averageGrade < 7) {
            System.out.println("Aluno: " + name);
            System.out.println("Média Final: " + averageGrade);
            System.out.println("Situação: Reprovado" );
        } else {
            System.out.println("Aluno(a): " + name);
            System.out.println("Média Final: " + averageGrade);
            System.out.println("Situação: Aprovado" );
        }

        scanner.close();
    }
}