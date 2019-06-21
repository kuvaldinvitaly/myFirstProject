package lesson15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<String> texts = new LinkedHashSet<>();
        texts.add("qwwwa");
        texts.add("s");
        texts.add("d");
        texts.add("a");
        texts.add("qwwwa");



        for (String t : texts) {
            System.out.println(t);

        }
    }
}
