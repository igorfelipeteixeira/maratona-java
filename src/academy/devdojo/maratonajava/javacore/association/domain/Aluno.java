package academy.devdojo.maratonajava.javacore.association.domain;

public class Aluno {

    private String name;
    private int age;
    private Seminario seminary;

    public void imprime() {
        System.out.println("----- Aluno -----");
        System.out.println(name);
        System.out.println(age);
        System.out.println(seminary.getTitle());

    }

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Aluno(String name, int age, Seminario seminary) {
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminario getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminario seminary) {
        this.seminary = seminary;
    }
}
