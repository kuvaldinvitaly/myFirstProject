package homework.lesson5;

public class HomeWork1 {
    public static void main(String[] args) {
        String text = "Hello, how are you?";
        String text1 = text.toLowerCase();
        char[] massive = text1.toCharArray();
        char[] glasnie = "aeyiou".toCharArray();
        char[] soglasnie = "qwrtpsdfghjklzxcvbnm".toCharArray();
        char[] simbols = ",./<>?:;@#$%^&*()".toCharArray();
        int glasnie2 = 0;
        int soglasnie2 = 0;
        int simbols2 = 0;
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < glasnie.length; j++) {
                if (massive[i] == glasnie[j]) {
                    glasnie2++;

                }
            }
            for (int z = 0; z < soglasnie.length; z++) {
                if (massive[i] == soglasnie[z]) {
                    soglasnie2++;
                }
            }
            for (int s = 0; s < simbols.length; s++) {
                if (massive[i] == simbols[s]) {
                    simbols2++;
                }
            }

        }
        System.out.println(glasnie2 + "- кол-во гласных");
        System.out.println(soglasnie2 + "- кол-во согласных");
        System.out.println(simbols2 + "- кол-во символов");
    }
}
