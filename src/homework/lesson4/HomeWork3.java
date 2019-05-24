package homework.lesson4;

public class HomeWork3 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        char[] array1 = new char[array.length];
//        array1[0] = array[3];
//        array1[1] = array[2];
//        array1[2] = array[1];
//        array1[3] = array[0];

        for (int i = 0, j = 3; i < 4; i++, j--) {
            array1[i] = array[j];
            System.out.println(array1[i]);
        }

    }
}
