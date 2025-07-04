package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.repository.Repository;
import academy.devdojo.maratonajava.javacore.polymorphism.service.DatabaseRepository;
import academy.devdojo.maratonajava.javacore.polymorphism.service.FileRepository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        repository.save();
    }
}
