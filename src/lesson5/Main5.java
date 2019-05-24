package lesson5;

public class Main5 {
    public static void main(String[] args) {
        String text = "language java";
        char [] charFromText = text.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < charFromText.length; i++) {
            System.out.println(charFromText[i] + "-" + alphabet.indexOf(charFromText[i]));

        }
    }
}
