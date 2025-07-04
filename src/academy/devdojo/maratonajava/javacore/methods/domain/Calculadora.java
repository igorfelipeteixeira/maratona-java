package academy.devdojo.maratonajava.javacore.methods.domain;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 7);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void imprimeDivisao(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Divisão inválida!");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 7;
        num2 = 14;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... nums) {
        int soma = 0;
        for (int num : nums) {
            soma += num;
        }
        System.out.println(soma);
    }

}
