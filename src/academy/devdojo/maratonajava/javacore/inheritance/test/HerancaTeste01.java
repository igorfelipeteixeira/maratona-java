package academy.devdojo.maratonajava.javacore.inheritance.test;

import academy.devdojo.maratonajava.javacore.inheritance.domain.Endereco;
import academy.devdojo.maratonajava.javacore.inheritance.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.inheritance.domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco address = new Endereco();
        address.setStreet("Rua 3");
        address.setCep("012345-209");

        Pessoa person = new Pessoa("Roronoa Zoro");
        person.setCpf("123.456.789-10");
        person.setAddress(address);

        person.imprime();

        Funcionario worker = new Funcionario("Iruka Sensei");
        worker.setCpf("987.654.321-00");
        worker.setAddress(address);
        worker.setSalary(2500);

        worker.imprime();
        worker.relatorioPagamento();
    }
}
