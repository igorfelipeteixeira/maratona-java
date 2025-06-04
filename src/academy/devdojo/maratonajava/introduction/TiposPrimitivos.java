package academy.devdojo.maratonajava.introduction;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long bigNumber = 100000;
        double doubleSalary = 2500.0;
        float floatSalary = 2500.0F;
        byte byteAge = 127;
        short shortAge = 18;
        boolean trueOrFalse = true;
        char letter = 65;

        // Tipo não primitivo - Objeto
        String car = "Impala 67";

        System.out.println("The age is " + age + " years old.");
        System.out.println("The sentence is " + trueOrFalse + ".");
        System.out.println("The letter is " + letter + ".");

        /*
        Exercício:

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>, confirmo que recebi o sálario de <sálario>,
        na data <data>.
        */

        String name = "Shikamaru Nara";
        String address = "Vila da Folha";
        double salary = 2500.0;
        String date = "04/06/2025";

        System.out.println("Eu " + name + ", morando no endereço " + address + ", confrimo que recebi o sálario de " + salary + ", na data " + date + ".");
    }
}
