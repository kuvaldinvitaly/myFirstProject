package lesoon18_1;

import java.util.HashMap;
import java.util.Map;

public class Tournir {
    private HashMap<String, Integer> table = new HashMap<>();

    public void addComand(String nameComand, int ball) {

        if (table.containsKey(nameComand)) {
            int currentBall = table.get(nameComand);
            table.put(nameComand, (ball + currentBall));

        } else {
            table.put(nameComand, ball);
        }

    }

    public void printToConsolRate() {
        for (String komanda : table.keySet()) {
            System.out.println(komanda + " - " + table.get(komanda));

        }


    }

    public void printToChampion() {
        int championBall = 0;
        String championComand = null;
        for (String komanda : table.keySet()) {
            if (championBall < table.get(komanda)) {
                championBall = table.get(komanda);
                championComand = komanda;

            }


        }
        System.out.println("Победитель турнира - " + championComand + "  " + championBall);

    }

    public void minusBall(String name, int ball) {
        if (table.containsKey(name)) {
            int currentBall = table.get(name);
            if (currentBall > ball) {
                table.put(name, currentBall - ball);
            } else {
                table.put(name, 0);
            }
        } else {
            System.out.println("Данной команды нет в рейтинге");

        }


    }

    public void sredniiBall() {
        int summaSrednZnachenie = 0;

        for (String key : table.keySet()) {
            summaSrednZnachenie += table.get(key);

        }
        double sredneeZnachenie = (double) summaSrednZnachenie / table.size();
        System.out.println(sredneeZnachenie);
    }


    public void printToTurnirTable (){

        table.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }


}
