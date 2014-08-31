import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.function.*;

public class FileFilterDemo {
    
    public static void main(String[] args) {
       //getFilesFromDir(); 
       //filterFilesWithFileFilter();
       filterFilesWithLambda();
    }

    private static void getFilesFromDir() {
        File dir = new File("/Users/sean/work/tests/java/java8newfeature");
        System.out.println(dir.isDirectory());
        if(dir.isDirectory()) {
            for(File f : dir.listFiles()) {
                System.out.println(f);
            }
        }
    }

    private static void filterFilesWithFileFilter() {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };
        File dir = new File("/Users/sean/work/tests/java/java8newfeature");
        File[] files = dir.listFiles(filter);
        for (File f : files) {
            System.out.println(f);
        }
    }

    private static void filterFilesWithLambda() {
        File dir = new File("/Users/sean/work/tests/java/java8newfeature");
        File[] files = dir.listFiles(file -> file.getName().endsWith(".java"));
        List<File> lists = Arrays.asList(files);
        lists.forEach(System.out::println);
    }


}

