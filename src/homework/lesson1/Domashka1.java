package homework.lesson1;

public class Domashka1 {
    public static void main(String[] args) {
        int vseDengi = 1000;
        int pizza = 230;
        int orbit = 26;
        double konfeta = 2.5;
        int pervaiaPokupka = vseDengi / pizza;//1000/230=4
        int ostatok1 = vseDengi - pervaiaPokupka * pizza;//1000-4*230=80
        int vtoraiaPokupka = ostatok1 / orbit;//80/26=3
        int ostatok2 = ostatok1 - vtoraiaPokupka * orbit;//80-3*26=2
        double tretiaPokupka = ostatok2 / konfeta; //2/2.5=0.26
        int b = (int) tretiaPokupka;
        int k = (int) konfeta;
        int ostatok3 = ostatok2 - b * k;//2-0*2.5


        System.out.println("На эти деньги мы можем купить: ");
        System.out.println("-" + pervaiaPokupka + " пиццы");
        System.out.println("-" + vtoraiaPokupka + " жвачки");
        System.out.println("-" + b + " конфет");
        System.out.println("Сдача с магазина: " + ostatok3 + " рубля.");
    }
}
