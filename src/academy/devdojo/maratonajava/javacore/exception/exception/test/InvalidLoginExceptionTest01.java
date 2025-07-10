package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {
        try {
            logIn();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void logIn() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Vegeta";
        String passwordDB = "ssj";
        System.out.print("Usuário: ");
        String usernameEntered = scanner.nextLine();
        System.out.print("Senha: ");
        String passwordEntered = scanner.nextLine();
        if (!usernameDB.equals(usernameEntered) || !passwordDB.equals(passwordEntered)) {
            throw new InvalidLoginException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
