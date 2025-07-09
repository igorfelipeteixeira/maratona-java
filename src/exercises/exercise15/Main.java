package exercises.exercise15;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    /* Exercício
    15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
    meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
    (Ex: 5 anos, 2 meses e 15 dias de vida)
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento");
        System.out.print("Dia: ");
        int day = scanner.nextInt();

        System.out.print("Mês: ");
        int month = scanner.nextInt();

        System.out.print("Ano: ");
        int year = scanner.nextInt();

        int currentDay = 9;
        int currentMonth = 7;
        int currentYear = 2025;

        int days = currentDay - day;
        int years = currentYear - year;
        int months = currentMonth - month;

        if (days < 0) {
            months = currentMonth - month - 1;
            days = 30 + days;
        }

        if (months < 0) {
            years = currentYear - year - 1;
            months = 12 + months;
        }

        System.out.println(years + "anos, " + months + " meses e " + days + " dias de vida");

        scanner.close();
    }
}
