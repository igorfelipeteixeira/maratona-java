package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os espaços em branco
        // \w = a-z/A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // .
//        String regex = "[a-zA-C]";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//        String text = "abaaba";
        String text = "shikamaru@gmail.com, 123naruto@gmail.com, #@!obito@gmail.br, teste@gmail.com.br, choji@gmail ";
        System.out.print("Email válido: ");
        System.out.println("#@!obito@gmail.br".matches(regex));
        System.out.println(text.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("texto:  " + text);
        System.out.println("indíce: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
