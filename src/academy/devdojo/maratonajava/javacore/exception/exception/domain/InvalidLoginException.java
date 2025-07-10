package academy.devdojo.maratonajava.javacore.exception.exception.domain;

public class InvalidLoginException extends Exception {


    public InvalidLoginException() {
        super("Login Inválido");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
