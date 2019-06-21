package lesson14;

public class Main2 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        matrix1.setValueAt(0,0,3.0);
        matrix1.setValueAt(0,1,5.0);
        matrix1.setValueAt(0,2,7.0);

        matrix1.setValueAt(1,0,2.0);
        matrix1.setValueAt(1,1,-1.0);
        matrix1.setValueAt(1,2,0.0);

        matrix1.setValueAt(2,0,4.0);
        matrix1.setValueAt(2,1,3.0);
        matrix1.setValueAt(2,2,2.0);

        Matrix matrix2 = new Matrix(3,3);
        matrix2.setValueAt(0,0,1.0);
        matrix2.setValueAt(0,1,2.0);
        matrix2.setValueAt(0,2,4.0);

        matrix2.setValueAt(1,0,2.0);
        matrix2.setValueAt(1,1,3.0);
        matrix2.setValueAt(1,2,-2.0);

        matrix2.setValueAt(2,0,-1.0);
        matrix2.setValueAt(2,1,0.0);
        matrix2.setValueAt(2,2,1.0);

       IMatrix result = matrix1.add(matrix2);
       result.printToConsole();

    }
}
