package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Zoro";
        String nums = "012345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("Z","z"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(nums.length());
        System.out.println(nums.substring(1));
        System.out.println(name.trim());
    }
}
