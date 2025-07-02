package academy.devdojo.maratonajava.javacore.inheritance.domain;

public class Funcionario extends Pessoa {

    private double salary;

    static {
        System.out.println("Dentro do bloco de inicializão estático de Funcionáro");
    }

    {
        System.out.println("Dentro do bloco de inicializão de Funcionáro 1");
    }

    {
        System.out.println("Dentro do bloco de inicializão de Funcionáro 2");
    }

    public Funcionario(String name) {
        super(name);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println(salary);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + name + " recebi o salário no valor de R$" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
