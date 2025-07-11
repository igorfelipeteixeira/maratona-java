package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Shikamaru";
        name.concat(" Nara");
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Shikamaru");
        sb.append(" Nara");
        sb.reverse();
        sb.reverse();
        sb.delete(5,9);
        System.out.println(sb);
    }
}
