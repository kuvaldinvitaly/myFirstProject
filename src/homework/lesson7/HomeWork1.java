package homework.lesson7;

public class HomeWork1 {

    public static void main(String[] args) {
        int[][] massive = new int[5][5];

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (j == i || i == 4 - j) {

                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        int[][] massive2 = new int[4][4];

        for (int i = 0; i < massive2.length; i++) {
            for (int j = 0; j < massive2[i].length; j++) {
                if (i == 3 - j) {

                    System.out.print(massive2[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
