package lesson17;

import java.util.Comparator;

public class SortByRateComparator implements Comparator<Otsiv> {

    @Override
    public int compare(Otsiv o1, Otsiv o2) {
        if (o1.getReiting() != o2.getReiting()){
            return o1.getReiting() - o2.getReiting();
        }

        return o1.getOtsiv().compareTo(o2.getOtsiv());
    }
}
