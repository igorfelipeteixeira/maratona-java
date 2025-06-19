package academy.devdojo.maratonajava.javacore.methods.test;

import academy.devdojo.maratonajava.javacore.methods.domain.Pesssoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pesssoa pessoa = new Pesssoa();
        pessoa.setName("Shikamaru Nara");
        pessoa.setAge(19);

        pessoa.imprime();

        //System.out.println(pessoa.getName());
        //System.out.println(pessoa.getAge());
    }
}
