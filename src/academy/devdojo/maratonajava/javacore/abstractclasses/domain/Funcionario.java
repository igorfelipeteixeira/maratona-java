package academy.devdojo.maratonajava.javacore.abstractclasses.domain;

public abstract class Funcionario extends Pessoa {

    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void calculaBonus();
}
