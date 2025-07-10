package academy.devdojo.maratonajava.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    public static void createNewFile() throws IOException {
        File file = new File("file\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
