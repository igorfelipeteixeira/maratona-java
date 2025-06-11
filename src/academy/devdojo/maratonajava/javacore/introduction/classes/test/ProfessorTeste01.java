package academy.devdojo.maratonajava.javacore.introduction.classes.test;

import academy.devdojo.maratonajava.javacore.introduction.classes.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.name = "Kakashi Hatake";
        professor.age = 25;
        professor.gender = 'M';

        System.out.println(professor.name + " - " + professor.age + " - " + professor.gender);
    }
}
