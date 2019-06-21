package homework.lesson13;

public class MatrixImpl implements IMatrix {

    private int rows;
    private int columns;
    private double[][] matrix;
    private double valueAt;


    public MatrixImpl() {
    }

    public MatrixImpl(int rows, int columns) {
        this.rows = rows; //строка
        this.columns = columns; //столбец
    }

    public MatrixImpl(double[][] matrix) {
        this.matrix = matrix;

    }

    public MatrixImpl(double valueAt) {
        this.valueAt = valueAt;
    }



    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        double matrixEl = matrix[rowIndex][colIndex];
        return matrixEl;

    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        matrix[rowIndex][colIndex] = value;

        this.valueAt = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

            }
        }

        return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
