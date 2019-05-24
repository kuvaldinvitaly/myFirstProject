package homework.lesson3;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Что будем вычислять: площадь или периметр правильного восьмиугольника?");
        String action = scanner.next();
        if (action.equals("периметр")) {

            System.out.println("Введите сторону: ");
            int osA = scanner.nextInt();

            System.out.println("Периметр правильного восьмиугольника = " + (8 * osA));
        } else if (action.equals("площадь")) {

            System.out.println("Введите сторону: ");
            int osA = scanner.nextInt();

            System.out.println("Площадь правильного восьмиугольника = " + (2 * (osA * osA) * (1 + Math.sqrt(2))));

        }

    }
}
