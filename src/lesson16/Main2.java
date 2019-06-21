package lesson16;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<String> texts = new TreeSet<>();
        texts.add("qqqqqqq");
        texts.add("aaaaaaaaa");
        texts.add("rrrrrrr");
        texts.add("vvvvvvvvv");

        for (String s: texts){
            System.out.println(s);
        }

    }
}
