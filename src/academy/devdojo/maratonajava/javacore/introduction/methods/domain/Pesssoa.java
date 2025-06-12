package academy.devdojo.maratonajava.javacore.introduction.methods.domain;

public class Pesssoa {

    private String name;
    private int age;

    public void imprime() {
        System.out.println(name);
        System.out.println(age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Idade inválida!");
            return;
        }
        this.age = age;
    }
}
