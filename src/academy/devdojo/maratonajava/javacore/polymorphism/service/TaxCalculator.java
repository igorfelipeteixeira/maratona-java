package academy.devdojo.maratonajava.javacore.polymorphism.service;

import academy.devdojo.maratonajava.javacore.polymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.polymorphism.domain.Tomato;

public class TaxCalculator {

    public static void calculateTax(Product product) {
        System.out.println("Relatório de imposto");
        double tax = product.calculateTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("Valor: " + product.getValue());
        System.out.println("Imposto: " + tax);

        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println(tomato.getExpirationDate());
        }
    }
}
