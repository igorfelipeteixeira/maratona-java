package exercises.exercise18;

public class Main {

    /*
    18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
    Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários
    para que Sara seja maior que Francisco.
    */

    public static void main(String[] args) {
        double franciscoHeight = 1.50;
        double saraHeight = 1.10;

        int count = 0;
        
        while (saraHeight <= franciscoHeight) {
            franciscoHeight += 0.02;
            saraHeight += 0.03;
            count++;
        }

        System.out.println("Serão necessários " + count + " anos para que Sara seja maior que Francisco");
    }
}
