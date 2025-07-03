package academy.devdojo.maratonajava.javacore.enums.domain;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double value) {
            return value * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double value) {
            return value * 0.05;
        }
    };

    public abstract double calcularDesconto(double value);
}
