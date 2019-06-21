import java.io.File;
import java.io.FileFilter;

public class Main2 {
    public static void main(String[] args) {
        File src = new File("src");
        File[] allFiles = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()){
                    return false;
                }
                if (pathname.getName().startsWith("lesson")){
                    return true;
                }
                return false;
            }
        });

        for (File f:allFiles){
            System.out.println(f.getName());
        }


    }
}
