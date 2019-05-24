package homework.lesson3;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Что будем вычислять: площадь или периметр параллелограмма?");
        String action = scanner.next();
        if (action.equals("периметр")) {

            System.out.println("Введите первую сторону параллелограмма 'А': ");
            int storonaA = scanner.nextInt();

            System.out.println("Введите вторую сторону параллелограмма 'B': ");
            int storonaB = scanner.nextInt();

            System.out.println("Периметр параллелограмма = " + ( 2 * (storonaA + storonaB )));
        } else if (action.equals("площадь")) {

            System.out.println("Выберите номер варианта ответа того, что Вам известно: 1) - высота к стороне А; 2) - синус угла между двумя сторонами");
            String action1 = scanner.next();

            if (action1.equals("1")) {
                System.out.println("Введите первую сторону параллелограмма 'А': ");
                int storonaA = scanner.nextInt();
                System.out.println("Введите высоту к стороне 'A' ");
                int visotaKOsnovaniu = scanner.nextInt();
                System.out.println("Площадь параллелограмма = " + ( storonaA * visotaKOsnovaniu));

            }

            if (action1.equals("2")) {
                System.out.println("Введите первую сторону параллелограмма 'А': ");
                int storonaA = scanner.nextInt();
                System.out.println("Введите вторую сторону параллелограмма 'B': ");
                int storonaB = scanner.nextInt();
                System.out.println("Введите угол между сторонами 'A' и 'B' ");
                double sinAB = scanner.nextDouble();
                System.out.println("Площадь параллелограмма = " + ((double) storonaA * (double) storonaB * (Math.sin(Math.toRadians(sinAB)))));

            }
        }

    }
}
