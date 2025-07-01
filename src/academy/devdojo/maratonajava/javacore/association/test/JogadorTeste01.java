package academy.devdojo.maratonajava.javacore.association.test;

import academy.devdojo.maratonajava.javacore.association.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Kaká");
        Jogador player2 = new Jogador("Adriano Imperador");
        Jogador player3 = new Jogador("Júlio César");
        Jogador[] players = {player1, player2, player3};

        for (Jogador player : players) {
            player.imprime();
        }
    }
}
