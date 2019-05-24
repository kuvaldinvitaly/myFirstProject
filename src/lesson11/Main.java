package lesson11;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(100000);

        Tiger tiger = new Tiger(20000, 500);
        Popugay popugay1 = new Popugay(40000, 2);
        Popugay popugay2 = new Popugay(10000, 3);
        Monkey monkey1 = new Monkey(20000, 60);
        Monkey monkey2 = new Monkey(12000, 120);

        zoo.byeAnomal(popugay1);
        zoo.byeAnomal(popugay2);
        zoo.byeAnomal(monkey1);
        zoo.byeAnomal(tiger);
        zoo.byeAnomal(monkey2);

        zoo.printAnimal();
        zoo.voice();
        zoo.mostExpensiveAnimal();
        zoo.summaStoimostiAll();
        zoo.mostCheapAnimal();
        zoo.summaPosleVsexPokupok();
        zoo.mostWeightAnimal();
    }


}
