package academy.devdojo.maratonajava.javacore.methodoverloading.test;

import academy.devdojo.maratonajava.javacore.methodoverloading.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Dragon Ball Z", "TV", 360);
        anime.init("Dragon Ball Z", "TV", 360, "Ação");
        anime.imprime();
    }
}
