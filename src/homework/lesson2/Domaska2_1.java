package homework.lesson2;

public class Domaska2_1 {

    public static void main(String[] args) {

        for (int i = 500; i < 1000; i = i + 1) {
            if (i % 7 == 0) {
                System.out.println(i + "- это число делится на 7");
            }
            if (i % 19 == 0) {
                System.out.println(i + "- это число делится на 19");
            }
        }
    }
}
