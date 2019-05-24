package homework.lesson9;

public class Main1 {
    public static void main(String[] args) {
        Circle smallCircle = new Circle(45.0, 90.0, 12);
        smallCircle.setDiametr(50);
        System.out.println(smallCircle.getDiametr() + " " + (smallCircle.getDlinaOkrugnosti()));

        Rectangle bigBoss = new Rectangle(12, 5, 15.0);
        bigBoss.setDiagonal(16);
        System.out.println(bigBoss.getDiagonal() + " " + bigBoss.getLongSide());

        Triangle treugolnik = new Triangle(12, 20, 6, 77);
        treugolnik.setFirstSide(9);
        System.out.println(treugolnik.getFirstSide() + " " + treugolnik.getVisota());

        Square kvadrat = new Square(500, 500);
        kvadrat.setFirstSide(450);
        System.out.println(kvadrat.getFirstSide() + " " + kvadrat.getSecondSide());



    }


}

