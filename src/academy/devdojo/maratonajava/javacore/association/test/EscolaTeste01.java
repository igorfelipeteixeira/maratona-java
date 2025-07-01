package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Escola;
import academy.devdojo.maratonajava.javacore.association.domain.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor teacher1 = new Professor("Jiraya Sensei");
        Professor teacher2 = new Professor("Kakashi Sensei");
        Professor[] teachers = {teacher1, teacher2};
        Escola school = new Escola("Vila da Folha", teachers);

        school.imprime();
    }
}
