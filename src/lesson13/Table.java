package lesson13;

public class Table {

    private int height;
    private int lenght;
    private int width;

    public Table() {
    }

    public Table(int height, int lenght, int width) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;

        Table table = (Table) o;

        if (getHeight() != table.getHeight()) return false;
        if (getLenght() != table.getLenght()) return false;
        return getWidth() == table.getWidth();

    }

    @Override
    public int hashCode() {
        int result = getHeight();
        result = 31 * result + getLenght();
        result = 31 * result + getWidth();
        return result;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", lenght=" + lenght +
                ", width=" + width +
                '}';
    }
}
