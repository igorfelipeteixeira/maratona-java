package academy.devdojo.maratonajava.introduction;

public class EstruturasDeRepetição {
    public static void main(String[] args) {

        // While
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        // Do While
        count = 0;

        do {
            System.out.println("Inside");
            count++;
        } while (count < 10);

        // For
        for (int i=0; i < 10; i++) {
            System.out.println("Number " + i);
        }

        // Exercise
        for (int i = 0; i <= 1000000; i ++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Break
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }

        //Exercise
        int carValue = 70000;
        for (int i = 1; i <= carValue; i ++) {
            int installmentValue = carValue / i;
            if (installmentValue < 1000) {
                break;
            }
            System.out.println("Installment " + i + " R$ " + installmentValue);
        }

        // Continue
        carValue = 70000;
        for (int i = carValue; i >= 1; i--) {
            int installmentValue = carValue / i;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("Installment " + i + " R$ " + installmentValue);
        }
    }
}
