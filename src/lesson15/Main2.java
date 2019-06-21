package lesson15;

import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(4324);
        numbers.add(4653);
        numbers.add(4234);
        numbers.add(47445);

// первый способо - for each

    for (Integer n:numbers){
        System.out.println(n);
    }
        System.out.println("--------");

// второй способ - for

        for (int i = 0; i <numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("--------");


        // с помощью Итератора
        for(Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());

        }


    }



}
