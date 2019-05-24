package lesson11;

public class Tiger extends ZooAnimal{

    public Tiger() {
    super();

    }


    public Tiger(int cost, int weight) {
    super(cost, weight);
    }


    @Override
    public void voice() {
        System.out.println("edfgemrhprthmpprosmn");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Тигр со стоимостью = " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Тигр весом " + this.getWeight());

    }
}
