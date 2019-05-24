package homework.lesson9;

public class Square {
    private int firstSide;
    private int secondSide;

    public Square (){
    }

    public Square (int firstSi, int secondSi){
        firstSide = firstSi;
        secondSide = secondSi;
    }

    public void setFirstSide (int newFirstSide){
        firstSide = newFirstSide;
    }
    public int getFirstSide (){
        return firstSide;
    }

    public void setSecondSide (int newSecondSide){
        secondSide = newSecondSide;
    }
    public int getSecondSide (){
        return secondSide;
    }

}
