package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Jogador;
import academy.devdojo.maratonajava.javacore.association.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        Jogador player1 = new Jogador("Messi");
        Time team = new Time("Inter Miami");

        player1.setTeam(team);
        player1.imprime();
    }
}
