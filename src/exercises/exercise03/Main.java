package exercises.exercise03;

import java.util.Scanner;

public class Main {

    /* Exercício
    3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
    deverá somar os dois valores, caso contrário devera multiplicar A por B.
    Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atribua um valor para as seguintes incógnitas: ");

        System.out.print("A = ");
        int A = scanner.nextInt();

        System.out.print("B = ");
        int B = scanner.nextInt();

        int C;

        if (A == B) {
            C = A + B;
        } else {
            C = A * B;
        }
        System.out.println("C = " + C);

        scanner.close();
    }
}
