package lesson20;

import java.io.File;

public class Main1 {
    public static void main(String[] args) {
        File startDir = new File("resources-2");
        if (!startDir.exists()){
            startDir.mkdir();

        }

        File[] allFiles = startDir.listFiles();
        for (File file:allFiles){
            System.out.println(file.getName());
        }


    }
}
