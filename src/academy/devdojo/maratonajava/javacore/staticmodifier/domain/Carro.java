package academy.devdojo.maratonajava.javacore.staticmodifier.domain;

public class Carro {

    private String name;
    private double maximumSpeed;
    private static double limitSpeed = 250;

    public void imprime() {
        System.out.println("------------------------------");
        System.out.println("Nome: " + name);
        System.out.println("Velocidade Máxima: " + maximumSpeed);
        System.out.println("Velocidade Limite: " + Carro.limitSpeed);
    }

    public Carro() {
    }

    public Carro(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public static double getLimitSpeed() {
        return limitSpeed;
    }

    public static void setLimitSpeed(double limitSpeed) {
        Carro.limitSpeed = limitSpeed;
    }
}
