package lesson11;

public class Popugay extends ZooAnimal {

    public Popugay() {
    }

    public Popugay(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("wgsdgsgsdg2wetgnkjoprhk");
    }

    @Override
    public void jump() {
        System.out.println("Ара прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Ара стоимостью = " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Попугай весом " + this.getWeight());

    }
}
