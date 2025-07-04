package academy.devdojo.maratonajava.javacore.abstractclasses.test;

import academy.devdojo.maratonajava.javacore.abstractclasses.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.abstractclasses.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.abstractclasses.domain.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente manager = new Gerente("Tsunade Senju", 5000);
        System.out.println(manager);
        manager.imprime();

        Desenvolvedor dev = new Desenvolvedor("Shikamaru Nara", 2500);
        System.out.println(dev);
        dev.imprime();
    }
}
