package academy.devdojo.maratonajava.javacore.polymorphism.domain;

public class Computer extends Product{

    public static final double TAX_PERCENT = 0.20;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do Computador");
        return this.value * TAX_PERCENT;
    }
}
