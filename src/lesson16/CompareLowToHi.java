package lesson16;

import java.util.Comparator;

public class CompareLowToHi implements Comparator<Tovar> {


    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o2.getPrice() != o1.getPrice()){
            return o1.getPrice() - o2.getPrice();
        }

        if (!(o2.getName().equals(o1.getName()))){
            return o1.getName().compareTo(o2.getName());
        }



        return o1.getRate() - o2.getRate();
    }
}
