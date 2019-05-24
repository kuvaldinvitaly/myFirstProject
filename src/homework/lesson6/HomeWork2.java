package homework.lesson6;

public class HomeWork2 {
    public static void main(String[] args) {
        int ploshad = HomeWork1.ploshadTreugolnika(7, 4, 9);
        System.out.println(ploshad);

        int[] massive = {3, 1245, 76232465, 8};
        HomeWork1.chetnoeChislo(massive);

        int summaDrob = HomeWork1.summa(3, 2, 10, 20);
        System.out.println(summaDrob);

        String text = "Hello world!";
        String reverseText = StringUtils.reverse(text);
        System.out.println(reverseText);

        int countGlas = StringUtils.countClass(text);
        System.out.println(countGlas);

        int countSoglas = StringUtils.countSoglasnie(text);
        System.out.println(countSoglas);

    }


}
