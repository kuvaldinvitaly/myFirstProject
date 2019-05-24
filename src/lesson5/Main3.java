package lesson5;

public class Main3 {
    public static void main(String[] args) {

        int [] numbers = {1, 77, 234, 98, 8, 6743, 5, 11};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j < numbers[i] - 1; j++) {
                if (numbers[i]%j == 0){
                    break;
                } else { System.out.println(numbers[i]);}

            }

        }
    }
}
