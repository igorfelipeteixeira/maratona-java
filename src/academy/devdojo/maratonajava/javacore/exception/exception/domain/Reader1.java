package academy.devdojo.maratonajava.javacore.exception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando reader 1");
    }
}
