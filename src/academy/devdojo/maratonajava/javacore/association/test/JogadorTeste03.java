package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Jogador;
import academy.devdojo.maratonajava.javacore.association.domain.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Ronaldinho Gaúcho");
        Jogador player2 = new Jogador("Puyol");
        Jogador[] players = {player1, player2};
        Time team = new Time("Barcelona");

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("----- Jogador -----");
        player1.imprime();

        System.out.println("----- Jogador -----");
        player2.imprime();

        System.out.println("------ Time ------");
        team.imprime();
    }
}
