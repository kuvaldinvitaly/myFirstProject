package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int [] massive = {43, 654, 11, 79, 6};
        int biggest = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > biggest) {
                biggest = massive[i];

            }
        }
        System.out.println(biggest);

        int biggest2 = 0;
        for (int i = 0; i < massive.length; i++){
            if (massive[i] > biggest2 && massive[i] < biggest) {
                biggest2 = massive[i];
            }
        }
        System.out.println(biggest2);

    }
}
