package academy.devdojo.maratonajava.javacore.enums.domain;

public class Cliente {
    private String name;
    private TipoCliente tipoCliente;

    public Cliente(String name, TipoCliente tipo) {
        this.name = name;
        this.tipoCliente = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getValue() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipoCliente = tipo;
    }
}
