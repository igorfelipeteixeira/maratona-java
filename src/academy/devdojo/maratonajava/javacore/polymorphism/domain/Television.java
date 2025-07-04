package academy.devdojo.maratonajava.javacore.polymorphism.domain;

public class Television extends Product{

    public static final double TAX_PERCENT = 0.20;

    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto da Televisão");
        return this.value * TAX_PERCENT;
    }
}
