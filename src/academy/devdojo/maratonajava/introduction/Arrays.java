package academy.devdojo.maratonajava.introduction;

public class Arrays {
    public static void main(String[] args) {

        // Array
        int[] ages = new int[3];
        ages[0] = 1;
        ages[1] = 3;
        ages[2] = 5;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        String[] names = new String[3];
        names[0] = "Naruto Uzumaki";
        names[1] = "Shikamaru Nara";
        names[2] = "Choji Akimichi";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Reinicialização de um Array
        names = new String[5];

        // Formas de inicializar um Array
        int[] numbers = new int[3];
        int[] numbers2 = {1, 2, 3};
        int[] numbers3 = new int[] {1, 2, 3};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        for (int num : numbers3) {
            System.out.println(num);
        }

        // Array Multidimensional
        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        days[1][0] = 14;
        days[1][1] = 15;
        days[1][2] = 16;

        days[2][0] = 9;
        days[2][1] = 10;
        days[2][2] = 11;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }

        for (int[] arr : days) {
            for (int day : arr) {
                System.out.println(day);
            }
        }

        // Inicialização de um Array Multidimensional
        int[][] arrInt = new int[3][];

        int[] array = {1, 2, 3};

        arrInt[0] = new int[3];
        arrInt[1] = new int[] {1, 3, 5, 7, 9};
        arrInt[2] = array;

        int[][] nums = {{1, 2, 3}, {5, 7, 9,}, {14, 17, 19}};

        for (int[] arr : arrInt) {
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
