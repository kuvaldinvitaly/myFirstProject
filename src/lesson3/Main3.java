package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 4, 9, 6, 20};
        int summ = 0;

        for (int i = 0; i < numbers.length; i++) {
            summ = summ + numbers[i];
        }
        System.out.println(summ);
    }
}
