package homework.lesson3;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Что будем вычислять: площадь или периметр трапеции?");
        String action = scanner.next();
        if (action.equals("периметр")) {

            System.out.println("Введите первую сторону трапеции 'А': ");
            int storonaA = scanner.nextInt();

            System.out.println("Введите вторую сторону трапеции 'B': ");
            int storonaB = scanner.nextInt();

            System.out.println("Введите третью сторону трапеции 'С': ");
            int storonaC = scanner.nextInt();

            System.out.println("Введите четвертую сторону трапеции 'D': ");
            int storonaD = scanner.nextInt();

            System.out.println("Периметр параллелограмма = " + (storonaA + storonaB + storonaC + storonaD));
        } else if (action.equals("площадь")) {

            System.out.println("Выберите номер варианта ответа того, что Вам известно: 1) - высота к основанию А; 2) - угол между диагоналями");
            String action1 = scanner.next();

            if (action1.equals("1")) {
                System.out.println("Введите среднюю линию трапеции: ");
                int sredniaLinia = scanner.nextInt();
                System.out.println("Введите высоту к стороне 'A' ");
                int visotaKOsnovaniu = scanner.nextInt();
                System.out.println("Площадь трапеции = " + (sredniaLinia * visotaKOsnovaniu));

            }

            if (action1.equals("2")) {
                System.out.println("Введите первую диагональ трапеции : ");
                int diagonalA = scanner.nextInt();
                System.out.println("Введите вторую диагональ трапеции : ");
                int diagonalB = scanner.nextInt();
                System.out.println("Введите угл между диагоналями ");
                double sinAB = scanner.nextDouble();
                System.out.println("Площадь трапеции = " + (( 0.5 * (double) diagonalA * (double) diagonalB) * (Math.sin(Math.toRadians(sinAB)))));

            }
        }

    }
}

