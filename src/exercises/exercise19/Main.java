package exercises.exercise19;

public class Main {

    /*
    19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
    */

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("---------------");
            System.out.println(" Tabuada de " + i);
            System.out.println("---------------");
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
