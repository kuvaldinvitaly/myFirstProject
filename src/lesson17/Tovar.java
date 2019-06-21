package lesson17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Tovar {
    private String mainName;
    private String articul;
    private LinkedHashSet<Haracteristika> haracteristiks = new LinkedHashSet<>();
    private ArrayList<Foto> fotos = new ArrayList<>();
    private ArrayList<DopUsluga> dopUslugas = new ArrayList<>();
    private int ostatokNaSklade;
    private int priceFull;
    private int priceSale = -1;
    private String pathToImage;
    private String opisanie;
    private ArrayList<Otsiv> otsivs = new ArrayList<>();


    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getOstatokNaSklade() {
        return ostatokNaSklade;
    }

    public void setOstatokNaSklade(int ostatokNaSklade) {
        this.ostatokNaSklade = ostatokNaSklade;
    }

    public int getPriceFull() {
        return priceFull;
    }

    public void setPriceFull(int priceFull) {
        this.priceFull = priceFull;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public void addOtsiv(Otsiv otsiv){
        otsivs.add(otsiv);

    }

    public void addHarakteristika(Haracteristika haracteristika){
        haracteristiks.add(haracteristika);

    }


    public void addFoto(Foto foto){
        fotos.add(foto);
    }


    public void printSrednRate (){

        int summaRate = 0;
        for(int i = 0; i < otsivs.size(); i++){
            summaRate = summaRate + otsivs.get(i).getReiting();

        }
        double srednRate = (double)summaRate / otsivs.size();
        System.out.println("Средний рейтинг товара: " + srednRate);

    }


    public void printOtsiviByRate(){
        TreeSet<Otsiv> sortByOtsivs = new TreeSet<>(new SortByRateComparator());
        sortByOtsivs.addAll(otsivs);
        for (Otsiv o : sortByOtsivs){
            System.out.println(o);
        }

    }
}
