package academy.devdojo.maratonajava.javacore.enums.test;

import academy.devdojo.maratonajava.javacore.enums.domain.Cliente;
import academy.devdojo.maratonajava.javacore.enums.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.enums.domain.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Shikamaru Nara", TipoCliente.PESSOA_FISICA);
        Cliente client2 = new Cliente("Naruto Uzumaki", TipoCliente.PESSOA_FISICA);
        Cliente client3 = new Cliente("Vila da Folha", TipoCliente.PESSOA_JURIDICA);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
