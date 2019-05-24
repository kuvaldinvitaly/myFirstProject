package lesson4;

public class Mai5 {
    public static void main(String[] args) {

        String text = "I am, learning  java!233 dfe, ..";
        String text1 = text.replace(",", " ");
        String text2 = text1.replace("  ", " ");
        String text3 = text2.replace("!", "");
        String text4 = text3.replace(".", "");


        String[] worlds = text4.split(" ");
//       for (int i = 0; i < worlds.length; i++){
//        System.out.println(worlds[i]);}
//    }
        for (String currenText : worlds) {
            System.out.println(currenText);
        }


    }
}