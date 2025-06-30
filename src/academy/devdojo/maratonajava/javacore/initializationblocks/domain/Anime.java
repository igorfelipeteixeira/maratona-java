package academy.devdojo.maratonajava.javacore.initializationblocks.domain;

public class Anime {

    private String name;
    private int[] episodes = {1,2,3,4,5,6,7,8,9,10,11,12};

    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime() {
        System.out.println(episodes);
    }
}
