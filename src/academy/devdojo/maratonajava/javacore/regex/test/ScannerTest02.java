package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Shikamru,Naruto,Choji,true,14";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
