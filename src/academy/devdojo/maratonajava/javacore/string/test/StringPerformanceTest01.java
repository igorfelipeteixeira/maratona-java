package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long beginning = System.currentTimeMillis();
        concatString(30000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo de execução de String: " + (end - beginning) + "ms");

        beginning = System.currentTimeMillis();
        concatStringBuilder(1000000);
        end = System.currentTimeMillis();
        System.out.println("Tempo de execução de StringBuilder: " + (end - beginning) + "ms");

        beginning = System.currentTimeMillis();
        concatStringBuffer(1000000);
        end = System.currentTimeMillis();
        System.out.println("Tempo de execução de StringBuffer: " + (end - beginning) + "ms");
    }

    private static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
