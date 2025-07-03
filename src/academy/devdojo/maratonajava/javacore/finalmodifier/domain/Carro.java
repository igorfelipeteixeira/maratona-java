package academy.devdojo.maratonajava.javacore.finalmodifier.domain;

public class Carro {
    private String name;
    public static final double LIMIT_SPEED = 250;
    public final Comprador BUYER = new Comprador();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
