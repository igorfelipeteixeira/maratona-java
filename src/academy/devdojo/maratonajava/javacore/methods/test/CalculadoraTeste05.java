package academy.devdojo.maratonajava.javacore.introduction.methods.test;

import academy.devdojo.maratonajava.javacore.introduction.methods.domain.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int[] nums = {1,2,3,4,5};
        calculadora.somaArray(nums);
        calculadora.somaVarArgs(nums);
    }
}
