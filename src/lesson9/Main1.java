package lesson9;

public class Main1 {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setPrice(10000);
        saomi.setPrice(8000);


        System.out.println(meizu.getPrice());


        meizu.setDiagonal(4.5);
        System.out.println(meizu.getDiagonal());


    }
}
