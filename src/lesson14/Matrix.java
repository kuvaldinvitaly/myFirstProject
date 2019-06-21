package lesson14;

public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix(int row, int column) {
        numbers = new double[row][column];

    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if(rowIndex >= this.getRows()){
            throw new IndexOutOfBoundsException("Индекс строки превышает количество строк");
        }
        if (colIndex >= this.getColumns()){
            throw new IndexOutOfBoundsException("Индекс колонки превышает количество строк");
        }


        return numbers[rowIndex][colIndex];


    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;


    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { //main2
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает:(");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = this.getValueAt(i, j) + otherMatrix.getValueAt(i, j);
                result.setValueAt(i, j, value);
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { //main3
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает:(");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает  ");
            return null;
        }

        Matrix result1 = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = this.getValueAt(i, j) - otherMatrix.getValueAt(i, j);
                result1.setValueAt(i, j, value);
            }
        }

        return result1;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { //main4
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Кол-во столбцов и строк не совпадает: (");
            return null;
        }
        Matrix result2 = new Matrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < this.getRows(); i++) {         // rows from m1
            for (int j = 0; j < otherMatrix.getColumns(); j++) {     // columns from m2
                for (int k = 0; k < this.getColumns(); k++) { // columns from m1

                    double value = result2.getValueAt(i, j) + this.getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                    result2.setValueAt(i, j, value);
                }

            }
        }
        return result2;
    }

    @Override
    public IMatrix mul(double value) { //main5
        Matrix newMatrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                double value1 = this.getValueAt(i, j) * value;
                newMatrix.setValueAt(i, j, value1);
            }

        }
       return newMatrix;

    }

    @Override
    public IMatrix transpose() { //main5

        Matrix newMatrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                double value1 = this.getValueAt(i, j);
                newMatrix.setValueAt(j, i, value1);
            }

        }
        return newMatrix;


    }

    @Override
    public void fillMatrix(double value) { //main5

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
              numbers[i][j] = value;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() { //main5
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (numbers[i][j] != 0) {
                        return false;
                    }

            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (this.getColumns() != this.getColumns()) {
            return false;
        }
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() { //main5
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getRows() != this.getRows()) {
                    return false;
                }

            }
        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}