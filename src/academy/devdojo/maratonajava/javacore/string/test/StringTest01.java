package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Shikamaru"; // String constant pool
        String name2 = "Shikamaru";
        name = name.concat(" Nara"); // name += " Nara"
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Shikamaru"); // 1- variável de referência, 2- objeto do tipo string, 3- uma string no pool de string
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
