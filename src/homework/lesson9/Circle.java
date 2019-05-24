package homework.lesson9;

public class Circle {
    private double radius;
    private double diametr;
    private double dlinaOkrugnosti;

    public Circle() {
    }

    public Circle(double rad, double diam, double dlOkr) {
        radius = rad;
        diametr = diam;
        dlinaOkrugnosti = dlOkr;
    }

    public void setRadius (double newRadius){
        radius = newRadius;
    }
    public double getRadius () {
        return radius;
    }

    public void setDiametr (double newDiametr) {
        diametr = newDiametr;
    }
    public double getDiametr () {
        return diametr;
    }

    public void setDlinaOkrugnosti (double newDlinaOkrugnosti) {
        dlinaOkrugnosti = newDlinaOkrugnosti;
    }
    public double getDlinaOkrugnosti () {
        return dlinaOkrugnosti;
    }
}
