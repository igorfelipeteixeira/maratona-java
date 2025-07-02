package academy.devdojo.maratonajava.javacore.inheritance.domain;

public class Pessoa {

    protected String name;
    protected String cpf;
    protected Endereco address;

    static {
        System.out.println("Dentro do bloco de inicializão estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicializão de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicializão de Pessoa 2");
    }

    public Pessoa(String name) {
        System.out.println("Dentro do construtor de Pessoa");
        this.name = name;
    }

    public Pessoa(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println(name);
        System.out.println(cpf);
        System.out.println(address.getStreet() + " - " + address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }
}
