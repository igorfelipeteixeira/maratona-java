package academy.devdojo.maratonajava.javacore.association.test;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O grande software que tudo sabe e tudo ve");
        System.out.println("Faça-me uma pergunta!");

        String question = scanner.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("NÃO");
        } else {
            System.out.println("SIM");
        }
    }
}
