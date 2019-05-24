package homework.lesson4;

public class HomeWork4 {
    public static void main(String[] args) {

        String text = "Are you ready to start studying of programming?";
        String text1 = text.toLowerCase();
        char[] array = {'a', 'b', 'c', 'd'};
        char[] array1 = {'q', 'w', 'e', 'r'};

        for (int i = 0; i < array1.length; i++) {
            text1 = text1.replace(array[i], array1[i]);

        }
        System.out.println(text1);
//        String text3 = text2.replace(array[1], array1[1]);
//        String text4 = text3.replace(array[2], array1[2]);
//        String text5 = text4.replace(array[3], array1[3]);
//        System.out.println(text5);
//
//       char[] array3 = text1.toCharArray();
//       for (int i )

//        char[] array3 = text1.toCharArray();
//        for (int i = 0; i < array3.length; i++) {
//            if (array3[i] == array[0]) {
//                array3[i] = array1[0];
//                System.out.print(array3[i]);
//            } else if (array3[i] == array[1]) {
//                array3[i] = array1[1];
//                System.out.print(array3[i]);
//            } else if (array3[i] == array[2]) {
//                array3[i] = array1[2];
//                System.out.print(array3[i]);
//            } else if (array3[i] == array[3]) {
//                array3[i] = array1[3];
//                System.out.print(array3[i]);
//            } else {
//                System.out.print(array3[i]);
//            }


    }
}