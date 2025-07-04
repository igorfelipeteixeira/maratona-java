package academy.devdojo.maratonajava.javacore.polymorphism.service;

import academy.devdojo.maratonajava.javacore.polymorphism.repository.Repository;

public class FileRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando em um arquivo");
    }
}
