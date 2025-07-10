package academy.devdojo.maratonajava.javacore.exception.exception.test;

import academy.devdojo.maratonajava.javacore.exception.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.exception.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.exception.exception.domain.Person;

public class OverridenWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
