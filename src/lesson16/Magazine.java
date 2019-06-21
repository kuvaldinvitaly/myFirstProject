package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class Magazine {
    private HashSet<Tovar> tovars = new HashSet<>();

    public Magazine() {
    }

    public void addTovar(Tovar tovar){
        tovars.add(tovar);
    }

    public void printTovarsByPriceHiToLow(){
        TreeSet<Tovar> tovarsHiToLow = new TreeSet<>(new CompareHiToLow());
        tovarsHiToLow.addAll(tovars);

        for (Tovar tovar : tovarsHiToLow){
            System.out.println(tovar);
        }
    }

    public void printTovarsByPriceLowToHi(){
        TreeSet<Tovar> tovarsLowToHi = new TreeSet<>(new CompareLowToHi());
        tovarsLowToHi.addAll(tovars);

        for (Tovar tovar : tovarsLowToHi){
            System.out.println(tovar);
        }
    }


    public void printTovarByName (){
        TreeSet<Tovar> tovarsByName = new TreeSet<>(new CompareByName());
        tovarsByName.addAll(tovars);

        for (Tovar tovar: tovarsByName){
            System.out.println(tovar);
        }
    }

    public void printTovarByRate(){
        TreeSet<Tovar> tovarsByRate = new TreeSet<>(new CompareByRate());
        tovarsByRate.addAll(tovars);

        for (Tovar tovar: tovarsByRate){
            System.out.println(tovar);
        }
    }




}
