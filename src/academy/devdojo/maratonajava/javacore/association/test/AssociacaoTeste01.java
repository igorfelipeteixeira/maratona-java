package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Aluno;
import academy.devdojo.maratonajava.javacore.association.domain.Local;
import academy.devdojo.maratonajava.javacore.association.domain.Professor;
import academy.devdojo.maratonajava.javacore.association.domain.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {
        Aluno studant1 = new Aluno("Shikamaru Nara", 19);
        Aluno[] studants = {studant1};
        Local address = new Local("Vila da Folha");
        Professor teacher = new Professor("Asuma Sarutobi", "Taijutsu");
        Seminario seminary1 = new Seminario("Torneio Chunnin", address, studants);
        Seminario[] seminaries = {seminary1};

        studant1.setSeminary(seminary1);
        teacher.setSeminaries(seminaries);

        studant1.imprime();
        address.imprime();
        seminary1.imprime();
        teacher.imprime();
    }
}