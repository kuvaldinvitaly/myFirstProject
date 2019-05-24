package lesson11;

public class Zoo {
    private int money;

    private ZooAnimal[] animals = new ZooAnimal[10];

    public Zoo() {
    }

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void byeAnomal(ZooAnimal animal) {
        if (money < animal.getCost()) {
            System.out.println("Где деньги??!");
            return;
        }


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                money = money - animal.getCost();
                return;
            }

        }
        System.out.println("Нет сводобных клеток!!!");

    }

    public void printAnimal() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }
    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();
            }
        }
    }

    public void mostExpensiveAnimal() {
        ZooAnimal maxCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals[i].getCost()) {

                    maxCostAnimal = animals[i];
                }

            }
        }
        System.out.println("Самое дорогое животное: ");
        maxCostAnimal.printInfo();

    }

    public void summaStoimostiAll() {
        int summa = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                summa = summa + animals[i].getCost();

            }

        }
        System.out.println("Стоимость всех животных: " + summa);
    }

    public void mostCheapAnimal() {
        ZooAnimal minCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (minCostAnimal.getCost() > animals[i].getCost()) {

                    minCostAnimal = animals[i];
                }

            }
        }
        System.out.println("Самое дешевое животное: ");
        minCostAnimal.printInfo();

    }

    public void summaPosleVsexPokupok() {
        System.out.println("Сумма после покупок животных: " + money);
    }

    public void mostWeightAnimal() {
        ZooAnimal maxWeightAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxWeightAnimal.getWeight() < animals[i].getWeight()) {

                    maxWeightAnimal = animals[i];
                }

            }
        }
        System.out.println("Самое тяжелое животное: ");
        maxWeightAnimal.printWeight();

    }
}