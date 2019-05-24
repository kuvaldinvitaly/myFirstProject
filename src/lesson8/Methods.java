package lesson8;

public class Methods {
    public static int summaChiselBy5(int[] massive) {
        int sumChiselBy5 = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 5 == 0) {
                sumChiselBy5 += massive[i];

            }
        }
        return sumChiselBy5;
    }

    public static int[] massivWithNum5(int[] blabla, int chislo) {
        int countChisla = 0;

        for (int i = 0; i < blabla.length; i++) {
            char[] chars = ("" + blabla[i]).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == chislo) {
                    countChisla++;
                }
            }

        }
        int[] result = new int[countChisla];
        int index = 0;
        for (int i = 0; i < blabla.length; i++) {
            char[] chars = ("" + blabla[i]).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == chislo) {
                    result[i] = chars[j];
                    index++;
                }
            }

        }

return  result;
    }


}
