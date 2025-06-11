package academy.devdojo.maratonajava.javacore.introduction.methods.test;

import academy.devdojo.maratonajava.javacore.introduction.methods.domain.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        double[] salary = {1600,1800,2000};

        funcionario.name = "Shikamaru Nara";
        funcionario.age = 19;
        funcionario.salary = salary;

        funcionario.imprime();
    }
}
