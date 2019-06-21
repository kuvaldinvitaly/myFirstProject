package lesson14;

public class Main5 {

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        matrix1.setValueAt(0,0,2.0);
        matrix1.setValueAt(0,1,3.0);
        matrix1.setValueAt(0,2,5.0);

        matrix1.setValueAt(1,0,1.0);
        matrix1.setValueAt(1,1,-4.0);
        matrix1.setValueAt(1,2,4.0);

        matrix1.setValueAt(2,0,0.0);
        matrix1.setValueAt(2,1,6.0);
        matrix1.setValueAt(2,2,7.0);

        IMatrix result = matrix1.mul(5);
        result.printToConsole();


        Matrix matrix2 = new Matrix(3,3);
        matrix2.setValueAt(0,0,2.0);
        matrix2.setValueAt(0,1,3.0);
        matrix2.setValueAt(0,2,5.0);

        matrix2.setValueAt(1,0,1.0);
        matrix2.setValueAt(1,1,-4.0);
        matrix2.setValueAt(1,2,4.0);

        matrix2.setValueAt(2,0,0.0);
        matrix2.setValueAt(2,1,6.0);
        matrix2.setValueAt(2,2,7.0);

        IMatrix result1 = matrix2.transpose();
        result1.printToConsole();


matrix1.fillMatrix(1);


        System.out.println(matrix1.isNullMatrix());

        System.out.println(matrix1.isSquareMatrix());

    }



}



