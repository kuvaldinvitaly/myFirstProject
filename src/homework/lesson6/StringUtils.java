package homework.lesson6;

public class StringUtils {
    public static String reverse(String text) {
        char[] textToArray = text.toCharArray();
        String reverse = "";
        for (int j = textToArray.length - 1; j >= 0; j--) {
            reverse = reverse + textToArray[j];
        }
        return reverse;
    }

    public static int countClass(String text) {
        char[] textToArray = text.toCharArray();
        char[] glass = "eyuioaEYUIOA".toCharArray();
        int countGlas = 0;
        for (int i = 0; i < textToArray.length; i++) {
            for (int j = 0; j < glass.length; j++) {
                if (textToArray[i] == glass[j]) {
                    countGlas++;
                }
            }
        }
        return countGlas;
    }

    public static int countSoglasnie(String text) {
        char[] textToArray = text.toCharArray();
        char[] soglasnie = "qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM".toCharArray();
        int countSogl = 0;
        for (int i = 0; i < textToArray.length; i++) {
            for (int j = 0; j < soglasnie.length; j++) {
                if (textToArray[i] == soglasnie[j]) {
                    countSogl++;
                }
            }
        }
        return countSogl;
    }
}
