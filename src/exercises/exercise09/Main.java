package exercises.exercise09;

import java.util.Scanner;

public class Main {

    /*
    9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e
     imprima na tela sua condição de acordo com a tabela abaixo:

     Fórmula do IMC = peso / (altura) ²

     Tabela Condições IMC

     Abaixo de 18,5   | Abaixo do peso

     Entre 18,6 e 24,9 | Peso ideal (parabéns)

     Entre 25,0 e 29,9 | Levemente acima do peso

     Entre 30,0 e 34,9 | Obesidade grau I

     Entre 35,0 e 39,9 | Obesidade grau II (severa)

     Maior ou igual a 40 | Obesidade grau III (mórbida)
   */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double weight = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        double height = scanner.nextDouble();

        double IMC = weight / Math.pow(height, 2);

        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC > 18.5 && IMC < 25.0) {
            System.out.println("Peso ideal (parabéns)");
        } else if (IMC >= 25.0 && IMC < 30.0) {
            System.out.println("Levemente acima do peso");
        } else if (IMC >= 30.0 && IMC < 35.0) {
            System.out.println("Obesidade grau I");
        } else if (IMC >= 35.0 && IMC < 40.0) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
