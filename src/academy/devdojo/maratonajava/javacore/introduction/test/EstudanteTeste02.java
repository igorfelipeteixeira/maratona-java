package academy.devdojo.maratonajava.javacore.introduction.test;

import academy.devdojo.maratonajava.javacore.introduction.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
