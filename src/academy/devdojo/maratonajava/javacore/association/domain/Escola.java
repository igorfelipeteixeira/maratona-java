package academy.devdojo.maratonajava.javacore.association.domain;

public class Escola {

    private String name;
    private Professor[] teachers;

    public void imprime() {
        System.out.println(name);
        if (teachers != null) {
            for (Professor teacher : teachers) {
                System.out.println(teacher.getName());
            }
        }
    }

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Professor[] teachers) {
        this.teachers = teachers;
    }
}
