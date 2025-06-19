package academy.devdojo.maratonajava.javacore.constructors.test;

import academy.devdojo.maratonajava.javacore.constructors.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Dragon Ball Z", "TV", 360, "Ação", "Toei Animation");
        anime.imprime();
    }
}
