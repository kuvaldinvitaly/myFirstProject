package lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = new int[6];

        int chetnoeChislo = 2;
        for (int i = 0; i < 6; i++) {
            numbers[i] = chetnoeChislo;
            chetnoeChislo = chetnoeChislo + 2;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
