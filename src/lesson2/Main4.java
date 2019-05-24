package lesson2;

public class Main4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 9;

        if(a == b && b == c && c == a){
            System.out.println("Это равносторонний треугольник");
        }

        if((a !=b) && (c != a) && (b != c)){
            System.out.println("Это разносторонний");
        }

        if((a == b && b != c) || (b == c && c != a) || (a == c && c != b)){
            System.out.println("Это равнобедренный");
        }
    }
}
