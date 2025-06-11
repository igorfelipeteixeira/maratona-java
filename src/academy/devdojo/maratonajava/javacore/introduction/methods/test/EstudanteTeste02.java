package academy.devdojo.maratonajava.javacore.introduction.methods.test;

import academy.devdojo.maratonajava.javacore.introduction.methods.domain.Estudante;
import academy.devdojo.maratonajava.javacore.introduction.methods.domain.ImpressoraEstudante;

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
