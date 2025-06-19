package academy.devdojo.maratonajava.javacore.methods.test;

import academy.devdojo.maratonajava.javacore.methods.domain.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        double[] salary = {1600,1800,2000};

        funcionario.setName("Shikamaru Nara");
        funcionario.setAge(19);
        funcionario.setSalary(salary);

        funcionario.imprime();
    }
}
