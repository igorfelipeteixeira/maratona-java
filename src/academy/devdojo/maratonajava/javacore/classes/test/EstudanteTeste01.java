package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.name = "Shikamaru Nara";
        estudante.age = 17;
        estudante.gender = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println(estudante);
    }
}
