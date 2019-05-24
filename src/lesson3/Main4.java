package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String inputName = scanner.nextLine();
        System.out.println("Привет, " + inputName);

        System.out.println("Введите первую сторону треугольника 'А': ");
        int storonaA = scanner.nextInt();

        System.out.println("Введите вторую сторону треугольника 'B': ");
        int storonaB = scanner.nextInt();

        System.out.println("Введите третью сторону треугольника 'C': ");
        int storonaC = scanner.nextInt();

        System.out.println("Площадь или периметр?");
        String action = scanner.next();

        if (action.equals("периметр")) {
            System.out.println("Периметр треугольника = " + (storonaA + storonaB + storonaC));
        } else if (action.equals("площадь")) {
            System.out.println("Выбери номер варианта ответа того, что тебе известно: 1) - высота к стороне А; 2) - синус угла между двумя сторонами");
            String action1 = scanner.next();

            if (action1.equals("1")) {
                System.out.println("Введите высоту к стороне 'A' ");
                int visotaKOsnovaniu = scanner.nextInt();
                System.out.println("Площадь треугольника = " + (0.5 * storonaA * visotaKOsnovaniu));

            }

            if (action1.equals("2")) {
                System.out.println("Введите угл между сторонами 'A' и 'B' ");
                double sinAB = scanner.nextDouble();
                System.out.println("Площадь треугольника = " + (0.5 * (double) storonaA * (double) storonaB * (Math.sin(Math.toRadians(sinAB)))));

            }


        }
    }
}