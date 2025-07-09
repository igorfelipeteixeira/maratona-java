package exercises.exercise21;

import java.util.Random;

public class Main {

    /*
    21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
    */

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber);
    }
}
