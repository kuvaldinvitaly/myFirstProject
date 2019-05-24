package homework.lesson6;

public class HomeWork1 {
    public static int ploshadTreugolnika(int a, int b, int c) {
        int p = (a + b + c) / 2;
        int ploshad = (int) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        return ploshad;
    }

    public static void chetnoeChislo(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                System.out.println(massive[i]);
            }

        }
    }

    public static int summa (int znamen1, int znamen2, int chislitel1, int chislitel2) {
        int pervaiaDrob = chislitel1 / znamen1;
        int vtoraiaDrob = chislitel2 / znamen2;
        int ravno = pervaiaDrob + vtoraiaDrob;
        return ravno;
    }

}
