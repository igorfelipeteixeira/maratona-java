package academy.devdojo.maratonajava.javacore.polymorphism.domain;

public class Tomato extends Product{

    public static final double TAX_PERCENT = 0.05;
    private String expirationDate;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do Tomate");
        return this.value * TAX_PERCENT;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
