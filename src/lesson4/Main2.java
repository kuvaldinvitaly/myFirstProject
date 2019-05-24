package lesson4;

public class Main2 {
    public static void main(String[] args) {

        String text = "qwertyihh";
        char[] simbolFromText = text.toCharArray();


        for (int i = 0; i < simbolFromText.length; i++) {
            if (simbolFromText[i] == 'i' || simbolFromText[i] == 'y' || simbolFromText[i] == 'e'){
            char result = simbolFromText[i];
            System.out.println(result);}

        }
    }
}