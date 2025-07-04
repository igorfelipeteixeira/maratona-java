package academy.devdojo.maratonajava.javacore.polymorphism.test;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.polymorphism.service.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);

        Tomato tomato = new Tomato("Tomate Cereja", 10);
        tomato.setExpirationDate("04/07/2025");

        TaxCalculator.calculateTax(product);
        System.out.println("--------------------");
        TaxCalculator.calculateTax(tomato);
    }
}
