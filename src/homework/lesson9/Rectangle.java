package homework.lesson9;

public class Rectangle {
    private int longSide;
    private int shortSide;
    private double diagonal;

    public Rectangle () {
    }

    public Rectangle (int longSi, int shortSi, double diagon) {
        longSide = longSi;
        shortSide = shortSi;
        diagonal = diagon;
    }

    public void setLongSide (int newLongSide) {
        longSide = newLongSide;
    }
    public int getLongSide (){
        return longSide;
    }

    public void setShortSide (int newShortSide) {
        shortSide = newShortSide;
    }
    public int getShortSideSide (){
        return shortSide;
    }

    public void setDiagonal (double newDiagonal) {
        diagonal = newDiagonal;
    }
    public double getDiagonal (){
        return diagonal;
    }
}
