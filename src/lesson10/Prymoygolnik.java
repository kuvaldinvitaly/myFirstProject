package lesson10;

public class Prymoygolnik extends Figura {
    private int a;
    private int b;

    public Prymoygolnik(){

    }
    public Prymoygolnik(int a, int b){
        this.a = a;
        this.b = b;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    @Override
    public void printPloshad() {
        System.out.println("Площадь прямоугольника: " + (a * b));
    }

    @Override
    public void printPerimetr() {
        System.out.println("Периметр прямоугольника: " + (a + b) * 2);
    }
}
