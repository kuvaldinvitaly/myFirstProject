package lesson11;

public class Monkey extends ZooAnimal{

    public Monkey() {
    }

    public Monkey(int cost,int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("dfgdgfd");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Обезьяна стоимостью = " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Обезьяна весом " + this.getWeight());
    }
}
