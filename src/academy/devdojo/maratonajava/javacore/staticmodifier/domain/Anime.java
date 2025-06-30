package academy.devdojo.maratonajava.javacore.staticmodifier.domain;

public class Anime {

    private String name;
    private static int[] episodes;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < 100; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime() {
        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }
}
