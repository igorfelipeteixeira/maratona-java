package academy.devdojo.maratonajava.javacore.methods.test;

import academy.devdojo.maratonajava.javacore.methods.domain.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.name = "Naruto Uzumaki";
        estudante1.age = 17;
        estudante1.gender = 'M';

        estudante2.name = "Shikamaru Nara";
        estudante2.age = 17;
        estudante2.gender = 'M';

        estudante1.imprime();
        estudante2.imprime();
    }
}
