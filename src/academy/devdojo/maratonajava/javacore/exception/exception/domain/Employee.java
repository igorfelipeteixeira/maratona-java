package academy.devdojo.maratonajava.javacore.exception.exception.domain;

public class Employee extends Person {

    public void save() throws InvalidLoginException {
        System.out.println("Salvando funcionário");
    }
}
