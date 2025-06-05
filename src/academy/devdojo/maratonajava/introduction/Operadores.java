package academy.devdojo.maratonajava.introduction;

public class Operadores {
    public static void main(String[] args) {

        // Operadores Aritiméticos
        int num1 = 10;
        int num2 = 20;

        int addition = num1 + num2;
        int subtraction = num2 - num1;
        int multiplication = num1 * num2;
        int division = num2 / num1;

        System.out.println("Result = " + addition);
        System.out.println("Result = " + subtraction);
        System.out.println("Result = " + multiplication);
        System.out.println("Result = " + division);

        // Operador de Resto
        int rest = 20 % 2;
        System.out.println(rest);

        // Operadores Relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        // Operadores Lógicos
        int age = 35;
        float salary = 3500.0F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double currentAccountValue = 200;
        double savingsAccountValue = 10000;
        float playstationValue = 5000;
        boolean isPlaystationFivePurchasable = currentAccountValue > playstationValue || savingsAccountValue > playstationValue;

        System.out.println("isPlaystationFivePurchasable " + isPlaystationFivePurchasable);

        // Operadores de Atribuição
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        int count = 0;
        count += 1;
        count ++;
        count--;
        System.out.println(count);


    }
}
