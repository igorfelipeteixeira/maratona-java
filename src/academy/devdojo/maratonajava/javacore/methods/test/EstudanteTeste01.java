package academy.devdojo.maratonajava.javacore.methods.test;

import academy.devdojo.maratonajava.javacore.methods.domain.Estudante;
import academy.devdojo.maratonajava.javacore.methods.domain.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.name = "Naruto Uzumaki";
        estudante1.age = 17;
        estudante1.gender = 'M';

        estudante2.name = "Shikamaru Nara";
        estudante2.age = 17;
        estudante2.gender = 'M';

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);
    }
}
