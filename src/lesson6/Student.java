package lesson6;

public class Student {
    // формукла создания метода

    // 1 - модификатор дотупа (public, private, protected, пустое место)
    // public - доступ ко всему проекту
    // пустое место (packege) - доступ внутри
    // protected - доступ только внутри текущего класса и его наследникам
    // private - доступ внутри текущего класса
    // 2 - слово Static есть или нет
    // 3 - возвращаемый тип (int, String, char[], ...) или если нет возвращаемого массива, мы указываем void
    // 4 - название метода (придумываем сами)
    // 5 - входящие параметры в круглых скобках через запятую (тип и название переменной)
    // 6 - в фигурных скобках тело метода (то что будет выполняться когда этот метод вызовут)

    public static int summaTrexChisel(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }

    public static int perimetrPriamoygolnika(int q, int w, int e, int r) {
        int perimetr = q + w + e + r;
        return perimetr;
    }

    public static void kolvoPrivet(int skolkoRazVivesti) {
        for (int i = 0; i < skolkoRazVivesti; i++) {
            System.out.println("Hello111");
        }
    }
    public static void cetNecet (int number) {
        if (number % 2 == 0) {
            System.out.println("Четное");

        }
    }
}