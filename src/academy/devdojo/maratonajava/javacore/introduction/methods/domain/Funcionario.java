package academy.devdojo.maratonajava.javacore.introduction.methods.domain;

public class Funcionario {

    public String name;
    public int age;
    public double[] salary;

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
        double media = 0;

        for (double salary : salary) {
            media += salary;
        }
        media /= salary.length;

        System.out.println("\nMédia Salarial: " + media);
    }
}
