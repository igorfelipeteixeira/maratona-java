package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Television;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.polymorphism.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 11000);
        Tomato tomato = new Tomato("Tomate Cereja", 10);
        Television tv = new Television("Samsung 50\" ", 5000);

        TaxCalculator.calculateTax(computer);
        System.out.println("-----------------------------------");
        TaxCalculator.calculateTax(tomato);
        System.out.println("-----------------------------------");
        TaxCalculator.calculateTax(tv);
    }
}
