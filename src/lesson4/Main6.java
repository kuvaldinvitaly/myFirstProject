package lesson4;

public class Main6 {
    public static void main(String[] args) {

        String text = "I am lerning java";
        String text1 = text.replace("I", "?");
        String text2 = text1.replace("a", "?");
        String text3 = text2.replace("e", "?");
        String text4 = text3.replace("i", "?");
        System.out.println(text4);
    }
}
