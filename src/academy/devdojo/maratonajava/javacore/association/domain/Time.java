package academy.devdojo.maratonajava.javacore.association.domain;

public class Time {
    private String name;
    private Jogador[] players;

    public void imprime() {
        System.out.println(name);
        if (players != null) {
            for (Jogador player : players) {
                System.out.println(player.getName());
            }
        }
    }

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getPlayers() {
        return players;
    }

    public void setPlayers(Jogador[] players) {
        this.players = players;
    }
}
