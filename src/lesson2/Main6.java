package lesson2;

public class Main6 {
    public static void main(String[] args) {

        int mark = 2;

        switch (mark) {
            case 2:
                System.out.println("Плохо");
                break;
            case 3:
                System.out.println("Не очень");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Это не оценка");

        }
    }
}
