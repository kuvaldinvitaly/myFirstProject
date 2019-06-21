package lesson20;

public class Main3 {
    public static void main(String[] args) {
        FileCopyUtil1 utils1 = new FileCopyUtil1();
        try{
            utils1.copyFile("resources/data.txt", "resources/data-1.txt");
        }catch (FileCopyFailedException e){
            e.printStackTrace();
        }
    }
}
