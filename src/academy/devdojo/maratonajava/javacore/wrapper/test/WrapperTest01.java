package academy.devdojo.maratonajava.javacore.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP =  10F;
        double doubleP = 10D;
        char charP = 'I';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // boxing
        Long longW = 10L;
        Float floatW =  10F;
        Double doubleW = 10D;
        Character charW = 'I';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intw2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('I'));
        System.out.println(Character.isDigit('9'));
    }
}
