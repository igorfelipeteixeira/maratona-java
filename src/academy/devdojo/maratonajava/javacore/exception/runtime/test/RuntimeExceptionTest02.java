package academy.devdojo.maratonajava.javacore.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1,0);
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, o denominador não pode ser zero");
        }
        return a / b;
    }
}
