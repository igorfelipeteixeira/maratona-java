package academy.devdojo.maratonajava.javacore.introduction.methods.test;

import academy.devdojo.maratonajava.javacore.introduction.methods.domain.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10, 2);
        System.out.println(resultado);

        calculadora.imprimeDivisao(10, 5);
    }
}
