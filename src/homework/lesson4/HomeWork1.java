package homework.lesson4;

public class HomeWork1 {

    public static void main(String[] args) {

        String text = "I am happy to learning java";
        String[] worlds = text.split(" ");
        for (int i = worlds.length - 1; i >= 0; i--) {
            System.out.println(worlds[i]);
        }

    }
}
