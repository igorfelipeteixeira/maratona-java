package academy.devdojo.maratonajava.javacore.association.domain;

public class Jogador {

    private String name;
    private Time team;

    public void imprime() {
        System.out.println(name);
        if (team != null) {
            System.out.println(team.getName());
        }
    }

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTeam() {
        return team;
    }

    public void setTeam(Time team) {
        this.team = team;
    }
}
