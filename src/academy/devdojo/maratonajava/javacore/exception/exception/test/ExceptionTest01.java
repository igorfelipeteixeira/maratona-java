package academy.devdojo.maratonajava.javacore.exception.exception.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("file\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
