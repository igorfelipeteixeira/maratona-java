package academy.devdojo.maratonajava.javacore.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConection2();
    }

    private static String openConection() {
        try {
             System.out.println("Abrindo arquivo");
             System.out.println("Escrevendo dados no arquivo");
             return "conexão aberta";
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             System.out.println("Fechando recurso liberado pelo SO");
         }
        return null;
    }

    private static void openConection2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
