package homework.lesson9;

public class Triangle {
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private int visota;

    public Triangle() {
    }

    public Triangle(int firstSi, int secondSi, int thirdSi, int visot) {
        firstSide = firstSi;
        secondSide = secondSi;
        thirdSide = thirdSi;
        visota = visot;
    }

    public void setFirstSide(int newFirstSide) {
        firstSide = newFirstSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setSecondSide(int newSecondSide) {
        secondSide = newSecondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setThirdSide(int newThirdSide) {
        thirdSide = newThirdSide;
    }

    public int getThirdSide (){
        return thirdSide;
    }

    public void setVisota (int newVisota){
        visota = newVisota;
    }
    public int getVisota (){
        return visota;
    }
}
