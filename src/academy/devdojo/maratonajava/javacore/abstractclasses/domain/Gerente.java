package academy.devdojo.maratonajava.javacore.abstractclasses.domain;

public class Gerente extends Funcionario {

    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculaBonus() {
        this.salary = this.salary * 1.2;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
