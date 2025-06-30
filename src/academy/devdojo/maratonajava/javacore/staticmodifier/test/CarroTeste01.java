package academy.devdojo.maratonajava.javacore.staticmodifier.test;

import academy.devdojo.maratonajava.javacore.staticmodifier.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro car1 = new Carro("Charger", 320);
        Carro car2 = new Carro("Skyline", 320);
        Carro car3 = new Carro("Supra", 300);

        Carro.setLimitSpeed(180);

        car1.imprime();
        car2.imprime();
        car3.imprime();
    }
}
