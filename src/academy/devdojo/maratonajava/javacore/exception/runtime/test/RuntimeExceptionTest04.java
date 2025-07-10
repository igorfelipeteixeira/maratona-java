package academy.devdojo.maratonajava.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {

    }
}
