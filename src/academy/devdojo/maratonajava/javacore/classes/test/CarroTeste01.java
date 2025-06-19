package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

        Carro impala = new Carro();
        impala.name = "Impala";
        impala.brand = "Chevrolet";
        impala.year = 1967;

        Carro opala = new Carro();
        opala.name = "Opala";
        opala.brand = "Chevrolet";
        opala.year = 1969;

        System.out.println("Carro 1: " + impala.name + " - " + impala.brand + " - " + impala.year);
        System.out.println("Carro 2: " + opala.name + " - " + opala.brand + " - " + opala.year);
    }
}
