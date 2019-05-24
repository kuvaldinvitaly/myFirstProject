package lesson5;

public class Main4 {
    public static void main(String[] args) {

        String text = "orange apple limon";
        String [] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }

    }
}
