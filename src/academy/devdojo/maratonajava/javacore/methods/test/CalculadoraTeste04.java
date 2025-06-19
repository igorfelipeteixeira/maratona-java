package academy.devdojo.maratonajava.javacore.methods.test;

import academy.devdojo.maratonajava.javacore.methods.domain.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
