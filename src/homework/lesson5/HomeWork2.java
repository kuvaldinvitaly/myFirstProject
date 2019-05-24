package homework.lesson5;

public class HomeWork2 {
    public static void main(String[] args) {
        String text = "My name is Jonh";
        String text1 = "Moscow never sleeps";
        String text2 = text.toLowerCase();
        String text3 = text1.toLowerCase();
        char [] massive1 = text2.toCharArray();
        char [] massive2 = text3.toCharArray();

        for (int i = 0; i < text2.length(); i++) {
            for (int j = 0; j < text3.length(); j++) {
                if (massive1[i] == massive2[j]) {
                    System.out.print(massive1[i]);
                    break;
                }
            }
        }
    }
}
