package homework.lesson3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Что будем вычислять: площадь или периметр овала?");
        String action = scanner.next();
        if (action.equals("периметр")) {

            System.out.println("Введите максимальную длину оси: ");
            int osA = scanner.nextInt();

            System.out.println("Введите минимальную длину оси: ");
            int osB = scanner.nextInt();

            System.out.println("Периметр овала = " + (2 * (Math.PI) * (Math.sqrt(((double)osA * (double)osA + (double)osB *(double) osB) / 2))));
        } else if (action.equals("площадь")) {

            System.out.println("Введите максимальную длину оси: ");
            int osA = scanner.nextInt();

            System.out.println("Введите минимальную длину оси: ");
            int osB = scanner.nextInt();

            System.out.println("Площадь овала = " + ((Math.PI) * ((osA * osB) / 2)  ));

        }


    }
}



