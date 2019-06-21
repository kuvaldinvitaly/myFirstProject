package homework.lesson13;

public class Main {
    public static void main(String[] args) {
        double [][] matrix = {{1.11, 5.76, 6.0, 1.76},{2.65, 5.55, 7.77, 1.11}};
        MatrixImpl matrix1 = new MatrixImpl(matrix);
        double returnElement = matrix1.getValueAt(0,3);
        System.out.println(returnElement);

        matrix1.setValueAt(0,1,2222.3333);
        System.out.println(matrix[0][1]);
    }
}
