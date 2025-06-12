package academy.devdojo.maratonajava.javacore.introduction.methods.domain;

public class Funcionario {

    private String name;
    private int age;
    private double[] salary;
    private double media;

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary == null) {
            return;
        }
        for (double salary : salary) {
            System.out.print(salary + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salary == null) {
            return;
        }

        for (double salary : salary) {
            media += salary;
        }
        media /= salary.length;

        System.out.println("\nMédia Salarial: " + media);
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

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getMedia() {
        return media;
    }
}
