package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int vseDengi = 1000;
        int pizza = 230;
        int orbit = 26;
        double konfeta = 2.5;

        int restByPizza = vseDengi % pizza;
        System.out.println(restByPizza);
        pizza++;
        ++pizza;
        System.out.println(pizza);
        System.out.println(++pizza);
        System.out.println(pizza);

        pizza += 5;
        System.out.println(pizza);


    }
}

