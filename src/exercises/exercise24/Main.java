package exercises.exercise24;

import java.util.Scanner;

public class Main {

    /* Exercício
    24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
    sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem
    a sua velocidade média, distância percorrida e a quantidade de litros utilizados para fazer a viagem.

    Fórmula: distância = tempo x velocidade.
    Litros usados = distância / 12.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carPerformance = 12;

        System.out.println("Informações de Viagem");
        System.out.println("Desempenho do carro: " + carPerformance);

        System.out.print("Tempo de viagem: ");
        double time = scanner.nextDouble();

        System.out.print("Velocidade média: ");
        int averageSpeed = scanner.nextInt();

        double distance = time * averageSpeed;
        double liters = distance / carPerformance;

        System.out.println("--------------------");
        System.out.println("  Resumo da Viagem");
        System.out.println("--------------------");
        System.out.println("Tempo de viagem: " + time + " horas");
        System.out.println("Velocidade Média: " + averageSpeed + "km/h");
        System.out.println("Distância Percorrida: " + distance + "km");
        System.out.println("Litros Utilizados: " + liters + "l");

        scanner.close();

    }
}
