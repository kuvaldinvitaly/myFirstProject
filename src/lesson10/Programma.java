package lesson10;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру");
        System.out.println("1 - треугольник");
        System.out.println("2 - прямоугольник");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.nextLine();

        Figura figura = null;
        if (inputFigura.equals("1")) {
            figura = new Treugolnil();
            System.out.println("Введите сторону треугольника А");
            String storonaA = scanner.nextLine();

            System.out.println("Введите сторону треугольника B");
            String storonaB = scanner.nextLine();

            System.out.println("Введите сторону треугольника C");
            String storonaC = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);
            int stC = Integer.parseInt(storonaC);

            figura = new Treugolnil(stA, stB, stC);

        }
        if (inputFigura.equals("2")) {
            figura = new Prymoygolnik();
            System.out.println("Введите сторону прямоугольника А");
            String storonaA = scanner.nextLine();

            System.out.println("Введите сторону прямоугльника B");
            String storonaB = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);

          figura = new Prymoygolnik(stA, stB);
        }

        System.out.println("Периметр или площадь?");

        String inputAction = scanner.nextLine();
        if (inputAction.equals("периметр")) {
            figura.printPerimetr();
        } else {
            figura.printPloshad();
        }

    }
}
