package academy.devdojo.maratonajava.javacore.association.test;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Idade: ");
        int age = scanner.nextInt();

        System.out.print("Gênero: ");
        char genre = scanner.next().charAt(0);

        System.out.println("----- Informações Pessoais -----");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Gênero: " + genre);
    }
}
