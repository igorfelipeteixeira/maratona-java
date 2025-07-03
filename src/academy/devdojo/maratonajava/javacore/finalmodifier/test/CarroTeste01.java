package academy.devdojo.maratonajava.javacore.finalmodifier.test;

import academy.devdojo.maratonajava.javacore.finalmodifier.domain.Carro;
import academy.devdojo.maratonajava.javacore.finalmodifier.domain.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.BUYER.setName("Minato");

        System.out.println(Carro.LIMIT_SPEED);
        System.out.println(car.BUYER.getName());
    }
}
